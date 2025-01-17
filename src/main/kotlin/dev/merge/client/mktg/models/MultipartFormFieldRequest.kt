/**
 * Merge Marketing Automation API
 *
 * The unified API for building rich integrations with multiple Marketing Automation platforms.
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

package dev.merge.client.mktg.models

import dev.merge.client.mktg.models.EncodingEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The MultipartFormField Object ### Description The `MultipartFormField` object is used to represent fields in an HTTP request using `multipart/form-data`.  ### Usage Example Create a `MultipartFormField` to define a multipart form entry.
 *
 * @param name The name of the form field
 * @param `data` The data for the form field.
 * @param encoding The encoding of the value of `data`. Defaults to `RAW` if not defined.
 * @param fileName The file name of the form field, if the field is for a file.
 * @param contentType The MIME type of the file, if the field is for a file.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class MultipartFormFieldRequest (

    /* The name of the form field */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* The data for the form field. */
    @field:JsonProperty("data")
    val `data`: kotlin.String,

    /* The encoding of the value of `data`. Defaults to `RAW` if not defined. */
    @field:JsonProperty("encoding")
    val encoding: EncodingEnum? = null,

    /* The file name of the form field, if the field is for a file. */
    @field:JsonProperty("file_name")
    val fileName: kotlin.String? = null,

    /* The MIME type of the file, if the field is for a file. */
    @field:JsonProperty("content_type")
    val contentType: kotlin.String? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("name")
        val name: JsonNode,

        @field:JsonProperty("data")
        val `data`: JsonNode,

        @field:JsonProperty("encoding")
        val encoding: JsonNode?,

        @field:JsonProperty("file_name")
        val fileName: JsonNode?,

        @field:JsonProperty("content_type")
        val contentType: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: MultipartFormFieldRequest.Expanded): MultipartFormFieldRequest {
            return MultipartFormFieldRequest(
                name = ApiClient.jsonConvertRequiredSafe(expanded.name),
                `data` = ApiClient.jsonConvertRequiredSafe(expanded.`data`),
                encoding = ApiClient.jsonConvertSafe(expanded.encoding),
                fileName = ApiClient.jsonConvertSafe(expanded.fileName),
                contentType = ApiClient.jsonConvertSafe(expanded.contentType)
            )
        }
    }
}

