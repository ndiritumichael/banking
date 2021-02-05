package com.jamesnyakush.digipay.tv.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.jamesnyakush.digipay.tv.R
import kotlinx.android.synthetic.main.pay_fragment.*


class PayFragment : Fragment(R.layout.pay_fragment), View.OnClickListener {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pay_kwese_frag.setOnClickListener(this)
        pay_zuku_frag.setOnClickListener(this)
        pay_startimes_frag.setOnClickListener(this)
        pay_dstv_frag.setOnClickListener(this)
        pay_go_tv_frag.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.pay_kwese_frag -> {
                Navigation.findNavController(v)
                    .navigate(PayFragmentDirections.actionPayFragmentToKwese())
            }

            R.id.pay_zuku_frag -> {
                Navigation.findNavController(v)
                    .navigate(PayFragmentDirections.actionPayFragmentToZuku())
            }

            R.id.pay_startimes_frag -> {
                Navigation.findNavController(v)
                    .navigate(PayFragmentDirections.actionPayFragmentToStartimes())
            }

            R.id.pay_dstv_frag -> {
                Navigation.findNavController(v)
                    .navigate(PayFragmentDirections.actionPayFragmentToDstv())
            }

            R.id.pay_go_tv_frag -> {
                Navigation.findNavController(v)
                    .navigate(PayFragmentDirections.actionPayFragmentToGoTv())
            }
        }
    }
}