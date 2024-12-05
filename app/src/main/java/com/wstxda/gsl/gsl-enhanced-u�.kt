package com.wstxda.gsl

import android.app.Application
import android.content.Intent
import android.net.Uri
import android.view.View
import com.google.android.material.color.DynamicColors


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }

    fun openBabelSoftwareWebsite(view: View?) {
        val browserIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://t.me/by_BabelSoftware")
        ) // Babel Software web sitesinin URL'si
        startActivity(browserIntent)
    }
}