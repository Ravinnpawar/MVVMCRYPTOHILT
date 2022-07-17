package com.prandroid.cryptohilt.module

import com.prandroid.cryptohilt.impl.CryptocurrencyRepositoryImpl
import com.prandroid.cryptohilt.repository.CryptocurrencyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideCryptocurrencyRepository(): CryptocurrencyRepository = CryptocurrencyRepositoryImpl()
}