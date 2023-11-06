package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkbox_radiobutton)

        val btnOrder = findViewById<Button>(R.id.btnOrder)

        btnOrder.setOnClickListener{
            val rgMeat = findViewById<RadioGroup>(R.id.rgMeat)
            val checkedMeat = findViewById<RadioButton>(rgMeat.checkedRadioButtonId)
            val cheese = findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onion = findViewById<CheckBox>(R.id.cbOnions).isChecked
            val salad = findViewById<CheckBox>(R.id.cbSalad).isChecked

            val orderString = "You ordered a burger with:\n" +
                    "${checkedMeat.text}"+
                    (if(cheese) "\nCheese" else "")+
                    (if(salad) "\nSalad" else "")+
                    (if(onion) "\nOnions" else "")

            val tvOrder = findViewById<TextView>(R.id.tvOrder)
            tvOrder.text = orderString

        }

    }

}