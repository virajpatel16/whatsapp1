package com.example.whatsapp.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var title= arrayOf("CHAT","STATUS","CALL")
    var frag= arrayOf(ChatFragment(),StatusFragment(),CallFragment())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=
        setContentView(binding.root)




        binding.pager.adapter=FragmentPagerAdapter(supportFragmentManager,frag,title)
        binding.tab.setupWithViewPager(binding.pager)
    }

}