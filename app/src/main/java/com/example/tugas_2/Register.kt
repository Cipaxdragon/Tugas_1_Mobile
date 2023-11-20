package com.example.tugas_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Import statements
// Import statements

class Register : AppCompatActivity() {

    private lateinit var registerUsernameEditText: EditText
    private lateinit var registerPasswordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Inisialisasi view
        registerUsernameEditText = findViewById(R.id.registerUsernameEditText)
        registerPasswordEditText = findViewById(R.id.registerPasswordEditText)
    }

    fun register(view: View) {
        val newUsername = registerUsernameEditText.text.toString()
        val newPassword = registerPasswordEditText.text.toString()

        // Lakukan validasi dan penyimpanan ke backend atau penyedia otentikasi
        // Contoh validasi sederhana, jika username dan password tidak kosong
        if (newUsername.isNotEmpty() && newPassword.isNotEmpty()) {
            // Kirim data pendaftaran ke aktivitas Login
            val intent = Intent(this, Login::class.java)
            intent.putExtra("USERNAME", newUsername)
            intent.putExtra("PASSWORD", newPassword)
            startActivity(intent)

            // Tampilkan pesan sukses atau pindah ke halaman login
            Toast.makeText(this, "Pendaftaran berhasil! Silakan login.", Toast.LENGTH_SHORT).show()
            finish() // Menutup aktivitas pendaftaran setelah pendaftaran berhasil
        } else {
            // Tampilkan pesan kesalahan atau handling lainnya
            Toast.makeText(this, "Username dan password harus diisi", Toast.LENGTH_SHORT).show()
        }
    }
}
