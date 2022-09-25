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


        button1.setOnClickListener(){
            val sum = Sum(sum_value + 1)
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("sum", sum)
            startActivity(intent)
        }

    }
}