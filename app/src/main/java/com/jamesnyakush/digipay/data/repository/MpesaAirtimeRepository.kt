package com.jamesnyakush.digipay.data.repository

import com.jamesnyakush.digipay.data.network.RetrofitBuilder
import com.jamesnyakush.digipay.data.network.SafeApiRequest
import com.jamesnyakush.digipay.data.network.response.AirtimeMpesa
import com.jamesnyakush.digipay.data.network.response.AirtimeWalletSelf

internal class MpesaAirtimeRepository : SafeApiRequest() {

    suspend fun airtimeSelfMpesa(
        phone: String,
        amount: String
    ): AirtimeWalletSelf {
        return apiRequest { RetrofitBuilder.apiService.airtimeSelfMpesa(phone, amount) }
    }

    suspend fun airtimeOtherMpesa(
        buyer: String,
        recipient: String,
        amount: String
    ): AirtimeMpesa {
        return apiRequest{RetrofitBuilder.apiService.airtimeOtherMpesa(buyer, recipient, amount)}
    }


}