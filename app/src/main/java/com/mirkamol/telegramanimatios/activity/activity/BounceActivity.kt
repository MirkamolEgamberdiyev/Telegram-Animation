package com.mirkamol.telegramanimatios.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.mirkamol.telegramanimatios.R

class BounceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bounce)

        val bt_bounce = findViewById<Button>(R.id.btnBounce)
        val ic_image = findViewById<ImageView>(R.id.ic_instagram)


            bt_bounce.setOnClickListener {
                val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
                ic_image.startAnimation(animation)
            }



    }
}