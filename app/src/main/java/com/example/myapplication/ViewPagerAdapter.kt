package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun createFragment(position: Int): Fragment {
        lateinit var fragment: Fragment
        if (position == 0) {
            fragment = BlankFragment()
        } else if (position == 1) {
            fragment = BlankFragment2()
        } else if (position == 2) {
            fragment = BlankFragment3()
        }
        return fragment
    }

    override fun getItemCount(): Int {
        return 3
    }

//    override fun getPageTitle(position: Int): CharSequence? {
//        var title: String? = null
//        if (position == 0) {
//            title = "First"
//        } else if (position == 1) {
//            title = "Second"
//        } else if (position == 2) {
//            title = "Third"
//        }
//        return title
//    }
}