package com.example.heartattackrisk

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val sum = intent.getParcelableExtra<Sum>("sum")

        val text = findViewById<TextView>(R.id.title)

        if (sum != null) {
            text.text = sum.value.toString()
        }

    }
}