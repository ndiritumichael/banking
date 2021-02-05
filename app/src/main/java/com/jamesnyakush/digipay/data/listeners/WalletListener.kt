package com.jamesnyakush.digipay.data.listeners

interface WalletListener {
    fun onStarted()
    fun onSuccess()
    fun onFailiure(msg : String)
}