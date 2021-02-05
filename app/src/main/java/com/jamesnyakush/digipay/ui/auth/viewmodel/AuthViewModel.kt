package com.jamesnyakush.digipay.ui.auth.viewmodel

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.jamesnyakush.digipay.data.listeners.AuthListener
import com.jamesnyakush.digipay.ui.auth.fragment.LoginDirections
import com.jamesnyakush.digipay.ui.auth.fragment.RegisterDirections
import com.jamesnyakush.digipay.ui.home.home.Home

/**
 * This is AuthViewModel that has the following functionality
 *      - onLoginButtonClick(view:View)
 *      - onRegisterButtonClick(view:View)
 *
 * */
class AuthViewModel : ViewModel() {

    var name: String? = null
    var email: String? = null
    var phone: String? = null
    var promocode: String? = null
    var password: String? = null

    var authListener: AuthListener? = null


//    fun onLoginButtonClick(view: View) {
///*
//        if (phone.isNullOrEmpty() || password.isNullOrEmpty()) {
//            authListener?.onFailiure("Phone and password fields should not be empty")
//            return
//        }
//*/
//
//
//        Intent(view.context, Home::class.java).also {
//            view.context.startActivity(it)
//        }
//    }

    fun onRegisterButtonClick(view: View) {
/*
        if (name.isNullOrEmpty() || email.isNullOrEmpty()
            || phone.isNullOrEmpty() || promocode.isNullOrEmpty()
            || password.isNullOrEmpty()
        ) {
            authListener?.onFailiure("All fields are Required")
            return
        }
*/


        Intent(view.context, Home::class.java).also {
            view.context.startActivity(it)
        }
    }

    fun onRegister(view: View) {
        val action = LoginDirections.actionToRegister()
        Navigation.findNavController(view).navigate(action)
    }

    fun onLogin(view: View) {
        val action = RegisterDirections.actionToLogin()
        Navigation.findNavController(view).navigate(action)
    }

    fun forgotPass(view: View) {
        val action = LoginDirections.actionToRegister()
        Navigation.findNavController(view).navigate(action)
    }

    fun reportIssue(view: View) {
        val action = LoginDirections.actionToRegister()
        Navigation.findNavController(view).navigate(action)
    }
}