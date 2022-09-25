package com.example.heartattackrisk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val sum = intent.getParcelableExtra<Sum>("sum")

        val text = findViewById<TextView>(R.id.title)
        val button1 = findViewById<Button>(R.id.button1)


        if (sum != null) {
            text.text = sum.value.toString()
        }


    }
}