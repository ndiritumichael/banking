package com.jamesnyakush.digipay.data.listeners

interface MpesaAirtimeListener {
    fun onStarted()
    fun onSuccess()
    fun onFailiure(msg : String)
}