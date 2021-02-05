package com.jamesnyakush.digipay.data.listeners

interface WalletAirtimeListener {
    fun onStarted()
    fun onSuccess()
    fun onFailiure(msg : String)
}