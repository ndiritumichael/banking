package com.jamesnyakush.digipay.data.network.response

data class AirtimeMpesa(
    val buyer : String,
    val recipient : String,
    val amount : String
)