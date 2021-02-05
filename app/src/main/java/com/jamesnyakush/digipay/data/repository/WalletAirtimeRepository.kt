package com.jamesnyakush.digipay.data.repository

import com.jamesnyakush.digipay.data.network.RetrofitBuilder
import com.jamesnyakush.digipay.data.network.SafeApiRequest
import com.jamesnyakush.digipay.data.network.response.AirtimeWalletSelf

internal class WalletAirtimeRepository : SafeApiRequest() {

    suspend fun airtimeSelfWallet(
        phone: String,
        amount: String
    ): AirtimeWalletSelf {
        return apiRequest { RetrofitBuilder.apiService.airtimeSelfWallet(phone, amount) }
    }

    suspend fun airtimeOtherWallet(
        buyer: String,
        recipient: String,
        amount: String
    ): AirtimeWalletSelf {
        return apiRequest {
            RetrofitBuilder.apiService.airtimeOtherWallet(
                buyer,
                recipient,
                amount
            )
        }
    }
}