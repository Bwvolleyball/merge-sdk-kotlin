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

import dev.merge.client.accounting.models.CurrencyEnum
import dev.merge.client.shared.RemoteData
import dev.merge.client.accounting.models.VendorCreditLine

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * # The VendorCredit Object ### Description The `VendorCredit` object is used to represent a company's vendor credits.  ### Usage Example Fetch from the `GET VendorCredit` endpoint and view a company's vendor credits.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param number The vendor credit's number.
 * @param transactionDate The vendor credit's transaction date.
 * @param vendor 
 * @param totalAmount The vendor credit's total amount.
 * @param currency The vendor credit's currency.
 * @param lines 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class VendorCredit (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The vendor credit's number. */
    @field:JsonProperty("number")
    val number: kotlin.String? = null,

    /* The vendor credit's transaction date. */
    @field:JsonProperty("transaction_date")
    val transactionDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("vendor")
    val vendor: java.util.UUID? = null,

    /* The vendor credit's total amount. */
    @field:JsonProperty("total_amount")
    val totalAmount: kotlin.Float? = null,

    /* The vendor credit's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    @field:JsonProperty("lines")
    val lines: kotlin.collections.List<VendorCreditLine>? = null,

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

        @field:JsonProperty("number")
        val number: JsonNode?,

        @field:JsonProperty("transaction_date")
        val transactionDate: JsonNode?,

        @field:JsonProperty("vendor")
        val vendor: JsonNode?,

        @field:JsonProperty("total_amount")
        val totalAmount: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("lines")
        val lines: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )

}

