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

import dev.merge.client.hris.models.EmploymentStatusEnum
import dev.merge.client.hris.models.EthnicityEnum
import dev.merge.client.hris.models.GenderEnum
import dev.merge.client.hris.models.MaritalStatusEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Employee Object ### Description The `Employee` object is used to represent an Employee for a company.  ### Usage Example Fetch from the `LIST Employee` endpoint and filter by `ID` to show all employees.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param employeeNumber The employee's number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user. This value can also change in many API providers.
 * @param company 
 * @param firstName The employee's first name.
 * @param lastName The employee's last name.
 * @param displayFullName The employee's full name, to use for display purposes. If a preferred first name is available, the full name will include the preferred first name.
 * @param username The employee's username that appears in the remote UI.
 * @param groups 
 * @param workEmail The employee's work email.
 * @param personalEmail The employee's personal email.
 * @param mobilePhoneNumber The employee's mobile phone number.
 * @param employments Array of `Employment` IDs for this Employee.
 * @param homeLocation 
 * @param workLocation 
 * @param manager 
 * @param team 
 * @param payGroup 
 * @param ssn The employee's social security number.
 * @param gender The employee's gender.
 * @param ethnicity The employee's ethnicity.
 * @param maritalStatus The employee's marital status.
 * @param dateOfBirth The employee's date of birth.
 * @param hireDate The date that the employee was hired, usually the day that an offer letter is signed. If an employee has multiple hire dates from previous employments, this represents the most recent hire date. Note: If you're looking for the employee's start date, refer to the start_date field.
 * @param startDate The date that the employee started working. If an employee has multiple start dates from previous employments, this represents the most recent start date.
 * @param remoteCreatedAt When the third party's employee was created.
 * @param employmentStatus The employment status of the employee.
 * @param terminationDate The employee's termination date.
 * @param avatar The URL of the employee's avatar image.
 * @param customFields Custom fields configured for a given model.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class EmployeeRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The employee's number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user. This value can also change in many API providers. */
    @field:JsonProperty("employee_number")
    val employeeNumber: kotlin.String? = null,

    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    /* The employee's first name. */
    @field:JsonProperty("first_name")
    val firstName: kotlin.String? = null,

    /* The employee's last name. */
    @field:JsonProperty("last_name")
    val lastName: kotlin.String? = null,

    /* The employee's full name, to use for display purposes. If a preferred first name is available, the full name will include the preferred first name. */
    @field:JsonProperty("display_full_name")
    val displayFullName: kotlin.String? = null,

    /* The employee's username that appears in the remote UI. */
    @field:JsonProperty("username")
    val username: kotlin.String? = null,

    @field:JsonProperty("groups")
    val groups: kotlin.collections.List<java.util.UUID>? = null,

    /* The employee's work email. */
    @field:JsonProperty("work_email")
    val workEmail: kotlin.String? = null,

    /* The employee's personal email. */
    @field:JsonProperty("personal_email")
    val personalEmail: kotlin.String? = null,

    /* The employee's mobile phone number. */
    @field:JsonProperty("mobile_phone_number")
    val mobilePhoneNumber: kotlin.String? = null,

    /* Array of `Employment` IDs for this Employee. */
    @field:JsonProperty("employments")
    val employments: kotlin.collections.List<java.util.UUID>? = null,

    @field:JsonProperty("home_location")
    val homeLocation: java.util.UUID? = null,

    @field:JsonProperty("work_location")
    val workLocation: java.util.UUID? = null,

    @field:JsonProperty("manager")
    val manager: java.util.UUID? = null,

    @field:JsonProperty("team")
    val team: java.util.UUID? = null,

    @field:JsonProperty("pay_group")
    val payGroup: java.util.UUID? = null,

    /* The employee's social security number. */
    @field:JsonProperty("ssn")
    val ssn: kotlin.String? = null,

    /* The employee's gender. */
    @field:JsonProperty("gender")
    val gender: GenderEnum? = null,

    /* The employee's ethnicity. */
    @field:JsonProperty("ethnicity")
    val ethnicity: EthnicityEnum? = null,

    /* The employee's marital status. */
    @field:JsonProperty("marital_status")
    val maritalStatus: MaritalStatusEnum? = null,

    /* The employee's date of birth. */
    @field:JsonProperty("date_of_birth")
    val dateOfBirth: java.time.OffsetDateTime? = null,

    /* The date that the employee was hired, usually the day that an offer letter is signed. If an employee has multiple hire dates from previous employments, this represents the most recent hire date. Note: If you're looking for the employee's start date, refer to the start_date field. */
    @field:JsonProperty("hire_date")
    @Deprecated(message = "This property is deprecated.")
    val hireDate: java.time.OffsetDateTime? = null,

    /* The date that the employee started working. If an employee has multiple start dates from previous employments, this represents the most recent start date. */
    @field:JsonProperty("start_date")
    val startDate: java.time.OffsetDateTime? = null,

    /* When the third party's employee was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* The employment status of the employee. */
    @field:JsonProperty("employment_status")
    val employmentStatus: EmploymentStatusEnum? = null,

    /* The employee's termination date. */
    @field:JsonProperty("termination_date")
    val terminationDate: java.time.OffsetDateTime? = null,

    /* The URL of the employee's avatar image. */
    @field:JsonProperty("avatar")
    val avatar: java.net.URI? = null,

    /* Custom fields configured for a given model. */
    @field:JsonProperty("custom_fields")
    val customFields: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("employee_number")
        val employeeNumber: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("first_name")
        val firstName: JsonNode?,

        @field:JsonProperty("last_name")
        val lastName: JsonNode?,

        @field:JsonProperty("display_full_name")
        val displayFullName: JsonNode?,

        @field:JsonProperty("username")
        val username: JsonNode?,

        @field:JsonProperty("groups")
        val groups: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("work_email")
        val workEmail: JsonNode?,

        @field:JsonProperty("personal_email")
        val personalEmail: JsonNode?,

        @field:JsonProperty("mobile_phone_number")
        val mobilePhoneNumber: JsonNode?,

        @field:JsonProperty("employments")
        val employments: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("home_location")
        val homeLocation: JsonNode?,

        @field:JsonProperty("work_location")
        val workLocation: JsonNode?,

        @field:JsonProperty("manager")
        val manager: JsonNode?,

        @field:JsonProperty("team")
        val team: JsonNode?,

        @field:JsonProperty("pay_group")
        val payGroup: JsonNode?,

        @field:JsonProperty("ssn")
        val ssn: JsonNode?,

        @field:JsonProperty("gender")
        val gender: JsonNode?,

        @field:JsonProperty("ethnicity")
        val ethnicity: JsonNode?,

        @field:JsonProperty("marital_status")
        val maritalStatus: JsonNode?,

        @field:JsonProperty("date_of_birth")
        val dateOfBirth: JsonNode?,

        @field:JsonProperty("hire_date")
        val hireDate: JsonNode?,

        @field:JsonProperty("start_date")
        val startDate: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("employment_status")
        val employmentStatus: JsonNode?,

        @field:JsonProperty("termination_date")
        val terminationDate: JsonNode?,

        @field:JsonProperty("avatar")
        val avatar: JsonNode?,

        @field:JsonProperty("custom_fields")
        val customFields: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: EmployeeRequest.Expanded): EmployeeRequest {
            return EmployeeRequest(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                employeeNumber = ApiClient.jsonConvertSafe(expanded.employeeNumber),
                company = ApiClient.jsonConvertSafe(expanded.company),
                firstName = ApiClient.jsonConvertSafe(expanded.firstName),
                lastName = ApiClient.jsonConvertSafe(expanded.lastName),
                displayFullName = ApiClient.jsonConvertSafe(expanded.displayFullName),
                username = ApiClient.jsonConvertSafe(expanded.username),
                groups = ApiClient.jsonConvertSafe(expanded.groups),
                workEmail = ApiClient.jsonConvertSafe(expanded.workEmail),
                personalEmail = ApiClient.jsonConvertSafe(expanded.personalEmail),
                mobilePhoneNumber = ApiClient.jsonConvertSafe(expanded.mobilePhoneNumber),
                employments = ApiClient.jsonConvertSafe(expanded.employments),
                homeLocation = ApiClient.jsonConvertSafe(expanded.homeLocation),
                workLocation = ApiClient.jsonConvertSafe(expanded.workLocation),
                manager = ApiClient.jsonConvertSafe(expanded.manager),
                team = ApiClient.jsonConvertSafe(expanded.team),
                payGroup = ApiClient.jsonConvertSafe(expanded.payGroup),
                ssn = ApiClient.jsonConvertSafe(expanded.ssn),
                gender = ApiClient.jsonConvertSafe(expanded.gender),
                ethnicity = ApiClient.jsonConvertSafe(expanded.ethnicity),
                maritalStatus = ApiClient.jsonConvertSafe(expanded.maritalStatus),
                dateOfBirth = ApiClient.jsonConvertSafe(expanded.dateOfBirth),
                hireDate = ApiClient.jsonConvertSafe(expanded.hireDate),
                startDate = ApiClient.jsonConvertSafe(expanded.startDate),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                employmentStatus = ApiClient.jsonConvertSafe(expanded.employmentStatus),
                terminationDate = ApiClient.jsonConvertSafe(expanded.terminationDate),
                avatar = ApiClient.jsonConvertSafe(expanded.avatar),
                customFields = ApiClient.jsonConvertSafe(expanded.customFields),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

