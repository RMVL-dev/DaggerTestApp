package com.example.testdaggerapplication.domain

import com.example.testdaggerapplication.model.Photo
import com.example.testdaggerapplication.repository.PhotosRepositoryImpl
import javax.inject.Inject

class UseCase @Inject constructor(
    private val photosRepository: PhotosRepositoryImpl
) {

    suspend fun execute(): List<Photo> =
        photosRepository.getPhotos()

}