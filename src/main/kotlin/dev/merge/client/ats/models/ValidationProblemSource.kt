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


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param pointer 
 */

data class ValidationProblemSource (

    @field:JsonProperty("pointer")
    val pointer: kotlin.String

) {

    data class Expanded(
        @field:JsonProperty("pointer")
        val pointer: JsonNode

    )


    companion object {
        fun normalize(expanded: ValidationProblemSource.Expanded): ValidationProblemSource {
            return ValidationProblemSource(
                pointer = ApiClient.jsonConvertRequiredSafe(expanded.pointer)
            )
        }
    }
}
