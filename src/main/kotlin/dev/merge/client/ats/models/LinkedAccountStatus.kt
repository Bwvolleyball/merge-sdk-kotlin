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

/**
 * 
 *
 * @param linkedAccountStatus 
 * @param canMakeRequest 
 */

data class LinkedAccountStatus (

    @field:JsonProperty("linked_account_status")
    val linkedAccountStatus: kotlin.String,

    @field:JsonProperty("can_make_request")
    val canMakeRequest: kotlin.Boolean

) {

    data class Expanded(
        @field:JsonProperty("linked_account_status")
        val linkedAccountStatus: JsonNode?,

        @field:JsonProperty("can_make_request")
        val canMakeRequest: JsonNode?

    )

}

