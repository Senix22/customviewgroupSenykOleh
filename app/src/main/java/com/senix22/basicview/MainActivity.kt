package com.senix22.basicview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Custom>(R.id.view1).changeText(R.string.nameOfFilm)
        findViewById<Custom>(R.id.view1).changeType(R.string.animation)
        findViewById<Custom>(R.id.view1).changePrice(R.string.price)
        findViewById<Custom>(R.id.view1).setImage(R.drawable.baby_boss)
    }
}