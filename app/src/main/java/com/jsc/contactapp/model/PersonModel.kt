package com.jsc.contactapp.model

import com.google.gson.annotations.SerializedName

data class PersonModel(

    @field:SerializedName("nat")
    val nat: String? = null,

    @field:SerializedName("gender")
    val gender: String? = null,

    @field:SerializedName("phone")
    val phone: String? = null,

    @field:SerializedName("dob")
    val dob: List<DOBModel>,

    @field:SerializedName("name")
    val name: List<NameUserModel>,

    @field:SerializedName("location")
    val location: List<LocationModel>,

    @field:SerializedName("id")
    val id: List<IDModel>,

    @field:SerializedName("cell")
    val cell: String? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("picture")
    val picture: List<PictureModel>

)
