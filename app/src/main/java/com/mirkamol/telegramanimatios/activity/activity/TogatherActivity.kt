package com.mirkamol.telegramanimatios.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.mirkamol.telegramanimatios.R

class TogatherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_togather)

        val btn_togather = findViewById<Button>(R.id.btnTogather)
        val image = findViewById<ImageView>(R.id.ic_instagram)

        btn_togather.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.togather)
            image.startAnimation(animation)
        }
    }
}