/**
 * Merge Accounting API
 *
 * The unified API for building rich integrations with multiple Accounting & Finance platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.merge.client.accounting.apis

import dev.merge.client.accounting.models.Invoice
import dev.merge.client.accounting.models.InvoiceEndpointRequest
import dev.merge.client.accounting.models.InvoiceResponse
import dev.merge.client.accounting.models.MetaResponse

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class InvoicesApi(
baseUrl: String = ApiClient.BASE_URL + "accounting/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class InvoicesCreateRequest (
        val invoiceEndpointRequest: InvoiceEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class InvoicesListRequest (
        val contactId: kotlin.String? = null,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val remoteFields: kotlin.String? = null,
        val remoteId: kotlin.String? = null,
        val type: kotlin.String? = null
    )

    data class InvoicesRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null,
        val remoteFields: kotlin.String? = null
    )

    /**
    * 
    * Creates an &#x60;Invoice&#x60; object with the given values.
     * @param invoiceEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return InvoiceResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun invoicesCreate(requestModel: InvoicesApi.InvoicesCreateRequest): InvoiceResponse {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.invoiceEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$requestModel?.isDebugMode") }
        requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$requestModel?.runAsync") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/invoices",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns a list of &#x60;Invoice&#x60; objects.
     * @param contactId If provided, will only return invoices for this contact. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param type If provided, will only return Invoices with this type (optional)
     * @return PaginatedInvoiceList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun invoicesList(requestModel: InvoicesApi.InvoicesListRequest): MergePaginatedResponse<Invoice> {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        requestModel.contactId?.apply { localVariableQuery["contact_id"] = listOf("$requestModel?.contactId") }
        requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$requestModel?.createdAfter") }
        requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$requestModel?.createdBefore") }
        requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf("$requestModel?.cursor") }
        requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$requestModel?.includeDeletedData") }
        requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$requestModel?.includeRemoteData") }
        requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$requestModel?.modifiedAfter") }
        requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$requestModel?.modifiedBefore") }
        requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$requestModel?.pageSize") }
        requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf("$requestModel?.remoteFields") }
        requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf("$requestModel?.remoteId") }
        requestModel.type?.apply { localVariableQuery["type"] = listOf("$requestModel?.type") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/invoices",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns metadata for &#x60;Invoice&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun invoicesMetaPostRetrieve(): MetaResponse {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/invoices/meta/post",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns an &#x60;Invoice&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @return Invoice
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun invoicesRetrieve(requestModel: InvoicesApi.InvoicesRetrieveRequest): Invoice {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$requestModel?.includeRemoteData") }
        requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf("$requestModel?.remoteFields") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/invoices/{id}".replace("{" + "id" + "}", "$requestModel.id"),
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
