package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class TimezoneModel(

    @field:SerializedName("offset")
    val offset: String? = null,

    @field:SerializedName("description")
    val description: String? = null
)
