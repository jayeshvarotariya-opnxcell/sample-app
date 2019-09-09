package com.example.daggersetup.di

import com.example.daggersetup.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class])
interface MainComponent {

    @Component.Factory
    interface Factory{

       fun create(@BindsInstance @Named("name") name :String,
                  @BindsInstance @Named("number") number: String) : MainComponent

    }

    fun inject(mainActivity: MainActivity)


}