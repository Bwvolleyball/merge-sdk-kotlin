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

import dev.merge.client.mktg.models.Message
import dev.merge.client.mktg.models.Contact

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

open class MessagesApi(
baseUrl: String = ApiClient.BASE_URL + "mktg/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class MessagesListRequest (
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

    data class MessagesRecipientsListRequest (
        val parentId: java.util.UUID,
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val pageSize: kotlin.Int? = null
    )

    data class MessagesRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Returns a list of &#x60;Message&#x60; objects.
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedMessageList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun messagesList(requestModel: MessagesApi.MessagesListRequest): MergePaginatedResponse<Message> {
        return messagesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun messagesListAsync(requestModel: MessagesApi.MessagesListRequest): CompletableFuture<MergePaginatedResponse<Message>> = GlobalScope.future {
        messagesList(requestModel)
    }

    /**
     * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional) * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun messagesListExpanded(requestModel: MessagesApi.MessagesListRequest): MergePaginatedResponse<Message.Expanded> {
        return messagesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun messagesListExpandedAsync(requestModel: MessagesApi.MessagesListRequest): CompletableFuture<MergePaginatedResponse<Message.Expanded>> = GlobalScope.future {
        messagesListExpanded(requestModel)
    }

    private suspend inline fun <reified T> messagesListImpl(requestModel: MessagesApi.MessagesListRequest): T {

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
        "/messages",
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
    * Returns a list of &#x60;Contact&#x60; objects.
     * @param parentId  
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return PaginatedContactList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun messagesRecipientsList(requestModel: MessagesApi.MessagesRecipientsListRequest): MergePaginatedResponse<Contact> {
        return messagesRecipientsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun messagesRecipientsListAsync(requestModel: MessagesApi.MessagesRecipientsListRequest): CompletableFuture<MergePaginatedResponse<Contact>> = GlobalScope.future {
        messagesRecipientsList(requestModel)
    }

    /**
     * @param parentId   * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param pageSize Number of results to return per page. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun messagesRecipientsListExpanded(requestModel: MessagesApi.MessagesRecipientsListRequest): MergePaginatedResponse<Contact.Expanded> {
        return messagesRecipientsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun messagesRecipientsListExpandedAsync(requestModel: MessagesApi.MessagesRecipientsListRequest): CompletableFuture<MergePaginatedResponse<Contact.Expanded>> = GlobalScope.future {
        messagesRecipientsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> messagesRecipientsListImpl(requestModel: MessagesApi.MessagesRecipientsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/messages/{parent_id}/recipients".replace("{" + "parent_id" + "}", "${ requestModel.parentId }"),
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
    * Returns a &#x60;Message&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Message
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun messagesRetrieve(requestModel: MessagesApi.MessagesRetrieveRequest): Message {
        return messagesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun messagesRetrieveAsync(requestModel: MessagesApi.MessagesRetrieveRequest): CompletableFuture<Message> = GlobalScope.future {
        messagesRetrieve(requestModel)
    }

    /**
     * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun messagesRetrieveExpanded(requestModel: MessagesApi.MessagesRetrieveRequest): Message.Expanded {
        return messagesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun messagesRetrieveExpandedAsync(requestModel: MessagesApi.MessagesRetrieveRequest): CompletableFuture<Message.Expanded> = GlobalScope.future {
        messagesRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> messagesRetrieveImpl(requestModel: MessagesApi.MessagesRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/messages/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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