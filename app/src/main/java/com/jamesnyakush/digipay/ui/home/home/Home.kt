package com.jamesnyakush.digipay.ui.home.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.jamesnyakush.digipay.R
import kotlinx.android.synthetic.main.content_main.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)


        setUpBottomNavigation()
    }

    private fun setUpBottomNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        val navController = navHostFragment.findNavController()
        bottom_nav.setupWithNavController(navController = navController)

/*
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.bottom_nav_home, R.id.bottom_nav_about_app, R.id.bottom_nav_share, R.id.bottom_nav_help -> {
                    bottom_nav.visibility = View.VISIBLE
                }
                else -> bottom_nav.visibility = View.GONE
            }
        }
        */

    }


}
