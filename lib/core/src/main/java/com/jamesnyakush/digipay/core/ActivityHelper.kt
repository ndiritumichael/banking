@file:JvmName("ActivityHelper")

package com.jamesnyakush.digipay.core

import android.content.Intent


private const val PACKAGE_NAME = "com.jamesnyakush.digipay"

/**
 *
 * */
interface AddressableActivity {
    val className: String
}

/**
 *
 * */
fun intentTo(addressableActivity: AddressableActivity): Intent {
    return Intent(Intent.ACTION_VIEW).setClassName(
        PACKAGE_NAME,
        addressableActivity.className
    )
}

/**
 *
 */
object Activities {

    /**
     *
     */
    object AirtimeModule {
        object Airtime : AddressableActivity {
            override val className = "$PACKAGE_NAME.airtime.activity.Airtime"
        }
    }

    /**
     *
     */
    object WalletModule {
        object Wallet : AddressableActivity {
            override val className = "$PACKAGE_NAME.wallet.activity.Wallet"
        }
    }

    /**
     *
     */
    object MembersModule {
        object Members : AddressableActivity {
            override val className = "$PACKAGE_NAME.members.activity.Members"
        }
    }

    /**
     *
     */
    object StatementModule {
        object Statement : AddressableActivity {
            override val className = "$PACKAGE_NAME.statement.activity.Statement"
        }
    }

    /**
     *
     */
    object ElectricityModule {
        object Electricity : AddressableActivity {
            override val className = "$PACKAGE_NAME.electricity.activity.Electricity"
        }
    }

    /**
     *
     */
    object TVModule {
        object TV : AddressableActivity {
            override val className = "$PACKAGE_NAME.tv.activity.TV"
        }
    }

    /**
     *
     */
    object WaterModule {
        object Water : AddressableActivity {
            override val className = "$PACKAGE_NAME.water.activity.Water"
        }
    }
}