package com.example.heartattackrisk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sum_value = 0
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        button1.setOnClickListener() {
            val sum = Sum(sum_value + 1)

            button1.setOnClickListener() {
                val sum = Sum(sum_value + 1)
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("sum", sum)
                startActivity(intent)
            }

            button2.setOnClickListener() {
                val sum = Sum(sum_value + 2)
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("sum", sum)
                startActivity(intent)
            }
        }

    }
}
