package com.prandroid.cryptohilt.repository

import com.prandroid.cryptohilt.model.Cryptocurrency


interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}