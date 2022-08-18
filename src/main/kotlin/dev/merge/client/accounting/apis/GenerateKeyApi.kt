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

import dev.merge.client.accounting.models.GenerateRemoteKeyRequest
import dev.merge.client.accounting.models.RemoteKey

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.future.future
import java.util.concurrent.CompletableFuture

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class GenerateKeyApi(
baseUrl: String = ApiClient.BASE_URL + "accounting/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class GenerateKeyCreateRequest (
        val generateRemoteKeyRequest: GenerateRemoteKeyRequest
    )

    /**
    * 
    * Create a remote key.
     * @param generateRemoteKeyRequest  
     * @return RemoteKey
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun generateKeyCreate(requestModel: GenerateKeyApi.GenerateKeyCreateRequest): RemoteKey {
        return generateKeyCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun generateKeyCreateAsync(requestModel: GenerateKeyApi.GenerateKeyCreateRequest): CompletableFuture<RemoteKey> = GlobalScope.future {
        generateKeyCreate(requestModel)
    }

    /**
     * @param generateRemoteKeyRequest  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun generateKeyCreateExpanded(requestModel: GenerateKeyApi.GenerateKeyCreateRequest): RemoteKey.Expanded {
        return generateKeyCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun generateKeyCreateExpandedAsync(requestModel: GenerateKeyApi.GenerateKeyCreateRequest): CompletableFuture<RemoteKey.Expanded> = GlobalScope.future {
        generateKeyCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> generateKeyCreateImpl(requestModel: GenerateKeyApi.GenerateKeyCreateRequest): T {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = requestModel.generateRemoteKeyRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/generate-key",
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