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

import dev.merge.client.hris.models.ValidationProblemSource

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * 
 *
 * @param title 
 * @param detail 
 * @param problemType 
 * @param source 
 */

data class WarningValidationProblem (

    @field:JsonProperty("title")
    val title: kotlin.String,

    @field:JsonProperty("detail")
    val detail: kotlin.String,

    @field:JsonProperty("problem_type")
    val problemType: kotlin.String,

    @field:JsonProperty("source")
    val source: ValidationProblemSource? = null

) {

    data class Expanded(
        @field:JsonProperty("title")
        val title: JsonNode?,

        @field:JsonProperty("detail")
        val detail: JsonNode?,

        @field:JsonProperty("problem_type")
        val problemType: JsonNode?,

        @field:JsonProperty("source")
        val source: JsonNode?

    )

}

