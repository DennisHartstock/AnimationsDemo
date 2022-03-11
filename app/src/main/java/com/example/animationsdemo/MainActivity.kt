package com.example.animationsdemo

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animationImageView = findViewById<ImageView>(R.id.animationImageview)

        var background = animationImageView.background as AnimationDrawable
        background.setEnterFadeDuration(3000)
        background.setExitFadeDuration(1000)
        background.start()
    }
}