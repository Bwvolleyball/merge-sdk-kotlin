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

import dev.merge.client.accounting.models.AddressTypeEnum
import dev.merge.client.accounting.models.CountryEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Address Object ### Description The `Address` object is used to represent a contact's or company's address.  ### Usage Example Fetch from the `GET CompanyInfo` endpoint and view the company's addresses.
 *
 * @param type The address type.
 * @param street1 Line 1 of the address's street.
 * @param street2 Line 2 of the address's street.
 * @param city The address's city.
 * @param state The address's state or region.
 * @param countrySubdivision The address's state or region.
 * @param country The address's country.
 * @param zipCode The address's zip code.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Address (

    /* The address type. */
    @field:JsonProperty("type")
    val type: AddressTypeEnum? = null,

    /* Line 1 of the address's street. */
    @field:JsonProperty("street_1")
    val street1: kotlin.String? = null,

    /* Line 2 of the address's street. */
    @field:JsonProperty("street_2")
    val street2: kotlin.String? = null,

    /* The address's city. */
    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    /* The address's state or region. */
    @field:JsonProperty("state")
    val state: kotlin.Any? = null,

    /* The address's state or region. */
    @field:JsonProperty("country_subdivision")
    val countrySubdivision: kotlin.String? = null,

    /* The address's country. */
    @field:JsonProperty("country")
    val country: CountryEnum? = null,

    /* The address's zip code. */
    @field:JsonProperty("zip_code")
    val zipCode: kotlin.String? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("type")
        val type: JsonNode?,

        @field:JsonProperty("street_1")
        val street1: JsonNode?,

        @field:JsonProperty("street_2")
        val street2: JsonNode?,

        @field:JsonProperty("city")
        val city: JsonNode?,

        @field:JsonProperty("state")
        val state: JsonNode?,

        @field:JsonProperty("country_subdivision")
        val countrySubdivision: JsonNode?,

        @field:JsonProperty("country")
        val country: JsonNode?,

        @field:JsonProperty("zip_code")
        val zipCode: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Address.Expanded): Address {
            return Address(
                type = ApiClient.jsonConvertSafe(expanded.type),
                street1 = ApiClient.jsonConvertSafe(expanded.street1),
                street2 = ApiClient.jsonConvertSafe(expanded.street2),
                city = ApiClient.jsonConvertSafe(expanded.city),
                state = ApiClient.jsonConvertSafe(expanded.state),
                countrySubdivision = ApiClient.jsonConvertSafe(expanded.countrySubdivision),
                country = ApiClient.jsonConvertSafe(expanded.country),
                zipCode = ApiClient.jsonConvertSafe(expanded.zipCode)
            )
        }
    }
}

