package com.example.togalugombe.ui

import android.os.Bundle
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.togalugombe.R

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prefs = getSharedPreferences("UserData", Context.MODE_PRIVATE)
        val username = prefs.getString("username", "Sadaf")

        setContentView(R.layout.activity_settings)
    }
}
