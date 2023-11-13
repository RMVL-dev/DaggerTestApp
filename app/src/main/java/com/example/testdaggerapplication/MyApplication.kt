package com.example.testdaggerapplication

import android.app.Application
import com.example.testdaggerapplication.di.AppComponent
import com.example.testdaggerapplication.di.DaggerAppComponent

class MyApplication:Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(context = applicationContext)
    }


}