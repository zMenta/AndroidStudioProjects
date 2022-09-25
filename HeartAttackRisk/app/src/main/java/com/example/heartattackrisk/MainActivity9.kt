package com.example.heartattackrisk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_9)
        val sum = intent.getParcelableExtra<Sum>("sum")

        val text = findViewById<TextView>(R.id.result)
        val button1 = findViewById<Button>(R.id.button1)


        if (sum != null) {
            text.text = sum.value.toString()

            button1.setOnClickListener() {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}
