package com.jamesnyakush.digipay.ui.home.share


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.jamesnyakush.digipay.R
import kotlinx.android.synthetic.main.share_fragment.*
import android.content.Intent

class ShareFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.share_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        whatsapp_share.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT, "AirtimeZone : to continue earning more apart from ur main job ,Download airtimezone app and earn from ur credit by sharing ur promocode.")
            sendIntent.type = "text/plain"
            sendIntent.setPackage("com.whatsapp")
            startActivity(Intent.createChooser(sendIntent, ""))
            startActivity(sendIntent)



        }
        share_others.setOnClickListener {

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            val shareString ="AirtimeZone : to continue earning more apart from ur main job ,Download airtimezone app and earn from ur credit by sharing ur promocode"
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareString)
            startActivity(shareIntent)
        }

    }

}
