package com.satyamthakur.learning.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponentManager::class)
object AppModule {

    @Singleton
    @Provides
    fun provideTestString() = "This is a string that will be injected"

}