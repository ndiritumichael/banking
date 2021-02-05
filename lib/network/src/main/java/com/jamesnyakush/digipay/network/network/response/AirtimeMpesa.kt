package com.jamesnyakush.digipay.network.network.response

data class AirtimeMpesa(
    val buyer : String,
    val recipient : String,
    val amount : String
)