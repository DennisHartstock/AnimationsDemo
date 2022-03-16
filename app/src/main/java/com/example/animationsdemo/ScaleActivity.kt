package com.example.animationsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView

class ScaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scale)
    }

    fun startAnimation(view: View) {
        // startScaleAnimation()
        // translateAnimation()
        startAnimationDynamically()
    }

    private fun startScaleAnimation() {
        val scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.startAnimation(scaleAnimation)
    }

    private fun translateAnimation() {
        val translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_animation)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.startAnimation(translateAnimation)
    }

    private fun startAnimationDynamically() {
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.animate().translationYBy(500f).rotation(720f).alpha(0f).duration = 2000
    }
}