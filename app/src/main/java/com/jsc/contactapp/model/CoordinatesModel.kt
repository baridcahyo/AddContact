package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class CoordinatesModel(

    @field:SerializedName("latitude")
    val latitude: String? = null,

    @field:SerializedName("longitude")
    val longitude: String? = null
)
