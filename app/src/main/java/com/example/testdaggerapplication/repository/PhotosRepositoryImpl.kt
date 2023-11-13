package com.example.testdaggerapplication.repository

import com.example.testdaggerapplication.model.Photo
import com.example.testdaggerapplication.network.MarsPhotosService
import javax.inject.Inject

class PhotosRepositoryImpl @Inject constructor(
    private val service: MarsPhotosService
):PhotosRepository{
    override suspend fun getPhotos(): List<Photo> = service.getPhotos()
}