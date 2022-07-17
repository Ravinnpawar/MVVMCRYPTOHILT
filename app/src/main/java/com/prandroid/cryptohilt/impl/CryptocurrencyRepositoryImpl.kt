package com.prandroid.cryptohilt.impl

import com.prandroid.cryptohilt.model.Cryptocurrency
import com.prandroid.cryptohilt.repository.CryptocurrencyRepository

class CryptocurrencyRepositoryImpl : CryptocurrencyRepository {
    // Overriding the interface method and
    // providing implementation to it
    override fun getCryptoCurrency() = listOf(
        // here we are adding images from wikipedia
        Cryptocurrency("https://phantom-marca.unidadeditorial.es/64e3b9a5d9f85d841c0e4752eb782028/resize/1320/f/jpg/assets/multimedia/imagenes/2022/05/14/16525440098487.jpg", "BitCoin"),
        Cryptocurrency("https://thumbor.forbes.com/thumbor/fit-in/x/https://www.forbes.com/advisor/ca/wp-content/uploads/2022/05/ethereum-1.jpeg", "Ethereum"),
        Cryptocurrency("https://public.bnbstatic.com/static/images/common/ogImage.jpg", "Binance"),
        Cryptocurrency("https://watcher.guru/news/wp-content/uploads/2022/07/Dogecoin-1.jpg", "DogeCoin"),
        Cryptocurrency("https://thumbor.forbes.com/thumbor/fit-in/900x510/https://www.forbes.com/advisor/wp-content/uploads/2022/05/litecoin_getty.jpeg.jpg", "LiteCoin"),
        Cryptocurrency("https://www.financemagnates.com/wp-content/uploads/2018/05/stellar.jpg", "Stellar"),
        Cryptocurrency("https://public.bnbstatic.com/static/academy/uploads/ee705c26cee74f3b962238e36ef563be.png", "Polkadot"),
    )
}