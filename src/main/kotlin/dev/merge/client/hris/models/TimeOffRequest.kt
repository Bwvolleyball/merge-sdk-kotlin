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

import dev.merge.client.hris.models.RequestTypeEnum
import dev.merge.client.hris.models.TimeOffStatusEnum
import dev.merge.client.hris.models.UnitsEnum

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The TimeOff Object ### Description The `TimeOff` object is used to represent a Time Off Request filed by an employee.  ### Usage Example Fetch from the `LIST TimeOffs` endpoint and filter by `ID` to show all time off requests.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param employee 
 * @param approver 
 * @param status The status of this time off request.
 * @param employeeNote The employee note for this time off request.
 * @param units The unit of time requested.
 * @param amount The number of time off units requested.
 * @param requestType The type of time off request.
 * @param startTime The day and time of the start of the time requested off.
 * @param endTime The day and time of the end of the time requested off.
 */

data class TimeOffRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("employee")
    val employee: java.util.UUID? = null,

    @field:JsonProperty("approver")
    val approver: java.util.UUID? = null,

    /* The status of this time off request. */
    @field:JsonProperty("status")
    val status: TimeOffStatusEnum? = null,

    /* The employee note for this time off request. */
    @field:JsonProperty("employee_note")
    val employeeNote: kotlin.String? = null,

    /* The unit of time requested. */
    @field:JsonProperty("units")
    val units: UnitsEnum? = null,

    /* The number of time off units requested. */
    @field:JsonProperty("amount")
    val amount: kotlin.Float? = null,

    /* The type of time off request. */
    @field:JsonProperty("request_type")
    val requestType: RequestTypeEnum? = null,

    /* The day and time of the start of the time requested off. */
    @field:JsonProperty("start_time")
    val startTime: java.time.OffsetDateTime? = null,

    /* The day and time of the end of the time requested off. */
    @field:JsonProperty("end_time")
    val endTime: java.time.OffsetDateTime? = null

) {

    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("employee")
        val employee: JsonNode?,

        @field:JsonProperty("approver")
        val approver: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("employee_note")
        val employeeNote: JsonNode?,

        @field:JsonProperty("units")
        val units: JsonNode?,

        @field:JsonProperty("amount")
        val amount: JsonNode?,

        @field:JsonProperty("request_type")
        val requestType: JsonNode?,

        @field:JsonProperty("start_time")
        val startTime: JsonNode?,

        @field:JsonProperty("end_time")
        val endTime: JsonNode?

    )


    companion object {
        fun normalize(expanded: TimeOffRequest.Expanded): TimeOffRequest {
            return TimeOffRequest(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                employee = ApiClient.jsonConvertSafe(expanded.employee),
                approver = ApiClient.jsonConvertSafe(expanded.approver),
                status = ApiClient.jsonConvertSafe(expanded.status),
                employeeNote = ApiClient.jsonConvertSafe(expanded.employeeNote),
                units = ApiClient.jsonConvertSafe(expanded.units),
                amount = ApiClient.jsonConvertSafe(expanded.amount),
                requestType = ApiClient.jsonConvertSafe(expanded.requestType),
                startTime = ApiClient.jsonConvertSafe(expanded.startTime),
                endTime = ApiClient.jsonConvertSafe(expanded.endTime)
            )
        }
    }
}
