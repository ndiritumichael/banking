package com.jamesnyakush.digipay.ui.auth.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jamesnyakush.digipay.R

class Auth : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_activity)
    }
}