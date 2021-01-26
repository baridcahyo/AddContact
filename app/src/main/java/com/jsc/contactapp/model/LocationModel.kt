package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class LocationModel(

    @field:SerializedName("country")
    val country: String? = null,

    @field:SerializedName("city")
    val city: String? = null,

    @field:SerializedName("street")
    val street: List<LocationModel>,

    @field:SerializedName("timezone")
    val timezone: List<TimezoneModel>,

    @field:SerializedName("postcode")
    val postcode: String? = null,

    @field:SerializedName("coordinates")
    val coordinates: List<CoordinatesModel>,

    @field:SerializedName("state")
    val state: String? = null
)
