package com.jamesnyakush.digipay.ui.home.mainfrag

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.custom.sliderimage.logic.SliderImage
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.jamesnyakush.digipay.R
import com.jamesnyakush.digipay.core.Activities
import com.jamesnyakush.digipay.core.intentTo
import com.jamesnyakush.digipay.core.toast
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment(R.layout.home_fragment),View.OnClickListener {

    private lateinit var splitInstallManager: SplitInstallManager


    private val AirtimeModule by lazy { getString(R.string.title_airtime) }
    private val WaletModule by lazy { getString(R.string.title_wallet) }
    private val MembersModule by lazy { getString(R.string.title_members) }
    private val StatementModule by lazy { getString(R.string.title_statement) }
    private val ElectricityModule by lazy { getString(R.string.title_electricity) }
    private val TVModule by lazy { getString(R.string.title_tv) }
    private val WaterModule by lazy { getString(R.string.title_water) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        splitInstallManager = SplitInstallManagerFactory.create(requireContext())

        home_airtime.setOnClickListener(this)
        home_wallet.setOnClickListener(this)
        home_members.setOnClickListener(this)
        home_statement.setOnClickListener(this)
        home_electricity.setOnClickListener(this)
        home_tv.setOnClickListener(this)
        home_water.setOnClickListener(this)


        // Create slider image component
        val sliderImage = SliderImage(this.requireContext())

        // add images URLs
        val images = listOf(
            "https://picsum.photos/200",
            "https://picsum.photos/200",
            "https://picsum.photos/200"
        )

        // Add image URLs to sliderImage
        slider.setItems(images)

    }

    override fun onClick(v: View?) {
        when(v?.id){

            R.id.home_airtime -> {
                if (splitInstallManager.installedModules.contains(AirtimeModule)) {
                    startActivity(intentTo(Activities.AirtimeModule.Airtime))
                } else {
                    context?.toast("Airtime Module is not installed")
                }
            }

            R.id.home_wallet -> {
                if (splitInstallManager.installedModules.contains(WaletModule)) {
                    startActivity(intentTo(Activities.WalletModule.Wallet))
                } else {
                    context?.toast("Wallet Module is not installed")
                }
            }

            R.id.home_members -> {
                if (splitInstallManager.installedModules.contains(MembersModule)) {
                    startActivity(intentTo(Activities.MembersModule.Members))
                } else {
                    context?.toast("Members Module is not installed")
                }
            }

            R.id.home_statement -> {
                if (splitInstallManager.installedModules.contains(StatementModule)) {
                    startActivity(intentTo(Activities.StatementModule.Statement))
                } else {
                    context?.toast("Statement Module is not installed")
                }
            }

            R.id.home_electricity -> {
                if (splitInstallManager.installedModules.contains(ElectricityModule)) {
                    startActivity(intentTo(Activities.ElectricityModule.Electricity))
                } else {
                    context?.toast("Electricity Module is not installed")
                }
            }

            R.id.home_tv -> {
                if (splitInstallManager.installedModules.contains(TVModule)) {
                    startActivity(intentTo(Activities.TVModule.TV))
                } else {
                    context?.toast("TV Module is not installed")
                }
            }

            R.id.home_water -> {
                if (splitInstallManager.installedModules.contains(WaterModule)) {
                    startActivity(intentTo(Activities.WaterModule.Water))
                } else {
                    context?.toast("Water Module is not installed")
                }
            }
        }
    }
}
