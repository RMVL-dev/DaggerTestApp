package com.example.testdaggerapplication.viewmodel

import androidx.lifecycle.*
import com.example.testdaggerapplication.domain.UseCase
import com.example.testdaggerapplication.model.Photo
import kotlinx.coroutines.launch
import javax.inject.Inject


class PhotosViewModel @Inject constructor(
    private val useCase: UseCase
):ViewModel() {

    private val _marsPhotos = MutableLiveData<List<Photo>>()
    val marsPhotos:LiveData<List<Photo>>
        get ()= _marsPhotos

    init {
        getPhotos()
    }

    private fun getPhotos(){
        viewModelScope.launch {
            _marsPhotos.value = useCase.execute()
            //try {
            //    useCase.execute()
            //}catch (e:Exception){
            //    listOf(
            //        Photos(
            //            id = "$e",
            //            imgUrl = ""
            //        )
            //    )
            //}
        }

    }
}