package com.example.btn.ViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.btn.R.drawable.*
import com.example.btn.databinding.ActivityViewPagerBinding

class ViewPager : AppCompatActivity() {
    var imglist = arrayOf(img1, img2, img3, img4, img5)
    val TAG = "ViewPager"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = ViewPagerAdapter(imglist)
        binding.idViewPager.adapter = adapter
    }
}