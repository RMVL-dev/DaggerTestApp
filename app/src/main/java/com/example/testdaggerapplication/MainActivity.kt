package com.example.testdaggerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testdaggerapplication.databinding.ActivityMainBinding
import com.example.testdaggerapplication.viewmodel.PhotosViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var viewModel: PhotosViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.marsPhotos.observe(this){
            binding.textView.text = "Received ${it.size} photos"
        }
    }
}