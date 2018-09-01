package com.wisnu.origin

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URLEncoder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simple_intent_btn.setOnClickListener {
            val phoneNumber = edt_phone.text.toString()
            val text = edt_message.text.toString()
            val textEncoded = URLEncoder.encode(text, "UTF-8")

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("wisnu://awesome?phone=$phoneNumber&text=$textEncoded"))
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {

            }

        }
    }
}
