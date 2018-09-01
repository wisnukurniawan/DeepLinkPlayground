package com.wisnu.deeplinkpg.deeplink

import android.content.Context
import android.content.Intent
import com.airbnb.deeplinkdispatch.DeepLink
import com.airbnb.deeplinkdispatch.DeepLinkModule
import com.wisnu.deeplinkpg.Activity1

/**
 * Created by wisnu on 9/1/18
 */

@DeepLinkModule
class AppDeepLinkModule

@DeepLink("wisnu://awesome")
fun startActivity1(context: Context): Intent {
    return Intent(context, Activity1::class.java)
}