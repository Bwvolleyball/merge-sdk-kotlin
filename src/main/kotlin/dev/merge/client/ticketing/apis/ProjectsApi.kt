/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.apis

import dev.merge.client.ticketing.models.Project
import dev.merge.client.ticketing.models.User

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

open class ProjectsApi(
baseUrl: String = ApiClient.BASE_URL + "ticketing/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class ProjectsListRequest (
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

    data class ProjectsRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null
    )

    data class ProjectsUsersListRequest (
        val id: java.util.UUID,
        val cursor: kotlin.String? = null,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val pageSize: kotlin.Int? = null
    )

    /**
    * 
    * Returns a list of &#x60;Project&#x60; objects.
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedProjectList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun projectsList(requestModel: ProjectsApi.ProjectsListRequest): MergePaginatedResponse<Project> {
        return projectsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun projectsListAsync(requestModel: ProjectsApi.ProjectsListRequest): CompletableFuture<MergePaginatedResponse<Project>> = GlobalScope.future {
        projectsList(requestModel)
    }

    /**
     * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional) * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun projectsListExpanded(requestModel: ProjectsApi.ProjectsListRequest): MergePaginatedResponse<Project.Expanded> {
        return projectsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun projectsListExpandedAsync(requestModel: ProjectsApi.ProjectsListRequest): CompletableFuture<MergePaginatedResponse<Project.Expanded>> = GlobalScope.future {
        projectsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> projectsListImpl(requestModel: ProjectsApi.ProjectsListRequest): T {

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
        "/projects",
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
    * Returns a &#x60;Project&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Project
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun projectsRetrieve(requestModel: ProjectsApi.ProjectsRetrieveRequest): Project {
        return projectsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun projectsRetrieveAsync(requestModel: ProjectsApi.ProjectsRetrieveRequest): CompletableFuture<Project> = GlobalScope.future {
        projectsRetrieve(requestModel)
    }

    /**
     * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun projectsRetrieveExpanded(requestModel: ProjectsApi.ProjectsRetrieveRequest): Project.Expanded {
        return projectsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun projectsRetrieveExpandedAsync(requestModel: ProjectsApi.ProjectsRetrieveRequest): CompletableFuture<Project.Expanded> = GlobalScope.future {
        projectsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> projectsRetrieveImpl(requestModel: ProjectsApi.ProjectsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/projects/{id}".replace("{" + "id" + "}", "$requestModel.id"),
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
    * Returns a &#x60;User&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param cursor The pagination cursor value. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return PaginatedUserList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun projectsUsersList(requestModel: ProjectsApi.ProjectsUsersListRequest): MergePaginatedResponse<User> {
        return projectsUsersListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun projectsUsersListAsync(requestModel: ProjectsApi.ProjectsUsersListRequest): CompletableFuture<MergePaginatedResponse<User>> = GlobalScope.future {
        projectsUsersList(requestModel)
    }

    /**
     * @param id   * @param cursor The pagination cursor value. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param pageSize Number of results to return per page. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun projectsUsersListExpanded(requestModel: ProjectsApi.ProjectsUsersListRequest): MergePaginatedResponse<User.Expanded> {
        return projectsUsersListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun projectsUsersListExpandedAsync(requestModel: ProjectsApi.ProjectsUsersListRequest): CompletableFuture<MergePaginatedResponse<User.Expanded>> = GlobalScope.future {
        projectsUsersListExpanded(requestModel)
    }

    private suspend inline fun <reified T> projectsUsersListImpl(requestModel: ProjectsApi.ProjectsUsersListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/projects/{id}/users".replace("{" + "id" + "}", "$requestModel.id"),
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
