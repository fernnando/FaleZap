package com.example.logonrm.falezap

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by logonrm on 19/03/2018.
 */
class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){
    val myFragments = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return myFragments[position]
    }

    override fun getCount(): Int {
        return myFragments.size
    }

    fun add(fragment: Fragment){
        myFragments.add(fragment)
    }

}