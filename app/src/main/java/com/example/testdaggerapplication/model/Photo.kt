package com.example.testdaggerapplication.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Photo(
    @SerialName("id")
    val userID: String,
    @SerialName("img_src")
    val imgUrl:String
)
