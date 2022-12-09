package com.chachaup.iplant.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface IPlantInterface {

    companion object{
        operator fun invoke(): IPlantInterface{
            val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
                this.level = HttpLoggingInterceptor.Level.BODY
            }

            val client = OkHttpClient
                .Builder()
                .apply { this.addInterceptor(interceptor) }
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl("https://randomuser.me/api/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(IPlantInterface::class.java)
        }
    }
}