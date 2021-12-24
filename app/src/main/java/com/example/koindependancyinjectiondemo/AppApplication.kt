package com.example.koindependancyinjectiondemo

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplicationL:Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@AppApplicationL)
            modules(listOf(appModule))
        }
    }


}