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

import dev.merge.client.ats.models.AttachmentTypeEnum

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * # The Attachment Object ### Description The `Attachment` object is used to represent a attachment for a candidate. ### Usage Example Fetch from the `LIST Attachments` endpoint and view attachments accessible by a company.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param fileName The attachment's name.
 * @param fileUrl The attachment's url.
 * @param candidate 
 * @param attachmentType The attachment's type.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

data class AttachmentRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The attachment's name. */
    @field:JsonProperty("file_name")
    val fileName: kotlin.String? = null,

    /* The attachment's url. */
    @field:JsonProperty("file_url")
    val fileUrl: java.net.URI? = null,

    @field:JsonProperty("candidate")
    val candidate: java.util.UUID? = null,

    /* The attachment's type. */
    @field:JsonProperty("attachment_type")
    val attachmentType: AttachmentTypeEnum? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("file_name")
        val fileName: JsonNode?,

        @field:JsonProperty("file_url")
        val fileUrl: JsonNode?,

        @field:JsonProperty("candidate")
        val candidate: JsonNode?,

        @field:JsonProperty("attachment_type")
        val attachmentType: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )

}

