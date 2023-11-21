package com.example.tugas_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Profile : AppCompatActivity() {
    private lateinit var usernem: TextView
    val a = "asda";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        usernem = findViewById(R.id.usernameTextView)


        val bek = findViewById<Button>(R.id.backButton)
        bek.setOnClickListener{
            val intent = Intent(this, kalkulator::class.java)
            startActivity(intent)
        }

        usernem.text = "Ahmad Ghazali"

    }
}