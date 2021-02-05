package com.jamesnyakush.digipay.data.network

import com.jamesnyakush.digipay.data.network.response.*
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("login.php")
    suspend fun userLogin(
        @Field("phone") phone: String,
        @Field("password") password: String
    ): Response<AuthResponse>

    @FormUrlEncoded
    @POST("register.php")
    suspend fun userResister(
        @Field("name") name:String,
        @Field("email") email:String,
        @Field("phone") phone: String,
        @Field("promocode") promocode:String,
        @Field("subscription") subscription:String,
        @Field("password") password: String
    ): Response<AuthResponse>

    @FormUrlEncoded
    @POST("buyairtimewallet.php")
    suspend fun airtimeSelfWallet(
        @Field("phone") phone: String,
        @Field("amount") amount: String
    ): Response<AirtimeWalletSelf>

    @FormUrlEncoded
    @POST("buyairtimewallet.php")
    suspend fun airtimeSelfEarnings(
        @Field("phone") phone: String,
        @Field("amount") amount: String
    ): Response<AirtimeWalletSelf>

    @FormUrlEncoded
    @POST("buyairtimewallet.php")
    suspend fun airtimeSelfMpesa(
        @Field("phone") phone: String,
        @Field("amount") amount: String
    ): Response<AirtimeWalletSelf>

    @FormUrlEncoded
    @POST("buyairtimewallet.php")
    suspend fun airtimeOtherWallet(
        @Field("buyer") buyer: String,
        @Field("recipient") recipient: String,
        @Field("amount") amount: String
    ): Response<AirtimeWalletSelf>

    @FormUrlEncoded
    @POST("buyairtimewallet.php")
    suspend fun airtimeOtherEarnings(
        @Field("buyer") buyer: String,
        @Field("recipient") recipient: String,
        @Field("amount") amount: String
    ): Response<Airtimewallet>

    @FormUrlEncoded
    @POST("buyairtimempesa.php")
    suspend fun airtimeOtherMpesa(
        @Field("buyer") buyer: String,
        @Field("recipient") recipient: String,
        @Field("amount") amount: String
    ): Response<AirtimeMpesa>

    @FormUrlEncoded
    @POST("loadwallet.php")
    suspend fun loadWallet(
        @Field("phone") phone: String,
        @Field("amount") amount :String
    ) : Response<LoadWallet>
    
    @FormUrlEncoded
    @POST("withdrawearnings.php")
    suspend fun withdrawWallet(
        @Field("phone") phone: String,
        @Field("amount") amount :String
    ) : Response<LoadWallet>
}