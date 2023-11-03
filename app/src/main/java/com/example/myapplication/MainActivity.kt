package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply)

        btnApply.setOnClickListener{
            val firstName = findViewById<EditText>(R.id.etFirstName).text.toString()
            val lastName = findViewById<EditText>(R.id.etLastName).text.toString()
            val birthday = findViewById<EditText>(R.id.etBirthday).text.toString()
            val country = findViewById<EditText>(R.id.etCountry).text.toString()
            Log.d("Main activity", "$firstName $lastName, born on $birthday, from $country just applied formula.")
        }
    }

}