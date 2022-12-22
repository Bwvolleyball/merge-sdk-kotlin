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
import dev.merge.client.accounting.models.ReportItem

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The IncomeStatement Object ### Description The `IncomeStatement` object is used to represent a company's income statements.  ### Usage Example Fetch from the `GET IncomeStatement` endpoint and view a company's income statement for a given period.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param name The income statement's name.
 * @param currency The income statement's currency.
 * @param company The company the income statement belongs to.
 * @param startPeriod The income statement's start period.
 * @param endPeriod The income statement's end period.
 * @param income 
 * @param costOfSales 
 * @param grossProfit The income statement's gross profit.
 * @param operatingExpenses 
 * @param netOperatingIncome The income statement's net operating profit.
 * @param nonOperatingExpenses 
 * @param netIncome The income statement's net income.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class IncomeStatement (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The income statement's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The income statement's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* The company the income statement belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    /* The income statement's start period. */
    @field:JsonProperty("start_period")
    val startPeriod: java.time.OffsetDateTime? = null,

    /* The income statement's end period. */
    @field:JsonProperty("end_period")
    val endPeriod: java.time.OffsetDateTime? = null,

    @field:JsonProperty("income")
    val income: kotlin.collections.List<ReportItem>? = null,

    @field:JsonProperty("cost_of_sales")
    val costOfSales: kotlin.collections.List<ReportItem>? = null,

    /* The income statement's gross profit. */
    @field:JsonProperty("gross_profit")
    val grossProfit: kotlin.Float? = null,

    @field:JsonProperty("operating_expenses")
    val operatingExpenses: kotlin.collections.List<ReportItem>? = null,

    /* The income statement's net operating profit. */
    @field:JsonProperty("net_operating_income")
    val netOperatingIncome: kotlin.Float? = null,

    @field:JsonProperty("non_operating_expenses")
    val nonOperatingExpenses: kotlin.collections.List<ReportItem>? = null,

    /* The income statement's net income. */
    @field:JsonProperty("net_income")
    val netIncome: kotlin.Float? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("start_period")
        val startPeriod: JsonNode?,

        @field:JsonProperty("end_period")
        val endPeriod: JsonNode?,

        @field:JsonProperty("income")
        val income: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("cost_of_sales")
        val costOfSales: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("gross_profit")
        val grossProfit: JsonNode?,

        @field:JsonProperty("operating_expenses")
        val operatingExpenses: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("net_operating_income")
        val netOperatingIncome: JsonNode?,

        @field:JsonProperty("non_operating_expenses")
        val nonOperatingExpenses: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("net_income")
        val netIncome: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: IncomeStatement.Expanded): IncomeStatement {
            return IncomeStatement(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                name = ApiClient.jsonConvertSafe(expanded.name),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                company = ApiClient.jsonConvertSafe(expanded.company),
                startPeriod = ApiClient.jsonConvertSafe(expanded.startPeriod),
                endPeriod = ApiClient.jsonConvertSafe(expanded.endPeriod),
                income = ApiClient.jsonConvertSafe(expanded.income),
                costOfSales = ApiClient.jsonConvertSafe(expanded.costOfSales),
                grossProfit = ApiClient.jsonConvertSafe(expanded.grossProfit),
                operatingExpenses = ApiClient.jsonConvertSafe(expanded.operatingExpenses),
                netOperatingIncome = ApiClient.jsonConvertSafe(expanded.netOperatingIncome),
                nonOperatingExpenses = ApiClient.jsonConvertSafe(expanded.nonOperatingExpenses),
                netIncome = ApiClient.jsonConvertSafe(expanded.netIncome),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings)
            )
        }
    }
}

