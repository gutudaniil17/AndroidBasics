package com.example.myapplication

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val person = getSerializable(this, "EXTRA_PERSON", Person::class.java)

        val result = "${person.age} years old ${person.name} from ${person.country} just pressed the button"

        findViewById<TextView>(R.id.tvPerson).text = result
    }
    private fun <T : Serializable?> getSerializable(activity: Activity, name: String, clazz: Class<T>): T
    {
        return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
            activity.intent.getSerializableExtra(name, clazz)!!
        else
            activity.intent.getSerializableExtra(name) as T
    }
}