/**
 * Merge HRIS API
 *
 * The unified API for building rich integrations with multiple HR Information System platforms.
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

package dev.merge.client.hris.models

import dev.merge.client.hris.models.PolicyTypeEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * # The TimeOffBalance Object ### Description The `TimeOffBalance` object is used to represent a Time Off Balance for an employee.  ### Usage Example Fetch from the `LIST TimeOffBalances` endpoint and filter by `ID` to show all time off balances.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param employee 
 * @param balance The current remaining PTO balance in terms of hours. This does not represent the starting PTO balance. If the API provider only provides PTO balance in terms of days, we estimate 8 hours per day.
 * @param used The amount of PTO used in terms of hours.
 * @param policyType The policy type of this time off balance.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class TimeOffBalance (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("employee")
    val employee: java.util.UUID? = null,

    /* The current remaining PTO balance in terms of hours. This does not represent the starting PTO balance. If the API provider only provides PTO balance in terms of days, we estimate 8 hours per day. */
    @field:JsonProperty("balance")
    val balance: kotlin.Float? = null,

    /* The amount of PTO used in terms of hours. */
    @field:JsonProperty("used")
    val used: kotlin.Float? = null,

    /* The policy type of this time off balance. */
    @field:JsonProperty("policy_type")
    val policyType: PolicyTypeEnum? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("employee")
        val employee: JsonNode?,

        @field:JsonProperty("balance")
        val balance: JsonNode?,

        @field:JsonProperty("used")
        val used: JsonNode?,

        @field:JsonProperty("policy_type")
        val policyType: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )

}

