package com.mirkamol.telegramanimatios.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.mirkamol.telegramanimatios.R

class SequentialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sequential)

        val btn_sequential = findViewById<Button>(R.id.btnSequential)
        val ic_image = findViewById<ImageView>(R.id.ic_instagram)

        btn_sequential.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.sequential)
            ic_image.startAnimation(animation)
        }
    }
}