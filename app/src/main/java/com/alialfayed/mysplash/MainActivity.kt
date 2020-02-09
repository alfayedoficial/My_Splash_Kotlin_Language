package com.alialfayed.mysplash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val HandlerTime = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
            finish()
        },HandlerTime.toLong())

    }
}
