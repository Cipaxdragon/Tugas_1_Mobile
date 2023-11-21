package com.example.tugas_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Profile : AppCompatActivity() {
    private lateinit var loginUsernameEditText: EditText
    private lateinit var loginPasswordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Inisialisasi EditText
        loginUsernameEditText = findViewById(R.id.usernameValueTextView)
        loginPasswordEditText = findViewById(R.id.passwordValueTextView)

        val bek = findViewById<Button>(R.id.backButton)
        bek.setOnClickListener {
            val intent = Intent(this, kalkulator::class.java)
            startActivity(intent)
        }

        // Menerima data dari aktivitas pendaftaran
        val extras = intent.extras
        if (extras != null) {
            val registeredUsername = extras.getString("USERNAME")
            val registeredPassword = extras.getString("PASSWORD")

            // Set nilai ke EditText jika ada data yang dikirim
            loginUsernameEditText.setText(registeredUsername)
            loginPasswordEditText.setText(registeredPassword)
        }
    }
}
