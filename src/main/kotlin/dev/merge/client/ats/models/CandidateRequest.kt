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

import dev.merge.client.ats.models.EmailAddressRequest
import dev.merge.client.ats.models.PhoneNumberRequest
import dev.merge.client.ats.models.UrlRequest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Candidate Object ### Description The `Candidate` object is used to represent a Candidate for various positions. ### Usage Example Fetch from the `LIST Candidates` endpoint and filter by `ID` to show all candidates.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param firstName The candidate's first name.
 * @param lastName The candidate's last name.
 * @param company The candidate's current company.
 * @param title The candidate's current title.
 * @param remoteCreatedAt When the third party's candidate was created.
 * @param remoteUpdatedAt When the third party's candidate was updated.
 * @param lastInteractionAt When the most recent candidate interaction occurred.
 * @param isPrivate Whether or not the candidate is private.
 * @param canEmail Whether or not the candidate can be emailed.
 * @param locations The candidate's locations.
 * @param phoneNumbers 
 * @param emailAddresses 
 * @param urls 
 * @param tags Array of `Tag` names as strings.
 * @param applications Array of `Application` object IDs.
 * @param attachments Array of `Attachment` object IDs.
 * @param remoteTemplateId 
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CandidateRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The candidate's first name. */
    @field:JsonProperty("first_name")
    val firstName: kotlin.String? = null,

    /* The candidate's last name. */
    @field:JsonProperty("last_name")
    val lastName: kotlin.String? = null,

    /* The candidate's current company. */
    @field:JsonProperty("company")
    val company: kotlin.String? = null,

    /* The candidate's current title. */
    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    /* When the third party's candidate was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's candidate was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* When the most recent candidate interaction occurred. */
    @field:JsonProperty("last_interaction_at")
    val lastInteractionAt: java.time.OffsetDateTime? = null,

    /* Whether or not the candidate is private. */
    @field:JsonProperty("is_private")
    val isPrivate: kotlin.Boolean? = null,

    /* Whether or not the candidate can be emailed. */
    @field:JsonProperty("can_email")
    val canEmail: kotlin.Boolean? = null,

    /* The candidate's locations. */
    @field:JsonProperty("locations")
    val locations: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("phone_numbers")
    val phoneNumbers: kotlin.collections.List<PhoneNumberRequest>? = null,

    @field:JsonProperty("email_addresses")
    val emailAddresses: kotlin.collections.List<EmailAddressRequest>? = null,

    @field:JsonProperty("urls")
    val urls: kotlin.collections.List<UrlRequest>? = null,

    /* Array of `Tag` names as strings. */
    @field:JsonProperty("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* Array of `Application` object IDs. */
    @field:JsonProperty("applications")
    val applications: kotlin.collections.List<java.util.UUID>? = null,

    /* Array of `Attachment` object IDs. */
    @field:JsonProperty("attachments")
    val attachments: kotlin.collections.List<java.util.UUID>? = null,

    @field:JsonProperty("remote_template_id")
    val remoteTemplateId: kotlin.String? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("first_name")
        val firstName: JsonNode?,

        @field:JsonProperty("last_name")
        val lastName: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("title")
        val title: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("last_interaction_at")
        val lastInteractionAt: JsonNode?,

        @field:JsonProperty("is_private")
        val isPrivate: JsonNode?,

        @field:JsonProperty("can_email")
        val canEmail: JsonNode?,

        @field:JsonProperty("locations")
        val locations: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("phone_numbers")
        val phoneNumbers: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("email_addresses")
        val emailAddresses: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("urls")
        val urls: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("tags")
        val tags: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("applications")
        val applications: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("attachments")
        val attachments: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_template_id")
        val remoteTemplateId: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CandidateRequest.Expanded): CandidateRequest {
            return CandidateRequest(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                firstName = ApiClient.jsonConvertSafe(expanded.firstName),
                lastName = ApiClient.jsonConvertSafe(expanded.lastName),
                company = ApiClient.jsonConvertSafe(expanded.company),
                title = ApiClient.jsonConvertSafe(expanded.title),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                lastInteractionAt = ApiClient.jsonConvertSafe(expanded.lastInteractionAt),
                isPrivate = ApiClient.jsonConvertSafe(expanded.isPrivate),
                canEmail = ApiClient.jsonConvertSafe(expanded.canEmail),
                locations = ApiClient.jsonConvertSafe(expanded.locations),
                phoneNumbers = ApiClient.jsonConvertSafe(expanded.phoneNumbers),
                emailAddresses = ApiClient.jsonConvertSafe(expanded.emailAddresses),
                urls = ApiClient.jsonConvertSafe(expanded.urls),
                tags = ApiClient.jsonConvertSafe(expanded.tags),
                applications = ApiClient.jsonConvertSafe(expanded.applications),
                attachments = ApiClient.jsonConvertSafe(expanded.attachments),
                remoteTemplateId = ApiClient.jsonConvertSafe(expanded.remoteTemplateId),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

