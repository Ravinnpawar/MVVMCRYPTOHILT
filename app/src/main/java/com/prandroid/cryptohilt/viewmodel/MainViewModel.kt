package com.prandroid.cryptohilt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.prandroid.cryptohilt.model.Cryptocurrency
import com.prandroid.cryptohilt.repository.CryptocurrencyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val cryptocurrencyRepository: CryptocurrencyRepository
) : ViewModel() {
    private val cryptocurrencyEmitter = MutableLiveData<List<Cryptocurrency>>()
    val cryptoCurrency: LiveData<List<Cryptocurrency>> = cryptocurrencyEmitter
    init {
        loadCryptocurrency()
    }

    // getting cryptocurrencies list using
    // repository and passing it into live data
    private fun loadCryptocurrency() {
        cryptocurrencyEmitter.value = cryptocurrencyRepository.getCryptoCurrency()
    }

}