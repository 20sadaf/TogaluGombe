package com.example.togalugombe.ui

import android.content.Intent
import android.os.Bundle
import android.content.Context
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.togalugombe.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prefs = getSharedPreferences("UserData", Context.MODE_PRIVATE)
        val username = prefs.getString("username", "Sadaf")

        setContentView(R.layout.activity_signup)

        findViewById<Button>(R.id.signUpBtn).setOnClickListener {
            Toast.makeText(this, "Account Created!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, HomeActivity::class.java))
            finishAffinity()
        }

        findViewById<TextView>(R.id.loginTv).setOnClickListener {
            finish()
        }
    }
}
