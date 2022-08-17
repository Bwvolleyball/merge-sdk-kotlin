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

import dev.merge.client.hris.models.ReasonEnum

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * 
 *
 * @param reason 
 * @param message 
 */

data class IgnoreCommonModelRequest (

    @field:JsonProperty("reason")
    val reason: ReasonEnum?,

    @field:JsonProperty("message")
    val message: kotlin.String? = null

) {

    data class Expanded(
        @field:JsonProperty("reason")
        val reason: JsonNode?,

        @field:JsonProperty("message")
        val message: JsonNode?

    )

}

