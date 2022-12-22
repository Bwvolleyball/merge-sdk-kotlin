/**
 * Merge ATS API
 *
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
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

package dev.merge.client.ats.models

import dev.merge.client.ats.models.ActivityTypeEnum
import dev.merge.client.shared.RemoteData
import dev.merge.client.ats.models.VisibilityEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Activity Object ### Description The `Activity` object is used to represent an activity performed by a user. ### Usage Example Fetch from the `LIST Activities` endpoint and filter by `ID` to show all activities.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param user The user the performed the action.
 * @param remoteCreatedAt When the third party's activity was created.
 * @param activityType The activity's type.
 * @param subject The activity's subject.
 * @param body The activity's body.
 * @param visibility The activity's visibility.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Activity (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The user the performed the action. */
    @field:JsonProperty("user")
    val user: java.util.UUID? = null,

    /* When the third party's activity was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* The activity's type. */
    @field:JsonProperty("activity_type")
    val activityType: ActivityTypeEnum? = null,

    /* The activity's subject. */
    @field:JsonProperty("subject")
    val subject: kotlin.String? = null,

    /* The activity's body. */
    @field:JsonProperty("body")
    val body: kotlin.String? = null,

    /* The activity's visibility. */
    @field:JsonProperty("visibility")
    val visibility: VisibilityEnum? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("user")
        val user: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("activity_type")
        val activityType: JsonNode?,

        @field:JsonProperty("subject")
        val subject: JsonNode?,

        @field:JsonProperty("body")
        val body: JsonNode?,

        @field:JsonProperty("visibility")
        val visibility: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Activity.Expanded): Activity {
            return Activity(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                user = ApiClient.jsonConvertSafe(expanded.user),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                activityType = ApiClient.jsonConvertSafe(expanded.activityType),
                subject = ApiClient.jsonConvertSafe(expanded.subject),
                body = ApiClient.jsonConvertSafe(expanded.body),
                visibility = ApiClient.jsonConvertSafe(expanded.visibility),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings)
            )
        }
    }
}

