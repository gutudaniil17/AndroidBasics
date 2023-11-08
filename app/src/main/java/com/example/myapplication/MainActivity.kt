package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.ic_add_contact,
            R.drawable.ic_favorites,
            R.drawable.ic_home
        )

        val adapter = ViewPagerAdapter(images)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = adapter

        //for vertical swipe
//        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}
