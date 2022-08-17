/**
 * Merge HRIS API
 *
 * The unified API for building rich integrations with multiple HR Information System platforms.
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

package dev.merge.client.hris.apis

import dev.merge.client.hris.models.EndUserDetailsRequest
import dev.merge.client.hris.models.LinkToken

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class LinkTokenApi(
baseUrl: String = ApiClient.BASE_URL + "hris/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class LinkTokenCreateRequest (
        val endUserDetailsRequest: EndUserDetailsRequest
    )

    /**
    * 
    * Creates a link token to be used when linking a new end user.
     * @param endUserDetailsRequest  
     * @return LinkToken
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun linkTokenCreate(requestModel: LinkTokenApi.LinkTokenCreateRequest): LinkToken {
        return linkTokenCreateImpl(requestModel)
    }

    /**
     * @param endUserDetailsRequest  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun linkTokenCreateExpanded(requestModel: LinkTokenApi.LinkTokenCreateRequest): LinkToken.Expanded {
        return linkTokenCreateImpl(requestModel)
    }

    private suspend inline fun <reified T> linkTokenCreateImpl(requestModel: LinkTokenApi.LinkTokenCreateRequest): T {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = requestModel.endUserDetailsRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/link-token",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
