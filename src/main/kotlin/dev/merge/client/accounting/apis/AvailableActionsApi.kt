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

import dev.merge.client.accounting.models.AvailableActions

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

open class AvailableActionsApi(
baseUrl: String = ApiClient.BASE_URL + "accounting/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    /**
    * 
    * Returns a list of models and actions available for an account.
     * @return AvailableActions
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun availableActionsRetrieve(): AvailableActions {
        return availableActionsRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun availableActionsRetrieveAsync(): CompletableFuture<AvailableActions> = GlobalScope.future {
        availableActionsRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun availableActionsRetrieveExpanded(): AvailableActions.Expanded {
        return availableActionsRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun availableActionsRetrieveExpandedAsync(): CompletableFuture<AvailableActions.Expanded> = GlobalScope.future {
        availableActionsRetrieveExpanded()
    }

    private suspend inline fun <reified T> availableActionsRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/available-actions",
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
