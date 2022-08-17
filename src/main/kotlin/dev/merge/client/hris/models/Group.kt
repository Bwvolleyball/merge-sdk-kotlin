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

import dev.merge.client.hris.models.GroupTypeEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode

/**
 * # The Group Object ### Description The `Group` object is used to represent Group information that employees belong to. This is often referenced with an Employee object.  Please note: The teams object will fulfill most use cases. The Groups object is for power-users that want all types of groups at a company and the optionality of pulling multiple groups for an employee.  ### Usage Example Fetch from the `LIST Employee` endpoint and expand groups to view an employee's groups.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param parentGroup The parent group for this group.
 * @param name The group name.
 * @param type The group type
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class Group (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The parent group for this group. */
    @field:JsonProperty("parent_group")
    val parentGroup: java.util.UUID? = null,

    /* The group name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The group type */
    @field:JsonProperty("type")
    val type: GroupTypeEnum? = null,

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

        @field:JsonProperty("parent_group")
        val parentGroup: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("type")
        val type: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )

}

