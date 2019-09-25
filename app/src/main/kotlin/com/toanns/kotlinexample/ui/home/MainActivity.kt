package com.toanns.kotlinexample.ui.home

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.toanns.kotlinexample.R

/**
 * @author ToanNS
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvText = findViewById<TextView>(R.id.tvShopName)
        val btnChangeName = findViewById<Button>(R.id.btnChangName)
        val btnChangeColor = findViewById<Button>(R.id.btnChangeColor)
        val btnChangeSize = findViewById<Button>(R.id.btnChangeSize)


        btnChangeName.setOnClickListener { tvText.text = "Haha" }
        btnChangeColor.setOnClickListener {
            tvText.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
        }
        btnChangeSize.setOnClickListener { tvText.textSize = 30f }

    }
}
