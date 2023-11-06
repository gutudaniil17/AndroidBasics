package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnApply).setOnClickListener {
            val name = findViewById<EditText>(R.id.etName).text.toString()
            val age = findViewById<EditText>(R.id.etAge).text.toString().toInt()
            val country = findViewById<EditText>(R.id.etCountry).text.toString()
            val person = Person(name, age, country)
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON",person)
                startActivity(it)
            }
        }
    }

}