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

import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * # The TaxRate Object ### Description The `TaxRate` object is used to represent a tax rate.  ### Usage Example Fetch from the `LIST TaxRates` endpoint and view tax rates relevant to a company.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param description The tax rate's description.
 * @param totalTaxRate The tax rate's total tax rate.
 * @param effectiveTaxRate The tax rate's effective tax rate.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class TaxRate (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The tax rate's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The tax rate's total tax rate. */
    @field:JsonProperty("total_tax_rate")
    val totalTaxRate: kotlin.Float? = null,

    /* The tax rate's effective tax rate. */
    @field:JsonProperty("effective_tax_rate")
    val effectiveTaxRate: kotlin.Float? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("total_tax_rate")
        val totalTaxRate: JsonNode?,

        @field:JsonProperty("effective_tax_rate")
        val effectiveTaxRate: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )

}

