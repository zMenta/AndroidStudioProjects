package com.example.heartattackrisk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        val sum = intent.getParcelableExtra<Sum>("sum")

        val text = findViewById<TextView>(R.id.title)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        if (sum != null) {
            text.text = sum.value.toString()
            val sum_value = sum.value

            button1.setOnClickListener() {
                val sum = Sum(sum_value + 1)
                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("sum", sum)
                startActivity(intent)
            }

            button2.setOnClickListener() {
                val sum = Sum(sum_value + 2)
                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("sum", sum)
                startActivity(intent)
            }
            button3.setOnClickListener() {
                val sum = Sum(sum_value + 3)
                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("sum", sum)
                startActivity(intent)
            }
            button4.setOnClickListener() {
                val sum = Sum(sum_value + 5)
                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("sum", sum)
                startActivity(intent)
            }
            button5.setOnClickListener() {
                val sum = Sum(sum_value + 6)
                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("sum", sum)
                startActivity(intent)
            }
            button6.setOnClickListener() {
                val sum = Sum(sum_value + 8)
                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("sum", sum)
                startActivity(intent)
            }

        }
    }
}