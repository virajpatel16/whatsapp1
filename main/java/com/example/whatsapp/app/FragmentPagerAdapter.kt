package com.example.whatsapp.app

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentPagerAdapter(fm:FragmentManager, frag: Array<Fragment>, title: Array<String>): FragmentPagerAdapter(fm) {
    var frag=frag
    var title=title
    override fun getCount(): Int {
        return frag.size

    }

    override fun getItem(position: Int): Fragment {
        return frag.get(position)


    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title.get(position)
    }


}







