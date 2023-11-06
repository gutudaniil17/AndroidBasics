package com.example.myapplication;

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

public class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btnOpenActivitySecond = findViewById<Button>(R.id.btnOpenActivity)

        btnOpenActivitySecond.setOnClickListener{
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}