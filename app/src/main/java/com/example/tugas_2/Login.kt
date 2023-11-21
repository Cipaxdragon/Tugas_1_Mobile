package com.example.tugas_2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
// Import statements

// Import statements
// Import statements
// Import statements

class Login : AppCompatActivity() {

    private lateinit var loginUsernameEditText: EditText
    private lateinit var loginPasswordEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Inisialisasi view
        loginUsernameEditText = findViewById(R.id.loginUsernameEditText)
        loginPasswordEditText = findViewById(R.id.loginPasswordEditText)

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

    fun login(view: View) {
        val enteredUsername = loginUsernameEditText.text.toString()
        val enteredPassword = loginPasswordEditText.text.toString()

        // Implementasi logika login sesuai kebutuhan
        // ...

        // Contoh validasi sederhana, jika username dan password sesuai dengan yang terdaftar
        val registeredUsername = intent.getStringExtra("USERNAME")
        val registeredPassword = intent.getStringExtra("PASSWORD")

        if (enteredUsername == registeredUsername && enteredPassword == registeredPassword) {
            // Login berhasil, pindah ke aktivitas kalkulator
            val intent = Intent(this, kalkulator::class.java)
            intent.putExtra("USERNAME", registeredUsername)
            startActivity(intent)

            // Tampilkan pesan berhasil atau lakukan tindakan lainnya
            Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()
        } else {
            // Tampilkan pesan kesalahan
            Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
        }
    }

    fun goToRegister(view: View) {
        // Pindah ke aktivitas pendaftaran
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }
}
