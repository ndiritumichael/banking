package com.jamesnyakush.digipay.ui.home


/**
 *
 */
object Versions {
    const val androidx_test = "1.1.0"
    const val ktx = "1.1.0"
    const val retrofit = "2.6.0"
    const val coroutines = "1.3.0"
    const val lifecycle = "2.2.0"
    const val room = "2.2.2"
    const val navigation = "2.2.0-rc03"
    const val androidx_test_espresso = "3.1.0"
    const val mockito_core = "2.25.0"
    const val mockito_android = "2.25.0"
    const val MaterialSpinner = "1.4.1"
}

object BuildPlugins {
    const val application = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val androidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"
    const val navigation = "androidx.navigation.safeargs.kotlin"
}

object Libraries {

    const val playCore = "com.google.android.play:core:1.6.3"

    const val kt = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.MaterialSpinner}"
    const val appCompat = "androidx.appcompat:appcompat:1.2.0"
    const val coreKtx = "androidx.core:core-ktx:${Versions.ktx}"

    // design
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"


    //Retrofit and GSON
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    //Kotlin Coroutines
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"

    // ViewModel and LiveData
    const val lifecycleExt = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    //New Material Design
    const val material = "com.google.android.material:material:1.0.0"

    //Android Room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    //Android Navigation Architecture
    const val navfrag = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    // design assets
    const val imageslider = "io.github.ivanespitiac:imageslider:1.0.3"
    const val expandable = "com.alespero:expandable-cardview:0.8"
}

object TestLibraries {
    // Espresso
    const val junit = "junit:junit:4.12"
    const val espressoCore =
        "androidx.test.espresso:espresso-core:${Versions.androidx_test_espresso}"
    const val espressoContrib =
        "androidx.test.espresso:espresso-contrib:${Versions.androidx_test_espresso}"
    const val espressoIdling =
        "androidx.test.espresso:espresso-idling-resource:${Versions.androidx_test_espresso}"

    // Mockito
    const val mockitoCore = "org.mockito:mockito-core:${Versions.mockito_core}"
    const val mockitoAndroid = "org.mockito:mockito-android:${Versions.mockito_android}"

    // androidx.test
    const val runner = "androidx.test:runner:${Versions.androidx_test}"
    const val core = "androidx.test:core:${Versions.androidx_test}"
    const val junitKtx = "androidx.test.ext:junit-ktx:${Versions.androidx_test}"
}


object AndroidSdk {
    const val minSdkVersion = 21
    const val compileSdkVersion = 30
    const val targetSdkVersion = compileSdkVersion
    const val versionCode = 1
    const val versionName = "1.0"
}



