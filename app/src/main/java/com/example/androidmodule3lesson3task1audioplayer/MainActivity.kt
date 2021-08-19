package com.example.androidmodule3lesson3task1audioplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_start.setOnClickListener {
            startService(Intent(this,AudioService::class.java))
        }

        bt_stop.setOnClickListener {
            stopService(Intent(this,AudioService::class.java))

        }
    }
}