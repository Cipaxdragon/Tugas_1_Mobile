package com.example.tugas_2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
    }

    // Metode yang akan dipanggil saat tombol-tombol diklik
    fun onButtonClick(view: View) {
        val button = view as Button
        val buttonText = button.text.toString()

        // Mendapatkan teks saat ini dari EditText
        val currentText = editText.text.toString()

        // Menambahkan teks tombol yang diklik ke dalam EditText
        editText.setText(currentText + buttonText)
    }

    // Metode untuk tombol "=" (sama dengan)
    fun onEqualsClick(view: View) {
        try {
            // Mendapatkan teks dari EditText
            val expression = editText.text.toString()

            // Evaluasi ekspresi matematika secara manual
            val result = evaluateExpression(expression)

            // Menampilkan hasil kalkulasi di EditText
            editText.setText(result.toString())
        } catch (e: Exception) {
            // Tangani kesalahan kalkulasi di sini
            editText.setText("Error")
        }
    }
    // Metode untuk tombol "C" (hapus)
    fun onClearClick(view: View) {
        editText.setText("")  // Menghapus isi EditText
    }

    // Metode untuk mengevaluasi ekspresi matematika secara manual
    private fun evaluateExpression(expression: String): Double {
        // Memisahkan ekspresi menjadi angka dan operator
        val tokens = expression.split(" ")

        // Inisialisasi hasil dengan angka pertama
        var result = tokens[0].toDouble()

        // Loop untuk melakukan operasi kalkulasi
        for (i in 1 until tokens.size step 2) {
            val operator = tokens[i]
            val operand = tokens[i + 1].toDouble()

            when (operator) {
                "+" -> result += operand
                "-" -> result -= operand
                "*" -> result *= operand
                "/" -> result /= operand
            }
        }

        return result
    }

}
