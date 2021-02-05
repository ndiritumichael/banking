package com.jamesnyakush.digipay.data.repository

import com.jamesnyakush.digipay.data.network.RetrofitBuilder
import com.jamesnyakush.digipay.data.network.SafeApiRequest
import com.jamesnyakush.digipay.data.network.response.AirtimeWalletSelf
import com.jamesnyakush.digipay.data.network.response.Airtimewallet

internal class EarningsAirtimeRepository : SafeApiRequest() {

    suspend fun airtimeSelfEarnings(
        phone: String,
        amount: String
    ): AirtimeWalletSelf {
        return apiRequest { RetrofitBuilder.apiService.airtimeSelfEarnings(phone, amount) }
    }

    suspend fun airtimeOtherEarnings(
        buyer: String,
        recipient: String,
        amount: String
    ): Airtimewallet {
        return apiRequest {
            RetrofitBuilder.apiService.airtimeOtherEarnings(
                buyer,
                recipient,
                amount
            )
        }
    }
}