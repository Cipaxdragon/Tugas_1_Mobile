package com.example.tugas_2
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loging = findViewById<Button>(R.id.startCalculatorButton)
        loging.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

    }


}