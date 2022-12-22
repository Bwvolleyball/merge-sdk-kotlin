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

import dev.merge.client.accounting.models.CommonModelScopesScopeTypeEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param type 
 * @param `value` 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CommonModelScopesScope (

    @field:JsonProperty("type")
    val type: CommonModelScopesScopeTypeEnum,

    @field:JsonProperty("value")
    val `value`: kotlin.String

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("type")
        val type: JsonNode,

        @field:JsonProperty("value")
        val `value`: JsonNode

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CommonModelScopesScope.Expanded): CommonModelScopesScope {
            return CommonModelScopesScope(
                type = ApiClient.jsonConvertRequiredSafe(expanded.type),
                `value` = ApiClient.jsonConvertRequiredSafe(expanded.`value`)
            )
        }
    }
}

