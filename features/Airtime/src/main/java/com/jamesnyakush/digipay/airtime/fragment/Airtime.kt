package com.jamesnyakush.digipay.airtime.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.jamesnyakush.digipay.airtime.R
import kotlinx.android.synthetic.main.airtime_fragment.*

class Airtime : Fragment(R.layout.airtime_fragment), View.OnClickListener {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        airtime_mpesa_frag.setOnClickListener(this)
        airtime_wallet_frag.setOnClickListener(this)
        airtime_earnings_frag.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.airtime_mpesa_frag -> {
                val action = AirtimeDirections.actionToMpesa()
                Navigation.findNavController(v).navigate(action)
            }

            R.id.airtime_wallet_frag -> {
                val action = AirtimeDirections.actionToWallet()
                Navigation.findNavController(v).navigate(action)
            }

            R.id.airtime_earnings_frag -> {
                val action = AirtimeDirections.actionToEarnings()
                Navigation.findNavController(v).navigate(action)
            }
        }
    }
}
