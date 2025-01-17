/**
 * Merge Marketing Automation API
 *
 * The unified API for building rich integrations with multiple Marketing Automation platforms.
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

package dev.merge.client.mktg.apis

import dev.merge.client.mktg.models.SyncStatus

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

open class SyncStatusApi(
baseUrl: String = ApiClient.BASE_URL + "mktg/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class SyncStatusListRequest (
        val cursor: kotlin.String? = null,
        val pageSize: kotlin.Int? = null
    )

    /**
    * 
    * Get syncing status. Possible values: &#x60;DISABLED&#x60;, &#x60;DONE&#x60;, &#x60;FAILED&#x60;, &#x60;PAUSED&#x60;, &#x60;SYNCING&#x60;
     * @param cursor The pagination cursor value. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return PaginatedSyncStatusList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun syncStatusList(requestModel: SyncStatusApi.SyncStatusListRequest): MergePaginatedResponse<SyncStatus> {
        return syncStatusListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun syncStatusListAsync(requestModel: SyncStatusApi.SyncStatusListRequest): CompletableFuture<MergePaginatedResponse<SyncStatus>> = GlobalScope.future {
        syncStatusList(requestModel)
    }

    /**
     * @param cursor The pagination cursor value. (optional) * @param pageSize Number of results to return per page. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun syncStatusListExpanded(requestModel: SyncStatusApi.SyncStatusListRequest): MergePaginatedResponse<SyncStatus.Expanded> {
        return syncStatusListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun syncStatusListExpandedAsync(requestModel: SyncStatusApi.SyncStatusListRequest): CompletableFuture<MergePaginatedResponse<SyncStatus.Expanded>> = GlobalScope.future {
        syncStatusListExpanded(requestModel)
    }

    private suspend inline fun <reified T> syncStatusListImpl(requestModel: SyncStatusApi.SyncStatusListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/sync-status",
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
