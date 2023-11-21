package com.example.tugas_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bek = findViewById<Button>(R.id.backButton)
        bek.setOnClickListener{
            val intent = Intent(this, kalkulator::class.java)
            startActivity(intent)
        }

    }
}