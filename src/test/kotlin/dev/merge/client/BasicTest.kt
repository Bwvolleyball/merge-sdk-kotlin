import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

import dev.merge.client.accounting.apis.AccountsApi
import dev.merge.client.ats.apis.CandidatesApi
import dev.merge.client.ats.models.Application
import dev.merge.client.crm.apis.ContactsApi
import dev.merge.client.hris.apis.EmployeesApi
import dev.merge.client.ticketing.apis.TicketsApi
import io.ktor.client.plugins.*
import io.ktor.http.*
import kotlinx.coroutines.async
import kotlin.test.assertTrue

internal class BasicTest {
    @Test
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    fun testAllCategoriesSimple() = runTest {
        val mapper = ObjectMapper()
        mapper.findAndRegisterModules()
        mapper.enable(SerializationFeature.INDENT_OUTPUT)

        val apiKey = "REDACTED"

        val accountsApi = AccountsApi()
        accountsApi.setApiKey(apiKey)
        accountsApi.setAccountToken("REDACTED")

        val candidatesApi = CandidatesApi()
        candidatesApi.setApiKey(apiKey)
        candidatesApi.setAccountToken("REDACTED")

        val contactsApi = ContactsApi()
        contactsApi.setApiKey(apiKey)
        contactsApi.setAccountToken("REDACTED")

        val employeesApi = EmployeesApi()
        employeesApi.setApiKey(apiKey)
        employeesApi.setAccountToken("REDACTED")

        val ticketsApi = TicketsApi()
        ticketsApi.setApiKey(apiKey)
        ticketsApi.setAccountToken("REDACTED")

        // make requests async

        val accountingAccountsPromise = async { accountsApi.accountsList(AccountsApi.AccountsListRequest()) }

        val atsCandidatesExpandedPromise = async {
            candidatesApi.candidatesListExpanded(CandidatesApi.CandidatesListRequest(
                expand="applications"
            ))
        }

        val crmContactsPromise = async { contactsApi.contactsList(ContactsApi.ContactsListRequest()) }

        val hrisEmployeesPromise = async { employeesApi.employeesList(EmployeesApi.EmployeesListRequest()) }

        val ticketingFilterProjects = "aa5e3566-6590-483f-b8c8-e10e30a0c7b6"
        val ticketingTicketsPromise = async { ticketsApi.ticketsList(TicketsApi.TicketsListRequest(
            projectId = ticketingFilterProjects
        )) }

        // check all results

        // vanilla accounting category call
        val accountingAccountsResponse = accountingAccountsPromise.await()

        assertNotNull(accountingAccountsResponse)
        assertNotNull(accountingAccountsResponse.results)
        println(mapper.writeValueAsString(accountingAccountsResponse))

        // get candidates with expand=applications, check we have an expanded application sub object
        val atsCandidatesExpandedResponse = atsCandidatesExpandedPromise.await()

        assertNotNull(atsCandidatesExpandedResponse)
        assertNotNull(atsCandidatesExpandedResponse.results)
        println(mapper.writeValueAsString(atsCandidatesExpandedResponse))

        var atLeastOneExpandedApplication = false
        for (candidate in atsCandidatesExpandedResponse.results ?: listOf()) {
            if (candidate.applications?.isNotEmpty() == true) {
                val applicationFromExpandedCandidate = mapper.convertValue(
                    candidate.applications?.first(),
                    Application::class.java
                )

                assertNotNull(applicationFromExpandedCandidate)
                atLeastOneExpandedApplication = true
            }
        }
        assertTrue(atLeastOneExpandedApplication)

        // vanilla crm contacts call
        val crmContactsResponse = crmContactsPromise.await()

        assertNotNull(crmContactsResponse)
        assertNotNull(crmContactsResponse.results)
        println(mapper.writeValueAsString(crmContactsResponse))

        contactsApi.setAccountToken("invalid")
        // call this one non-async since we can do that
        val invalidCrmContactsResponse = kotlin.runCatching {
            contactsApi.contactsList(ContactsApi.ContactsListRequest())
        }.onFailure {
            assertEquals(it::class, ClientRequestException::class)
            val ktorException = it as ClientRequestException
            assertEquals(HttpStatusCode.Unauthorized, ktorException.response.status)
        }

        // hris call and then check second page
        val hrisEmployeesResponse = hrisEmployeesPromise.await()

        assertNotNull(hrisEmployeesResponse)
        assertNotNull(hrisEmployeesResponse.results)
        println(mapper.writeValueAsString(hrisEmployeesResponse))

        assertNotNull(hrisEmployeesResponse.next)

        // call this one non-async since we can do that
        val hrisEmployeesPage2Response = employeesApi.employeesList(EmployeesApi.EmployeesListRequest(
            cursor = hrisEmployeesResponse.next
        ))

        assertNotNull(hrisEmployeesPage2Response)
        assertNotNull(hrisEmployeesPage2Response.results)
        assertNotNull(hrisEmployeesPage2Response.previous)
        println(mapper.writeValueAsString(hrisEmployeesPage2Response))

        // filtered ticketing call by project id
        val ticketingTicketsResponse = ticketingTicketsPromise.await()

        assertNotNull(ticketingTicketsResponse)
        assertNotNull(ticketingTicketsResponse.results)
        println(mapper.writeValueAsString(ticketingTicketsResponse))

        for (ticketingTicket in ticketingTicketsResponse.results ?: listOf()) {
            assertEquals(ticketingFilterProjects, ticketingTicket.project?.toString())
        }
    }
}