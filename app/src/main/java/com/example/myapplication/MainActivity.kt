package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)

        btnShowToast.setOnClickListener{
            Toast.makeText( applicationContext, "Hi, I'm the toast!", Toast.LENGTH_LONG).show()
        }
    }

}