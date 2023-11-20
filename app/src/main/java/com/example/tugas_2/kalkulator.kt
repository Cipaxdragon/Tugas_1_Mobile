package com.example.tugas_2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class kalkulator : AppCompatActivity() {
    private lateinit var etNumber1: EditText
    private lateinit var etNumber2: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        tvResult = findViewById(R.id.tvResult)
    }

    fun onAdd(view: View) {
        val num1 = etNumber1.text.toString().toInt()
        val num2 = etNumber2.text.toString().toInt()
        val result = num1 + num2
        tvResult.text = "Result: $result"
    }
    fun onSubtract(view: View) {
        val num1 = etNumber1.text.toString().toInt()
        val num2 = etNumber2.text.toString().toInt()
        val result = num1 - num2
        tvResult.text = "Result: $result"
    }
    fun onMultiply(view: View) {
        val num1 = etNumber1.text.toString().toInt()
        val num2 = etNumber2.text.toString().toInt()
        val result = num1 * num2
        tvResult.text = "Result: $result"
    }

    fun onDivide(view: View) {
        val num1 = etNumber1.text.toString().toInt()
        val num2 = etNumber2.text.toString().toInt()
        val result = num1 / num2
        tvResult.text = "Result: $result"
    }


}


