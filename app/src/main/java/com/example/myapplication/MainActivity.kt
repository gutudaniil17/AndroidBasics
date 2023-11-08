package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDialog1 = findViewById<Button>(R.id.btnDialog1)
        val btnDialog2 = findViewById<Button>(R.id.btnDialog2)
        val btnDialog3 = findViewById<Button>(R.id.btnDialog3)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add Mr. Poop to your contact list?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes"){ _, _ ->
                Toast.makeText(this, "You added Mr. Poop to your contact list", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ _, _ ->
                Toast.makeText(this, "You didn't add Mr. Poop to your contact list", Toast.LENGTH_SHORT).show()
            }
            .create()

        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First Item", "Second Item", "Third Item")

        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose on of these options")
            .setSingleChoiceItems(options, 0){dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this, "You accepted the single choice of the dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _, _ ->
                Toast.makeText(this, "You didn't accept the single choice of the dialog", Toast.LENGTH_SHORT).show()
            }
            .create()

        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose on of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) { _, i , isChecked->
                if(isChecked)
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this, "You accepted the multi choice of the dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _, _ ->
                Toast.makeText(this, "You didn't accept the multi choice of the dialog", Toast.LENGTH_SHORT).show()
            }
            .create()

        btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}
