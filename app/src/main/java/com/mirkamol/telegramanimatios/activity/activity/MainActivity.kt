package com.mirkamol.telegramanimatios.activity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.mirkamol.telegramanimatios.R

class MainActivity() : AppCompatActivity() {
    lateinit var ic_sample: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        ic_sample = findViewById(R.id.ic_sample)
        val b_zoom = findViewById<Button>(R.id.b_zoom)
        val b_rotate = findViewById<Button>(R.id.b_rotate)
        val b_fade = findViewById<Button>(R.id.b_fade)
        val b_blink = findViewById<Button>(R.id.b_blink)
        val b_move = findViewById<Button>(R.id.b_move)
        val b_slide = findViewById<Button>(R.id.b_slide)
        val bt_bounce = findViewById<Button>(R.id.bt_bounce)
        val btn_sequential = findViewById<Button>(R.id.bt_Sequential)
        val btn_togather = findViewById<Button>(R.id.bt_togather)
        val facebook = findViewById<Button>(R.id.bt_facebook)
        val btn_youtube = findViewById<Button>(R.id.btn_youtube)
        val btn_twitter = findViewById<Button>(R.id.btn_twitter)
        val btn_telegram =  findViewById<Button>(R.id.btn_telegram)

        b_zoom.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
            ic_sample.startAnimation(animation)
        }

        b_rotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
            ic_sample.startAnimation(animation)
        }
        b_fade.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
            ic_sample.startAnimation(animation)
        }
        b_blink.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
            ic_sample.startAnimation(animation)
        }
        b_move.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
            ic_sample.startAnimation(animation)
        }
        b_slide.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
            ic_sample.startAnimation(animation)
        }

        bt_bounce.setOnClickListener {
            val intent = Intent(this, BounceActivity::class.java)
            startActivity(intent)
        }

        btn_sequential.setOnClickListener {
            val intent = Intent(this, SequentialActivity::class.java)
            startActivity(intent)
        }
        btn_togather.setOnClickListener {
            val intent = Intent(this, TogatherActivity::class.java)
            startActivity(intent)
        }

        facebook.setOnClickListener {
            val intent = Intent(this, FacebookActivity::class.java)
            startActivity(intent)

        }


        btn_youtube.setOnClickListener {
            val intent = Intent(this, YoutubeActivity::class.java)
            startActivity(intent)
        }
        btn_twitter.setOnClickListener {
            val intent = Intent(this, TwitterActivity::class.java)
            startActivity(intent)
        }

        btn_telegram.setOnClickListener {
            val intent = Intent(this, TelegramAnimationActivity::class.java)
            startActivity(intent)
        }

    }
}

