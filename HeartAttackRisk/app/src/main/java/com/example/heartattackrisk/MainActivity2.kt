package com.example.heartattackrisk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val sum = intent.getParcelableExtra<Sum>("sum")

        val text = findViewById<TextView>(R.id.title)
        val button1 = findViewById<Button>(R.id.button1)


        if (sum != null) {
            text.text = sum.value.toString()
        }


        button1.setOnClickListener() {
            val sum = Sum((sum?.value ?: 0) + 1)
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("sum", sum)
            startActivity(intent)
        }

    }
}