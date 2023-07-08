package com.example.networking

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit

const val BASE_URL = ""


val contentType = "application/json".toMediaType()
private val json = Json
/**
 * Main entry point for network access.
 */
object ApiCall {
    // Configure retrofit to parse JSON and use coroutines
    @OptIn(ExperimentalSerializationApi::class)
    fun getRetrofitInstance(okHttpClient: OkHttpClient = OkHttpClient()): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(json.asConverterFactory(contentType))
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }
   //  service use to send network request
//    val RETROFIT_SERVICE: ApiService by lazy {
//        getRetrofitInstance().create(ApiService::class.java)
//    }
}