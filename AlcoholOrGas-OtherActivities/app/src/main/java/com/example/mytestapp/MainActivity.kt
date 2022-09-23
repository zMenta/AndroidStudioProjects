package com.example.mytestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_calculate)
        val input1 = findViewById<EditText>(R.id.input1)
        val input2 = findViewById<EditText>(R.id.input2)
        val output = findViewById<TextView>(R.id.output_text)


        button.setOnClickListener(){
            val input1_value = input1.text.toString().toDouble()
            val input2_value = input2.text.toString().toDouble()

            if ((input1_value / input2_value) < 0.7) {
                output.text = "Please use Alcohol"
            } else {
                output.text = "Please use Gas"
            }

            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("output", output.text.toString())
            startActivity(intent)

        }
    }
}

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

       val output = findViewById<TextView>(R.id.output_text_2)
       val output_value = intent.getStringExtra("output")

        output.text = output_value
    }
}
