package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class ResponseModel(

    @field:SerializedName("results")
    val results: ArrayList<PersonModel>,

    @field:SerializedName("info")
    val info: String? = null
)
