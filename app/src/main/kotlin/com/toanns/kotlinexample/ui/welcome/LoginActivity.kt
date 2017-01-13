package com.toanns.kotlinexample.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.toanns.kotlinexample.R
import com.toanns.kotlinexample.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*

/**
 * @author ToanNS
 */
class LoginActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener({ v ->
            val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
        })

    }
}