package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val cbAdult = findViewById<CheckBox>(R.id.cbAdult)
        val btnLoad = findViewById<Button>(R.id.btnLoad)
        val btnSave = findViewById<Button>(R.id.btnSave)

        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPref.edit()

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val isAdult = cbAdult.isChecked

            editor.apply {
                putString("name", name)
                putInt("age", age)
                putBoolean("isAdult", isAdult)
                apply()
            }
        }

        btnLoad.setOnClickListener {
            val name = sharedPref.getString("name", "")
            val age = sharedPref.getInt("age", 0)
            val isAdult = sharedPref.getBoolean("isAdult", false)

            etName.setText(name)
            etAge.setText(age.toString())
            cbAdult.isChecked = isAdult

        }
    }

}
