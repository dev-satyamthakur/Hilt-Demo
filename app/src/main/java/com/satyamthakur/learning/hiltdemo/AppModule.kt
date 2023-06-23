package com.satyamthakur.learning.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object AppModule {

    @Provides
    @Named("String1")
    fun provideTestString1() = "This is a string that will be injected"

    @Provides
    @Named("String2")
    fun provideTestString2() = "This is another string that will be injected as well "

}