/**
 * Merge Accounting API
 *
 * The unified API for building rich integrations with multiple Accounting & Finance platforms.
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

package dev.merge.client.accounting.models


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * 
 *
 * @param linkToken 
 * @param integrationName 
 * @param magicLinkUrl 
 */

data class LinkToken (

    @field:JsonProperty("link_token")
    val linkToken: kotlin.String,

    @field:JsonProperty("integration_name")
    val integrationName: kotlin.String,

    @field:JsonProperty("magic_link_url")
    val magicLinkUrl: kotlin.String? = null

) {

    data class Expanded(
        @field:JsonProperty("link_token")
        val linkToken: JsonNode?,

        @field:JsonProperty("integration_name")
        val integrationName: JsonNode?,

        @field:JsonProperty("magic_link_url")
        val magicLinkUrl: JsonNode?

    )

}

