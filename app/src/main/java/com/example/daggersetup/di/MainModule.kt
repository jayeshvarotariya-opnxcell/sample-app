package com.example.daggersetup.di

import com.example.daggersetup.Mobile
import com.example.daggersetup.User
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class MainModule {


    @Singleton
    @Provides
    fun provideUser(@Named("name") name: String,mobile: Mobile) : User = User(name,mobile)


}