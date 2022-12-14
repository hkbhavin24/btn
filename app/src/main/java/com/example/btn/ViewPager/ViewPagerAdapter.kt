package com.example.btn.ViewPager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.btn.R

class ViewPagerAdapter(imglist: Array<Int>) : PagerAdapter() {
    var imglist = imglist
    override fun getCount(): Int {
        return imglist.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view = LayoutInflater.from(container.context)
            .inflate(R.layout.image_slider_item, container, false)
        var img = view.findViewById<ImageView>(R.id.idImage)
        img.setImageResource(imglist.get(position))
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)

    }

}