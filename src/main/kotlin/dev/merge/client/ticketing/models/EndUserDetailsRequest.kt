/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.models

import dev.merge.client.ticketing.models.CategoriesEnum

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * 
 *
 * @param endUserEmailAddress Unique ID for your end user.
 * @param endUserOrganizationName Your end user's organization.
 * @param endUserOriginId Your end user's email address.
 * @param categories The integration categories to show in Merge Link.
 * @param integration The slug of a specific pre-selected integration for this linking flow token. For examples of slugs, see https://www.merge.dev/docs/basics/integration-metadata/.
 * @param linkExpiryMins An integer number of minutes between [30, 720 or 10080 if for a Magic Link URL] for how long this token is valid. Defaults to 30.
 * @param shouldCreateMagicLinkUrl Whether to generate a Magic Link URL. Defaults to false. For more information on Magic Link, see https://merge.dev/blog/product/integrations,-fast.-say-hello-to-magic-link/.
 */

data class EndUserDetailsRequest (

    /* Unique ID for your end user. */
    @field:JsonProperty("end_user_email_address")
    val endUserEmailAddress: kotlin.String,

    /* Your end user's organization. */
    @field:JsonProperty("end_user_organization_name")
    val endUserOrganizationName: kotlin.String,

    /* Your end user's email address. */
    @field:JsonProperty("end_user_origin_id")
    val endUserOriginId: kotlin.String,

    /* The integration categories to show in Merge Link. */
    @field:JsonProperty("categories")
    val categories: kotlin.collections.List<CategoriesEnum>,

    /* The slug of a specific pre-selected integration for this linking flow token. For examples of slugs, see https://www.merge.dev/docs/basics/integration-metadata/. */
    @field:JsonProperty("integration")
    val integration: kotlin.String? = null,

    /* An integer number of minutes between [30, 720 or 10080 if for a Magic Link URL] for how long this token is valid. Defaults to 30. */
    @field:JsonProperty("link_expiry_mins")
    val linkExpiryMins: kotlin.Int? = 30,

    /* Whether to generate a Magic Link URL. Defaults to false. For more information on Magic Link, see https://merge.dev/blog/product/integrations,-fast.-say-hello-to-magic-link/. */
    @field:JsonProperty("should_create_magic_link_url")
    val shouldCreateMagicLinkUrl: kotlin.Boolean? = false

) {

    data class Expanded(
        @field:JsonProperty("end_user_email_address")
        val endUserEmailAddress: JsonNode?,

        @field:JsonProperty("end_user_organization_name")
        val endUserOrganizationName: JsonNode?,

        @field:JsonProperty("end_user_origin_id")
        val endUserOriginId: JsonNode?,

        @field:JsonProperty("categories")
        val categories: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("integration")
        val integration: JsonNode?,

        @field:JsonProperty("link_expiry_mins")
        val linkExpiryMins: JsonNode?,

        @field:JsonProperty("should_create_magic_link_url")
        val shouldCreateMagicLinkUrl: JsonNode?

    )

}

