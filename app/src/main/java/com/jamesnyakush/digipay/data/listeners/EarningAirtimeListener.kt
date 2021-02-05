package com.jamesnyakush.digipay.data.listeners

interface EarningAirtimeListener {
    fun onStarted()
    fun onSuccess()
    fun onFailiure(msg : String)
}