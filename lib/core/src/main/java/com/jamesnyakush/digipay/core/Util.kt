package com.jamesnyakush.digipay.core

import android.content.Context
import android.util.Log
import android.widget.Toast


/**
 * This is Toast Extension functions
 *
 * @param msg
 * */
fun Context.toast(msg: String) {
    Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).apply {
        show()
    }
}

//fun View.snackbar(msg: String) {
//    Snackbar.make(this, msg, Snackbar.LENGTH_LONG).also { snackbar ->
//        snackbar.setAction("ok") {
//            snackbar.dismiss()
//        }
//    }.show()
//}

