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

package dev.merge.client.ticketing.models

import dev.merge.client.ticketing.models.PriorityEnum
import dev.merge.client.ticketing.models.TicketStatusEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Ticket Object ### Description The `Ticket` object is used to represent a ticket or a task within a system.  ### Usage Example TODO
 *
 * @param name The ticket's name.
 * @param assignees 
 * @param creator 
 * @param dueDate The ticket's due date.
 * @param status The current status of the ticket.
 * @param description The ticket’s description. HTML version of description is mapped if supported by the third-party platform.
 * @param project 
 * @param ticketType The ticket's type.
 * @param account 
 * @param contact 
 * @param parentTicket 
 * @param tags 
 * @param remoteCreatedAt When the third party's ticket was created.
 * @param remoteUpdatedAt When the third party's ticket was updated.
 * @param completedAt When the ticket was completed.
 * @param ticketUrl The 3rd party url of the Ticket.
 * @param priority The priority or urgency of the Ticket. Possible values include: URGENT, HIGH, NORMAL, LOW - in cases where there is no clear mapping - the original value passed through.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PatchedTicketRequest (

    /* The ticket's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("assignees")
    val assignees: kotlin.collections.List<java.util.UUID>? = null,

    @field:JsonProperty("creator")
    val creator: java.util.UUID? = null,

    /* The ticket's due date. */
    @field:JsonProperty("due_date")
    val dueDate: java.time.OffsetDateTime? = null,

    /* The current status of the ticket. */
    @field:JsonProperty("status")
    val status: TicketStatusEnum? = null,

    /* The ticket’s description. HTML version of description is mapped if supported by the third-party platform. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("project")
    val project: java.util.UUID? = null,

    /* The ticket's type. */
    @field:JsonProperty("ticket_type")
    val ticketType: kotlin.String? = null,

    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    @field:JsonProperty("parent_ticket")
    val parentTicket: java.util.UUID? = null,

    @field:JsonProperty("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* When the third party's ticket was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's ticket was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* When the ticket was completed. */
    @field:JsonProperty("completed_at")
    val completedAt: java.time.OffsetDateTime? = null,

    /* The 3rd party url of the Ticket. */
    @field:JsonProperty("ticket_url")
    val ticketUrl: java.net.URI? = null,

    /* The priority or urgency of the Ticket. Possible values include: URGENT, HIGH, NORMAL, LOW - in cases where there is no clear mapping - the original value passed through. */
    @field:JsonProperty("priority")
    val priority: PriorityEnum? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("assignees")
        val assignees: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("creator")
        val creator: JsonNode?,

        @field:JsonProperty("due_date")
        val dueDate: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("project")
        val project: JsonNode?,

        @field:JsonProperty("ticket_type")
        val ticketType: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("contact")
        val contact: JsonNode?,

        @field:JsonProperty("parent_ticket")
        val parentTicket: JsonNode?,

        @field:JsonProperty("tags")
        val tags: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("completed_at")
        val completedAt: JsonNode?,

        @field:JsonProperty("ticket_url")
        val ticketUrl: JsonNode?,

        @field:JsonProperty("priority")
        val priority: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PatchedTicketRequest.Expanded): PatchedTicketRequest {
            return PatchedTicketRequest(
                name = ApiClient.jsonConvertSafe(expanded.name),
                assignees = ApiClient.jsonConvertSafe(expanded.assignees),
                creator = ApiClient.jsonConvertSafe(expanded.creator),
                dueDate = ApiClient.jsonConvertSafe(expanded.dueDate),
                status = ApiClient.jsonConvertSafe(expanded.status),
                description = ApiClient.jsonConvertSafe(expanded.description),
                project = ApiClient.jsonConvertSafe(expanded.project),
                ticketType = ApiClient.jsonConvertSafe(expanded.ticketType),
                account = ApiClient.jsonConvertSafe(expanded.account),
                contact = ApiClient.jsonConvertSafe(expanded.contact),
                parentTicket = ApiClient.jsonConvertSafe(expanded.parentTicket),
                tags = ApiClient.jsonConvertSafe(expanded.tags),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                completedAt = ApiClient.jsonConvertSafe(expanded.completedAt),
                ticketUrl = ApiClient.jsonConvertSafe(expanded.ticketUrl),
                priority = ApiClient.jsonConvertSafe(expanded.priority),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

