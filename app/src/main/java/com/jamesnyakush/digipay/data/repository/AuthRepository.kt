package com.jamesnyakush.digipay.data.repository

import com.jamesnyakush.digipay.data.db.AppDatabase
import com.jamesnyakush.digipay.data.network.RetrofitBuilder
import com.jamesnyakush.digipay.data.network.SafeApiRequest
import com.jamesnyakush.digipay.data.network.response.AuthResponse

internal class AuthRepository(
    db : AppDatabase
) : SafeApiRequest(){

    suspend fun userLogin(
        phone: String,
        password:String
    ) : AuthResponse {
        return apiRequest { RetrofitBuilder.apiService.userLogin(phone, password) }
    }


    suspend fun userRegister(
        name :String,
        email :String,
        phone: String,
        promocode :String,
        subscription:String,
        password: String
    ) : AuthResponse{
        return apiRequest {
            RetrofitBuilder.apiService.userResister(name, email, phone, promocode, subscription, password)
        }
    }
}