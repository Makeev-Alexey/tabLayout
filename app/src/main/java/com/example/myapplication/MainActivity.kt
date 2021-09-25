package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    internal lateinit var viewpageradapter:ViewPagerAdapter //Declare PagerAdapter
    var tabNames : List<String> = arrayListOf("1", "2", "3")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpageradapter= ViewPagerAdapter(this)
        var viewPager = findViewById<ViewPager2>(R.id.pager)
        viewPager.adapter=viewpageradapter  //Binding PagerAdapter with ViewPager
        var tab_layout = findViewById<TabLayout>(R.id.tab_layout)
//        tab_layout.setupWithViewPager(viewPager) //Binding ViewPager with TabLayout

        TabLayoutMediator(tab_layout, viewPager) { tab, position ->
            tab.text = tabNames[position]

        }.attach()
    }
}