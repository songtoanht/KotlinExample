package com.toanns.kotlinexample.ui.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.toanns.kotlinexample.R

/**
 * @author ToanNS
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvText = findViewById(R.id.tvShopName) as TextView

        val btnChangeName = findViewById(R.id.btnChangName) as Button
        val btnChangeColor = findViewById(R.id.btnChangeColor) as Button
        val btnChangeSize = findViewById(R.id.btnChangeSize) as Button


        btnChangeName.setOnClickListener({tvText.text = "Haha"})
        btnChangeColor.setOnClickListener { tvText.setTextColor(R.color.colorPrimary) }
        btnChangeSize.setOnClickListener { tvText.setTextSize(30f) }

    }
}
