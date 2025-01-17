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

import dev.merge.client.accounting.models.CategoriesEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param name Company name.
 * @param categories Category or categories this integration belongs to. Multiple categories should be comma separated, i.e. [ats, hris].
 * @param image Company logo in rectangular shape. <b>Upload an image with a clear background.</b>
 * @param squareImage Company logo in square shape. <b>Upload an image with a white background.</b>
 * @param color The color of this integration used for buttons and text throughout the app and landing pages. <b>Choose a darker, saturated color.</b>
 * @param slug 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class AccountIntegration (

    /* Company name. */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* Category or categories this integration belongs to. Multiple categories should be comma separated, i.e. [ats, hris]. */
    @field:JsonProperty("categories")
    val categories: kotlin.collections.List<CategoriesEnum>? = null,

    /* Company logo in rectangular shape. <b>Upload an image with a clear background.</b> */
    @field:JsonProperty("image")
    val image: java.net.URI? = null,

    /* Company logo in square shape. <b>Upload an image with a white background.</b> */
    @field:JsonProperty("square_image")
    val squareImage: java.net.URI? = null,

    /* The color of this integration used for buttons and text throughout the app and landing pages. <b>Choose a darker, saturated color.</b> */
    @field:JsonProperty("color")
    val color: kotlin.String? = null,

    @field:JsonProperty("slug")
    val slug: kotlin.String? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("name")
        val name: JsonNode,

        @field:JsonProperty("categories")
        val categories: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("image")
        val image: JsonNode?,

        @field:JsonProperty("square_image")
        val squareImage: JsonNode?,

        @field:JsonProperty("color")
        val color: JsonNode?,

        @field:JsonProperty("slug")
        val slug: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: AccountIntegration.Expanded): AccountIntegration {
            return AccountIntegration(
                name = ApiClient.jsonConvertRequiredSafe(expanded.name),
                categories = ApiClient.jsonConvertSafe(expanded.categories),
                image = ApiClient.jsonConvertSafe(expanded.image),
                squareImage = ApiClient.jsonConvertSafe(expanded.squareImage),
                color = ApiClient.jsonConvertSafe(expanded.color),
                slug = ApiClient.jsonConvertSafe(expanded.slug)
            )
        }
    }
}

