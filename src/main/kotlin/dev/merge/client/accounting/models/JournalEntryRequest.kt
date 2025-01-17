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
import dev.merge.client.accounting.models.JournalLineRequest
import dev.merge.client.accounting.models.PostingStatusEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The JournalEntry Object ### Description The `JournalEntry` object is used to get a record of all manually created entries made in a company’s general ledger. The journal line items for each journal entry should sum to zero.  ### Usage Example Fetch from the `GET JournalEntry` endpoint and view a company's journey entry.
 *
 * @param transactionDate The journal entry's transaction date.
 * @param payments Array of `Payment` object IDs.
 * @param memo The journal entry's private note.
 * @param currency The journal's currency.
 * @param exchangeRate The journal entry's exchange rate.
 * @param company The company the journal entry belongs to.
 * @param lines 
 * @param postingStatus The journal's posting status.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class JournalEntryRequest (

    /* The journal entry's transaction date. */
    @field:JsonProperty("transaction_date")
    val transactionDate: java.time.OffsetDateTime? = null,

    /* Array of `Payment` object IDs. */
    @field:JsonProperty("payments")
    val payments: kotlin.collections.List<java.util.UUID>? = null,

    /* The journal entry's private note. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    /* The journal's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* The journal entry's exchange rate. */
    @field:JsonProperty("exchange_rate")
    val exchangeRate: java.math.BigDecimal? = null,

    /* The company the journal entry belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    @field:JsonProperty("lines")
    val lines: kotlin.collections.List<JournalLineRequest>? = null,

    /* The journal's posting status. */
    @field:JsonProperty("posting_status")
    val postingStatus: PostingStatusEnum? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("transaction_date")
        val transactionDate: JsonNode?,

        @field:JsonProperty("payments")
        val payments: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("exchange_rate")
        val exchangeRate: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("lines")
        val lines: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("posting_status")
        val postingStatus: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: JournalEntryRequest.Expanded): JournalEntryRequest {
            return JournalEntryRequest(
                transactionDate = ApiClient.jsonConvertSafe(expanded.transactionDate),
                payments = ApiClient.jsonConvertSafe(expanded.payments),
                memo = ApiClient.jsonConvertSafe(expanded.memo),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                exchangeRate = ApiClient.jsonConvertSafe(expanded.exchangeRate),
                company = ApiClient.jsonConvertSafe(expanded.company),
                lines = ApiClient.jsonConvertSafe(expanded.lines),
                postingStatus = ApiClient.jsonConvertSafe(expanded.postingStatus),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

