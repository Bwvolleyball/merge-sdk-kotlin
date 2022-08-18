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

import dev.merge.client.hris.models.BankInfo

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

open class BankInfoApi(
baseUrl: String = ApiClient.BASE_URL + "hris/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class BankInfoListRequest (
        val accountType: kotlin.String? = null,
        val bankName: kotlin.String? = null,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val employeeId: kotlin.String? = null,
        val expand: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val orderBy: kotlin.String? = null,
        val pageSize: kotlin.Int? = null,
        val remoteFields: kotlin.String? = null,
        val remoteId: kotlin.String? = null
    )

    data class BankInfoRetrieveRequest (
        val id: java.util.UUID,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val remoteFields: kotlin.String? = null
    )

    /**
    * 
    * Returns a list of &#x60;BankInfo&#x60; objects.
     * @param accountType If provided, will only return BankInfo&#39;s with this account type. Options: (&#39;SAVINGS&#39;, &#39;CHECKING&#39;) (optional)
     * @param bankName If provided, will only return BankInfo&#39;s with this bank name. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeeId If provided, will only return bank accounts for this employee. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param orderBy Overrides the default ordering for this endpoint. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedBankInfoList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun bankInfoList(requestModel: BankInfoApi.BankInfoListRequest): MergePaginatedResponse<BankInfo> {
        return bankInfoListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun bankInfoListAsync(requestModel: BankInfoApi.BankInfoListRequest): CompletableFuture<MergePaginatedResponse<BankInfo>> = GlobalScope.future {
        bankInfoList(requestModel)
    }

    /**
     * @param accountType If provided, will only return BankInfo&#39;s with this account type. Options: (&#39;SAVINGS&#39;, &#39;CHECKING&#39;) (optional) * @param bankName If provided, will only return BankInfo&#39;s with this bank name. (optional) * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param employeeId If provided, will only return bank accounts for this employee. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional) * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional) * @param orderBy Overrides the default ordering for this endpoint. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteFields Which fields should be returned in non-normalized form. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun bankInfoListExpanded(requestModel: BankInfoApi.BankInfoListRequest): MergePaginatedResponse<BankInfo.Expanded> {
        return bankInfoListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun bankInfoListExpandedAsync(requestModel: BankInfoApi.BankInfoListRequest): CompletableFuture<MergePaginatedResponse<BankInfo.Expanded>> = GlobalScope.future {
        bankInfoListExpanded(requestModel)
    }

    private suspend inline fun <reified T> bankInfoListImpl(requestModel: BankInfoApi.BankInfoListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.accountType?.apply { localVariableQuery["account_type"] = listOf(this) }
            requestModel.bankName?.apply { localVariableQuery["bank_name"] = listOf(this) }
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.employeeId?.apply { localVariableQuery["employee_id"] = listOf(this) }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.orderBy?.apply { localVariableQuery["order_by"] = listOf(this) }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf(this) }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/bank-info",
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
    * Returns a &#x60;BankInfo&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @return BankInfo
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun bankInfoRetrieve(requestModel: BankInfoApi.BankInfoRetrieveRequest): BankInfo {
        return bankInfoRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun bankInfoRetrieveAsync(requestModel: BankInfoApi.BankInfoRetrieveRequest): CompletableFuture<BankInfo> = GlobalScope.future {
        bankInfoRetrieve(requestModel)
    }

    /**
     * @param id   * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param remoteFields Which fields should be returned in non-normalized form. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun bankInfoRetrieveExpanded(requestModel: BankInfoApi.BankInfoRetrieveRequest): BankInfo.Expanded {
        return bankInfoRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun bankInfoRetrieveExpandedAsync(requestModel: BankInfoApi.BankInfoRetrieveRequest): CompletableFuture<BankInfo.Expanded> = GlobalScope.future {
        bankInfoRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> bankInfoRetrieveImpl(requestModel: BankInfoApi.BankInfoRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/bank-info/{id}".replace("{" + "id" + "}", "$requestModel.id"),
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