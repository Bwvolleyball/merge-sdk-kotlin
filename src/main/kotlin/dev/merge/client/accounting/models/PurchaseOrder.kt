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
import dev.merge.client.accounting.models.PurchaseOrderLineItem
import dev.merge.client.accounting.models.PurchaseOrderStatusEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * # The PurchaseOrder Object ### Description The `PurchaseOrder` object is used to represent a company's purchase orders.  ### Usage Example Fetch from the `LIST PurchaseOrders` endpoint and view a company's purchase orders.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param status The purchase order's status.
 * @param issueDate The purchase order's issue date.
 * @param deliveryDate The purchase order's delivery date.
 * @param deliveryAddress The purchase order's delivery address.
 * @param customer The purchase order's customer.
 * @param vendor The purchase_order's vendor.
 * @param memo A memo attached to the purchase order.
 * @param totalAmount The purchase order's total amount.
 * @param currency The purchase order's currency.
 * @param lineItems 
 * @param remoteCreatedAt When the third party's purchase order note was created.
 * @param remoteUpdatedAt When the third party's purchase order note was updated.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class PurchaseOrder (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The purchase order's status. */
    @field:JsonProperty("status")
    val status: PurchaseOrderStatusEnum? = null,

    /* The purchase order's issue date. */
    @field:JsonProperty("issue_date")
    val issueDate: java.time.OffsetDateTime? = null,

    /* The purchase order's delivery date. */
    @field:JsonProperty("delivery_date")
    val deliveryDate: java.time.OffsetDateTime? = null,

    /* The purchase order's delivery address. */
    @field:JsonProperty("delivery_address")
    val deliveryAddress: java.util.UUID? = null,

    /* The purchase order's customer. */
    @field:JsonProperty("customer")
    val customer: java.util.UUID? = null,

    /* The purchase_order's vendor. */
    @field:JsonProperty("vendor")
    val vendor: java.util.UUID? = null,

    /* A memo attached to the purchase order. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    /* The purchase order's total amount. */
    @field:JsonProperty("total_amount")
    val totalAmount: kotlin.Float? = null,

    /* The purchase order's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    @field:JsonProperty("line_items")
    val lineItems: kotlin.collections.List<PurchaseOrderLineItem>? = null,

    /* When the third party's purchase order note was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's purchase order note was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

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

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("issue_date")
        val issueDate: JsonNode?,

        @field:JsonProperty("delivery_date")
        val deliveryDate: JsonNode?,

        @field:JsonProperty("delivery_address")
        val deliveryAddress: JsonNode?,

        @field:JsonProperty("customer")
        val customer: JsonNode?,

        @field:JsonProperty("vendor")
        val vendor: JsonNode?,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

        @field:JsonProperty("total_amount")
        val totalAmount: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("line_items")
        val lineItems: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )

}

