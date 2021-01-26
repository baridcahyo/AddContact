package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class PictureModel(

    @field:SerializedName("thumbnail")
    val thumbnail: String? = null,

    @field:SerializedName("large")
    val large: String? = null,

    @field:SerializedName("medium")
    val medium: String? = null
)
