package com.example.togalugombe.ui

import android.os.Bundle
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.togalugombe.R
import com.example.togalugombe.adapter.PuppetAdapter
import com.example.togalugombe.data.AppDatabase

class SavedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prefs = getSharedPreferences("UserData", Context.MODE_PRIVATE)
        val username = prefs.getString("username", "Sadaf")

        setContentView(R.layout.activity_saved)

        val recyclerView = findViewById<RecyclerView>(R.id.savedRecyclerView)
        val db = AppDatabase.getDatabase(this)
        val savedPuppets = db.puppetDao().getSaved()

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = PuppetAdapter(savedPuppets, isHorizontal = false)
    }
}
