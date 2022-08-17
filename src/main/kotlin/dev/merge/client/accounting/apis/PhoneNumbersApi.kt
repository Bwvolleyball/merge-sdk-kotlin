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

import dev.merge.client.accounting.models.AccountingPhoneNumber

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class PhoneNumbersApi(
baseUrl: String = ApiClient.BASE_URL + "accounting/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class PhoneNumbersRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Returns an &#x60;AccountingPhoneNumber&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return AccountingPhoneNumber
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun phoneNumbersRetrieve(requestModel: PhoneNumbersApi.PhoneNumbersRetrieveRequest): AccountingPhoneNumber {
        return phoneNumbersRetrieveImpl(requestModel)
    }

    /**
     * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun phoneNumbersRetrieveExpanded(requestModel: PhoneNumbersApi.PhoneNumbersRetrieveRequest): AccountingPhoneNumber.Expanded {
        return phoneNumbersRetrieveImpl(requestModel)
    }

    private suspend inline fun <reified T> phoneNumbersRetrieveImpl(requestModel: PhoneNumbersApi.PhoneNumbersRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/phone-numbers/{id}".replace("{" + "id" + "}", "$requestModel.id"),
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
