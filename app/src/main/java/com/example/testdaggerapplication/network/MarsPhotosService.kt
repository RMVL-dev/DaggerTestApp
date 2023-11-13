package com.example.testdaggerapplication.network

import com.example.testdaggerapplication.model.Photo
import retrofit2.http.GET

interface MarsPhotosService {
    @GET("photos")
    suspend fun getPhotos():List<Photo>
}