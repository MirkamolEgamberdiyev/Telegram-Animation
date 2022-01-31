package com.mirkamol.telegramanimatios.activity.activity.adapter

import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.airbnb.lottie.LottieAnimationView
import com.mirkamol.telegramanimatios.R

 class Adapter(var list: List<String>, var ctx:Context):PagerAdapter() {
    lateinit var layoutInflater: LayoutInflater

    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view.equals(`object`)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(R.layout.item_layout, container,false)
        val img = view.findViewById<LottieAnimationView>(R.id.ic_image)
        img.setAnimation(list.get(position))

        container.addView(view, 0)
        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}