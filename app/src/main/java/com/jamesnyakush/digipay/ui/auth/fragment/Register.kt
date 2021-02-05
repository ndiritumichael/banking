package com.jamesnyakush.digipay.ui.auth.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.digipay.R
import com.jamesnyakush.digipay.databinding.RegisterFragmentBinding
import com.jamesnyakush.digipay.ui.auth.viewmodel.AuthViewModel


/**
 * This is Register Fragment that enables a user to create a new account
 *
 * */
class Register : Fragment(R.layout.register_fragment) {

    private lateinit var binding: RegisterFragmentBinding
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(AuthViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = RegisterFragmentBinding.bind(view)
        binding.viewmodel = viewModel
    }
}