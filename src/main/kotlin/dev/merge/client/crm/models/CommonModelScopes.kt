/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.models

import dev.merge.client.crm.models.CommonModelScopesDisabledModels
import dev.merge.client.crm.models.CommonModelScopesScope

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param scope 
 * @param commonModels 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CommonModelScopes (

    @field:JsonProperty("scope")
    val scope: CommonModelScopesScope,

    @field:JsonProperty("common_models")
    val commonModels: kotlin.collections.List<CommonModelScopesDisabledModels>

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("scope")
        val scope: JsonNode,

        @field:JsonProperty("common_models")
        val commonModels: kotlin.collections.List<JsonNode>

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CommonModelScopes.Expanded): CommonModelScopes {
            return CommonModelScopes(
                scope = ApiClient.jsonConvertRequiredSafe(expanded.scope),
                commonModels = ApiClient.jsonConvertRequiredSafe(expanded.commonModels)
            )
        }
    }
}

