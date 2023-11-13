package com.example.testdaggerapplication.di

import android.content.Context
import com.example.testdaggerapplication.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context:Context):AppComponent
    }

    fun inject(activity: MainActivity)
}