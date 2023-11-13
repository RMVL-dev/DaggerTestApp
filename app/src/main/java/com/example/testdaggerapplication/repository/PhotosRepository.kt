package com.example.testdaggerapplication.repository

import com.example.testdaggerapplication.model.Photo

interface PhotosRepository {
    suspend fun getPhotos():List<Photo>
}