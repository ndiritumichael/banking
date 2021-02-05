package com.jamesnyakush.digipay

import android.app.Application
import com.jamesnyakush.digipay.data.db.AppDatabase
import com.jamesnyakush.digipay.data.repository.AuthRepository
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton


/**
 * This is the entry application class that has the following functions:
 *      - Timber
 * */
class Digipay : Application(),KodeinAware{

    /**
     * This function calls stetho and timber functions and runs when the app is being
     * created
     * */
    override fun onCreate() {
        super.onCreate()

        initTimber()

    }


    /**
     * This is a function that enables Logging with timber
     * */
    private fun initTimber() {
        println("Welcome")
    }


    override val kodein = Kodein.lazy {
        import(androidXModule(this@Digipay))

        bind() from singleton { AppDatabase(instance()) }
        bind() from singleton { AuthRepository(instance()) }
    }

}