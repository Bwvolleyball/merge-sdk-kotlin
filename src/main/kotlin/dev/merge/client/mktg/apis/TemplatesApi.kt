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

import dev.merge.client.mktg.models.MKTGTemplateEndpointRequest
import dev.merge.client.mktg.models.MKTGTemplateResponse
import dev.merge.client.mktg.models.MetaResponse
import dev.merge.client.mktg.models.Template

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

open class TemplatesApi(
baseUrl: String = ApiClient.BASE_URL + "mktg/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class TemplatesCreateRequest (
        val mkTGTemplateEndpointRequest: MKTGTemplateEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class TemplatesListRequest (
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val remoteId: kotlin.String? = null
    )

    data class TemplatesRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Creates a &#x60;Template&#x60; object with the given values.
     * @param mkTGTemplateEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return MKTGTemplateResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun templatesCreate(requestModel: TemplatesApi.TemplatesCreateRequest): MKTGTemplateResponse {
        return templatesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun templatesCreateAsync(requestModel: TemplatesApi.TemplatesCreateRequest): CompletableFuture<MKTGTemplateResponse> = GlobalScope.future {
        templatesCreate(requestModel)
    }

    /**
     * @param mkTGTemplateEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun templatesCreateExpanded(requestModel: TemplatesApi.TemplatesCreateRequest): MKTGTemplateResponse.Expanded {
        return templatesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun templatesCreateExpandedAsync(requestModel: TemplatesApi.TemplatesCreateRequest): CompletableFuture<MKTGTemplateResponse.Expanded> = GlobalScope.future {
        templatesCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> templatesCreateImpl(requestModel: TemplatesApi.TemplatesCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.mkTGTemplateEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/templates",
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
    * Returns a list of &#x60;Template&#x60; objects.
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedTemplateList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun templatesList(requestModel: TemplatesApi.TemplatesListRequest): MergePaginatedResponse<Template> {
        return templatesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun templatesListAsync(requestModel: TemplatesApi.TemplatesListRequest): CompletableFuture<MergePaginatedResponse<Template>> = GlobalScope.future {
        templatesList(requestModel)
    }

    /**
     * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional) * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun templatesListExpanded(requestModel: TemplatesApi.TemplatesListRequest): MergePaginatedResponse<Template.Expanded> {
        return templatesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun templatesListExpandedAsync(requestModel: TemplatesApi.TemplatesListRequest): CompletableFuture<MergePaginatedResponse<Template.Expanded>> = GlobalScope.future {
        templatesListExpanded(requestModel)
    }

    private suspend inline fun <reified T> templatesListImpl(requestModel: TemplatesApi.TemplatesListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/templates",
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
    * Returns metadata for &#x60;MKTGTemplate&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun templatesMetaPostRetrieve(): MetaResponse {
        return templatesMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun templatesMetaPostRetrieveAsync(): CompletableFuture<MetaResponse> = GlobalScope.future {
        templatesMetaPostRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun templatesMetaPostRetrieveExpanded(): MetaResponse.Expanded {
        return templatesMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun templatesMetaPostRetrieveExpandedAsync(): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        templatesMetaPostRetrieveExpanded()
    }

    private suspend inline fun <reified T> templatesMetaPostRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/templates/meta/post",
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
    * Returns a &#x60;Template&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Template
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun templatesRetrieve(requestModel: TemplatesApi.TemplatesRetrieveRequest): Template {
        return templatesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun templatesRetrieveAsync(requestModel: TemplatesApi.TemplatesRetrieveRequest): CompletableFuture<Template> = GlobalScope.future {
        templatesRetrieve(requestModel)
    }

    /**
     * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun templatesRetrieveExpanded(requestModel: TemplatesApi.TemplatesRetrieveRequest): Template.Expanded {
        return templatesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun templatesRetrieveExpandedAsync(requestModel: TemplatesApi.TemplatesRetrieveRequest): CompletableFuture<Template.Expanded> = GlobalScope.future {
        templatesRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> templatesRetrieveImpl(requestModel: TemplatesApi.TemplatesRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/templates/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
