package com.jamesnyakush.digipay.data.repository

import com.jamesnyakush.digipay.data.network.RetrofitBuilder
import com.jamesnyakush.digipay.data.network.SafeApiRequest
import com.jamesnyakush.digipay.data.network.response.LoadWallet

class WalletRepository : SafeApiRequest() {

    suspend fun withdrawWallet(
        phone: String,
        amount: String
    ): LoadWallet {
        return apiRequest { RetrofitBuilder.apiService.withdrawWallet(phone, amount) }
    }

    suspend fun loadWallet(
        phone: String,
        amount: String
    ): LoadWallet {
        return apiRequest { RetrofitBuilder.apiService.loadWallet(phone, amount) }
    }

}