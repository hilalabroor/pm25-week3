package com.example.pm_week3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.etInput)
        val button = findViewById<Button>(R.id.btnHello)
        val result = findViewById<TextView>(R.id.tvResult)

        button.setOnClickListener {
            val text = input.text.toString()
            result.text = "Hello, $text"
        }
    }
}