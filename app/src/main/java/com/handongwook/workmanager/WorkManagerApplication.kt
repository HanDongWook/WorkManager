package com.handongwook.workmanager

import android.app.Application
import timber.log.Timber

class WorkManagerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}