package com.example.testdaggerapplication.di

import com.example.testdaggerapplication.network.MarsPhotosService
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
class NetworkModule {

    companion object{
        private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"
        private val CONVERTER_FACTORY = Json{ignoreUnknownKeys = true}.asConverterFactory("application/json".toMediaType())
    }

    //@Binds
    //fun provideNetworkConnection(){}

    @Provides
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            //.addConverterFactory(CONVERTER_FACTORY)
            //.addConverterFactory(Json{ignoreUnknownKeys = true}.asConverterFactory("application/json".toMediaType()))
            .build()


    @Provides
    fun provideMarsService(retrofit: Retrofit):MarsPhotosService =
        retrofit.create(MarsPhotosService::class.java)
}