package com.jsc.contactapp.api

import com.jsc.contactapp.model.ResponseModel
import retrofit2.Call
import retrofit2.http.GET

interface RequestAPI {

    @GET("api?results=10&exc=login,registered,i")
    fun getRandomUser(): Call<List<ResponseModel>>

}