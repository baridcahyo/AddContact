package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class StreetModel(

    @field:SerializedName("number")
    val number: Int? = null,

    @field:SerializedName("name")
    val name: String? = null
)
