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

import dev.merge.client.ticketing.models.Attachment
import dev.merge.client.ticketing.models.DebugModeLog
import dev.merge.client.ticketing.models.ErrorValidationProblem
import dev.merge.client.ticketing.models.WarningValidationProblem

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * 
 *
 * @param model 
 * @param warnings 
 * @param errors 
 * @param logs 
 */

data class TicketingAttachmentResponse (

    @field:JsonProperty("model")
    val model: Attachment,

    @field:JsonProperty("warnings")
    val warnings: kotlin.collections.List<WarningValidationProblem>,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<ErrorValidationProblem>,

    @field:JsonProperty("logs")
    val logs: kotlin.collections.List<DebugModeLog>? = null

) {

    data class Expanded(
        @field:JsonProperty("model")
        val model: JsonNode?,

        @field:JsonProperty("warnings")
        val warnings: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("errors")
        val errors: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("logs")
        val logs: kotlin.collections.List<JsonNode>?

    )

}

