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

import dev.merge.client.ticketing.models.AccountIntegration

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * 
 *
 * @param accountToken 
 * @param integration 
 */

data class AccountToken (

    @field:JsonProperty("account_token")
    val accountToken: kotlin.String,

    @field:JsonProperty("integration")
    val integration: AccountIntegration

) {

    data class Expanded(
        @field:JsonProperty("account_token")
        val accountToken: JsonNode?,

        @field:JsonProperty("integration")
        val integration: JsonNode?

    )

}

