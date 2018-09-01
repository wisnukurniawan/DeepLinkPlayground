package com.wisnu.deeplinkpg

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.airbnb.deeplinkdispatch.DeepLinkHandler
import com.wisnu.deeplinkpg.deeplink.AppDeepLinkModule
import com.wisnu.deeplinkpg.deeplink.AppDeepLinkModuleLoader

/**
 * Created by wisnu on 9/1/18
 */
@DeepLinkHandler(AppDeepLinkModule::class)
class DeepLinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val deepLinkDelegate = DeepLinkDelegate(AppDeepLinkModuleLoader())

        deepLinkDelegate.dispatchFrom(this)

        finish()
    }
}