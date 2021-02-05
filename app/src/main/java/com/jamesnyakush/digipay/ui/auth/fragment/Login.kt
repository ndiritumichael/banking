package com.jamesnyakush.digipay.ui.auth.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.digipay.R
import com.jamesnyakush.digipay.databinding.LoginFragmentBinding
import com.jamesnyakush.digipay.ui.auth.viewmodel.AuthViewModel
import com.jamesnyakush.digipay.ui.home.home.Home
import kotlinx.android.synthetic.main.login_fragment.*



/**
 * This is Login fragment and enables a user to authenticate to his or her
 * account
 *
 * */
class Login : Fragment(R.layout.login_fragment) {

    private lateinit var binding: LoginFragmentBinding

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(AuthViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = LoginFragmentBinding.bind(view)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        login_btn.setOnClickListener {
            startActivity(Intent(requireContext(), Home::class.java))
        }

    }
}