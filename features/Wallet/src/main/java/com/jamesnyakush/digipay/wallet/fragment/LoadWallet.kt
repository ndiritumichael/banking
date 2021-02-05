package com.jamesnyakush.digipay.wallet.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.jamesnyakush.digipay.wallet.R
import kotlinx.android.synthetic.main.load_wallet_fragment.*

/**
 *  LoadWallet Fragment
 *
 * */
class LoadWallet : Fragment(R.layout.load_wallet_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        withdrawFragment.setOnClickListener {
            Navigation.findNavController(it).navigate(LoadWalletDirections.actionToWithdraw())
        }
    }
}