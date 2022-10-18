package com.chachaup.iplant.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ProfileClient {
    private fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://www.randomuser.me/")
            .build()
    }
    val client: UserAPI = getInstance().create(UserAPI::class.java)

}