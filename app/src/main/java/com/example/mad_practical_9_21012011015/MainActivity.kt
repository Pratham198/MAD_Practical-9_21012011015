package com.example.mad_practical_9_21012011015

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmAnimation: AnimationDrawable
    lateinit var heartanimation : AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alarm:ImageView = findViewById(R.id.alarm)
        alarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmAnimation=alarm.background as AnimationDrawable

        val heart : ImageView = findViewById(R.id.heart)
        heart.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation = heart.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            alarmAnimation.start()
            heartanimation.start()
        }
        else{
            alarmAnimation.stop()
            heartanimation.stop()
        }
    }
}