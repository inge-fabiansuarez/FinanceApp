package com.fabiansuarez.financeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView


class IntroActivity : AppCompatActivity() {

    lateinit var ivLogo: ImageView
    lateinit var ivBackground: ImageView
    lateinit var lavIntro : LottieAnimationView
    lateinit var tvAppName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        getReferencesView()
        runAnimation()

        android.os.Handler().postDelayed({
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }, 2600)
       }

    fun getReferencesView(){
        ivLogo = findViewById(R.id.iv_logo_intro)
        ivBackground = findViewById(R.id.iv_background_intro)
        lavIntro = findViewById(R.id.lav_intro)
        tvAppName = findViewById(R.id.tv_appname_intro)
    }

    fun runAnimation(){
        ivLogo.animate().translationY(-1000F).setDuration(800).setStartDelay(1200)
        tvAppName.animate().translationY(-1000F).setDuration(800).setStartDelay(1200)
        lavIntro.animate().translationY(1800F).setDuration(800).setStartDelay(1200)
        ivBackground.animate().translationY(-2400F).setDuration(800).setStartDelay(1200)
    }
}