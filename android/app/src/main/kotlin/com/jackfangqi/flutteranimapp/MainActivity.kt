package com.jackfangqi.flutteranimapp

import android.os.Bundle
import android.util.Log
import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWith(this)

        val stream = assets.open("flutter_assets/assets/images/ic_after_sale_apply_succeed.png")
        Log.d("flutter asset", "stream is null? = ${null == stream}")
    }
}
