package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class DOBModel(

    @field:SerializedName("date")
    val date: String? = null,

    @field:SerializedName("age")
    val age: Int? = null
)
