package com.sayyid.fundamental_tablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionPagerAdapter(activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment:Fragment?=null
        when(position){
            0->fragment=HomeFragment()
            1->fragment=ProfileFragment()

        }
        return fragment as Fragment
    }
}