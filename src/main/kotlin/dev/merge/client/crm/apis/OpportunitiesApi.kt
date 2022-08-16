/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.apis

import dev.merge.client.crm.models.MetaResponse
import dev.merge.client.crm.models.Opportunity
import dev.merge.client.crm.models.OpportunityEndpointRequest
import dev.merge.client.crm.models.OpportunityResponse

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class OpportunitiesApi(
baseUrl: String = ApiClient.BASE_URL + "crm/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class OpportunitiesCreateRequest (
        val opportunityEndpointRequest: OpportunityEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class OpportunitiesListRequest (
        val accountId: kotlin.String? = null,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val ownerId: kotlin.String? = null,
        val pageSize: kotlin.Int? = null,
        val remoteFields: kotlin.String? = null,
        val remoteId: kotlin.String? = null,
        val stageId: kotlin.String? = null,
        val status: kotlin.String? = null
    )

    data class OpportunitiesRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null,
        val remoteFields: kotlin.String? = null
    )

    /**
    * 
    * Creates an &#x60;Opportunity&#x60; object with the given values.
     * @param opportunityEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return OpportunityResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesCreate(requestModel: OpportunitiesApi.OpportunitiesCreateRequest): OpportunityResponse {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.opportunityEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$requestModel?.isDebugMode") }
        requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$requestModel?.runAsync") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/opportunities",
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
    * Returns a list of &#x60;Opportunity&#x60; objects.
     * @param accountId If provided, will only return opportunities with this account. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param ownerId If provided, will only return opportunities with this owner. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param stageId If provided, will only return opportunities with this stage. (optional)
     * @param status If provided, will only return opportunities with this status. Options: (&#39;OPEN&#39;, &#39;WON&#39;, &#39;LOST&#39;) (optional)
     * @return PaginatedOpportunityList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesList(requestModel: OpportunitiesApi.OpportunitiesListRequest): MergePaginatedResponse<Opportunity> {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        requestModel.accountId?.apply { localVariableQuery["account_id"] = listOf("$requestModel?.accountId") }
        requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$requestModel?.createdAfter") }
        requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$requestModel?.createdBefore") }
        requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf("$requestModel?.cursor") }
        requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$requestModel?.includeDeletedData") }
        requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$requestModel?.includeRemoteData") }
        requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$requestModel?.modifiedAfter") }
        requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$requestModel?.modifiedBefore") }
        requestModel.ownerId?.apply { localVariableQuery["owner_id"] = listOf("$requestModel?.ownerId") }
        requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$requestModel?.pageSize") }
        requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf("$requestModel?.remoteFields") }
        requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf("$requestModel?.remoteId") }
        requestModel.stageId?.apply { localVariableQuery["stage_id"] = listOf("$requestModel?.stageId") }
        requestModel.status?.apply { localVariableQuery["status"] = listOf("$requestModel?.status") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/opportunities",
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
    * Returns metadata for &#x60;Opportunity&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesMetaPostRetrieve(): MetaResponse {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/opportunities/meta/post",
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
    * Returns an &#x60;Opportunity&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @return Opportunity
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesRetrieve(requestModel: OpportunitiesApi.OpportunitiesRetrieveRequest): Opportunity {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$requestModel?.includeRemoteData") }
        requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf("$requestModel?.remoteFields") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/opportunities/{id}".replace("{" + "id" + "}", "$requestModel.id"),
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
