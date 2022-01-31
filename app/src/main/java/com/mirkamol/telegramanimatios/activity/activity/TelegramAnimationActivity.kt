package com.mirkamol.telegramanimatios.activity.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.viewpager.widget.ViewPager
import com.airbnb.lottie.LottieAnimationView
import com.mirkamol.telegramanimatios.R
import com.mirkamol.telegramanimatios.activity.activity.adapter.Adapter
import me.relex.circleindicator.CircleIndicator

class TelegramAnimationActivity : AppCompatActivity() {

    private lateinit var txtPageListener:AppCompatTextView
    private lateinit var tv_text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telegram_animation)

        val imgs = listOf<String>("telegram_icon.json", "speedometer.json", "pink_gift.json", "infinity.json","secure_lock.json", "clouds.json")





        tv_text = findViewById(R.id.tv_text)
        txtPageListener=findViewById(R.id.pageNumber)

        val adapter = Adapter(imgs, this)
        val viewPagerAdapter = findViewById<ViewPager>(R.id.pager)
        viewPagerAdapter.adapter = adapter
        val circleIndicator = findViewById<CircleIndicator>(R.id.circleIndicator)
        circleIndicator.setViewPager(viewPagerAdapter)

        viewPagerAdapter.addOnPageChangeListener(listener)

    }
    private val listener = object : ViewPager.OnPageChangeListener{
        @SuppressLint("SetTextI18n")
        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
            when (position) {
                0 -> {
                    txtPageListener.text = "Telegram X"
                    tv_text.text="The world's fastest messaging app.It is free and secure"

                }
                1 -> {
                    txtPageListener.text = "Fast"
                    tv_text.text="Telegram delivers messages faster than any other application "
                }
                2 -> {
                    txtPageListener.text = "Free"
                    tv_text.text="Telegram is free forever.No ads. No subscription fees."
                }
                3 -> {
                    txtPageListener.text = "Powerful"
                    tv_text.text="Telegram has no limits on  the size of your media and chats."
                }
                4 -> {
                    txtPageListener.text = "Secure"
                    tv_text.text="Telegram keeps yours messages safe from hacker attacks"
                }
                5 -> {
                    txtPageListener.text = "Cloud-Based"
                    tv_text.text="Telegram lets you access your messages from multiple devices."
                }


            }
        }

        override fun onPageSelected(position: Int) {

        }

        override fun onPageScrollStateChanged(state: Int) {

        }

    }


}