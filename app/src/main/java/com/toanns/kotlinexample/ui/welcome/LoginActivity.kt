package com.toanns.kotlinexample.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.toanns.kotlinexample.R
import com.toanns.kotlinexample.ui.shop.ShopActivity

/**
 * @author ToanNS
 */
class LoginActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login = findViewById(R.id.btnLogin) as Button

        login.setOnClickListener({ v ->
            val intent = Intent(this, ShopActivity::class.java)
                    startActivity(intent)
        })

    }
}