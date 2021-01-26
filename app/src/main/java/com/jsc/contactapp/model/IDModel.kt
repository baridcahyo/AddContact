package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class IDModel(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("value")
    val value: String? = null
)
