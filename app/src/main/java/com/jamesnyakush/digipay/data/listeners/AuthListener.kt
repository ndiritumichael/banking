package com.jamesnyakush.digipay.data.listeners

interface AuthListener{
    fun onStarted()
    fun onSuccess()
    fun onFailiure(msg : String)
}