package com.example.animationsdemo

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationImageView = findViewById<ImageView>(R.id.animationImageview)
        val gradientOverlay = findViewById<LinearLayout>(R.id.gradientOverlay)

        val background = animationImageView.background as AnimationDrawable
        background.setEnterFadeDuration(3000)
        background.setExitFadeDuration(1000)
        background.start()

        val overlay = gradientOverlay.background as AnimationDrawable
        overlay.setEnterFadeDuration(3000)
        overlay.setExitFadeDuration(1000)
        overlay.start()
    }
}