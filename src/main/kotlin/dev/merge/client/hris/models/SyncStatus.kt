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

package dev.merge.client.hris.models

import dev.merge.client.hris.models.SyncStatusStatusEnum

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The SyncStatus Object ### Description The `SyncStatus` object is used to represent the syncing state of an account  ### Usage Example View the `SyncStatus` for an account to see how recently its models were synced.
 *
 * @param modelName 
 * @param modelId 
 * @param lastSyncStart 
 * @param nextSyncStart 
 * @param status 
 * @param isInitialSync 
 */

data class SyncStatus (

    @field:JsonProperty("model_name")
    val modelName: kotlin.String,

    @field:JsonProperty("model_id")
    val modelId: kotlin.String,

    @field:JsonProperty("last_sync_start")
    val lastSyncStart: java.time.OffsetDateTime,

    @field:JsonProperty("next_sync_start")
    val nextSyncStart: java.time.OffsetDateTime,

    @field:JsonProperty("status")
    val status: SyncStatusStatusEnum?,

    @field:JsonProperty("is_initial_sync")
    val isInitialSync: kotlin.Boolean

) {

    data class Expanded(
        @field:JsonProperty("model_name")
        val modelName: JsonNode,

        @field:JsonProperty("model_id")
        val modelId: JsonNode,

        @field:JsonProperty("last_sync_start")
        val lastSyncStart: JsonNode,

        @field:JsonProperty("next_sync_start")
        val nextSyncStart: JsonNode,

        @field:JsonProperty("status")
        val status: JsonNode,

        @field:JsonProperty("is_initial_sync")
        val isInitialSync: JsonNode

    )


    companion object {
        fun normalize(expanded: SyncStatus.Expanded): SyncStatus {
            return SyncStatus(
                modelName = ApiClient.jsonConvertRequiredSafe(expanded.modelName),
                modelId = ApiClient.jsonConvertRequiredSafe(expanded.modelId),
                lastSyncStart = ApiClient.jsonConvertRequiredSafe(expanded.lastSyncStart),
                nextSyncStart = ApiClient.jsonConvertRequiredSafe(expanded.nextSyncStart),
                status = ApiClient.jsonConvertRequiredSafe(expanded.status),
                isInitialSync = ApiClient.jsonConvertRequiredSafe(expanded.isInitialSync)
            )
        }
    }
}
