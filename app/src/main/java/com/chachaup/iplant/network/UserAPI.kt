package com.chachaup.iplant.network

import com.chachaup.iplant.RandomUserResponse
import retrofit2.Response
import retrofit2.http.GET

interface UserAPI {
    @GET("api")
    fun getProfile(): Response<RandomUserResponse>
}