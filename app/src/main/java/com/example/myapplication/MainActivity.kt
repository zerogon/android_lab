package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt = findViewById<TextView>(R.id.txtHello)
        txt.text = "안녕하세요"
        txt.textSize = 32.0F
        txt.setTextColor(Color.parseColor("#FF0000"))
    }
}
