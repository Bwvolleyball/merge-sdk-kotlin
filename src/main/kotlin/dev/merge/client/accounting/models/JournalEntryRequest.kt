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

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * # The JournalEntry Object ### Description The `JournalEntry` object is used to represent a company's journey entries.  ### Usage Example Fetch from the `GET JournalEntry` endpoint and view a company's journey entry.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param transactionDate The journal entry's transaction date.
 * @param remoteCreatedAt When the third party's journal entry was created.
 * @param payments Array of `Payment` object IDs.
 * @param memo The journal entry's private note.
 * @param currency The journal's currency.
 */

data class JournalEntryRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The journal entry's transaction date. */
    @field:JsonProperty("transaction_date")
    val transactionDate: java.time.OffsetDateTime? = null,

    /* When the third party's journal entry was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* Array of `Payment` object IDs. */
    @field:JsonProperty("payments")
    val payments: kotlin.collections.List<java.util.UUID>? = null,

    /* The journal entry's private note. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    /* The journal's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null

) {

    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("transaction_date")
        val transactionDate: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("payments")
        val payments: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?

    )

}

