package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class NameUserModel(

    @field:SerializedName("last")
    val last: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("first")
    val first: String? = null

)
