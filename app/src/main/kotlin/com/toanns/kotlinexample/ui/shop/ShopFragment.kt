package com.toanns.kotlinexample.ui.shop

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.toanns.kotlinexample.R
import com.toanns.kotlinexample.common.inflate
import com.toanns.kotlinexample.service.ChatHeadService
import kotlinx.android.synthetic.main.fragment_shop.*

/**
 * Copyright © 2016 AsianTech inc.
 * Created by toanns on 18/12/2016.
 */
class ShopFragment : Fragment() {

    companion object {
        fun newInstance() : ShopFragment {
            val fr = ShopFragment()
            return fr
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_shop, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnOK.setOnClickListener {
//            startActivity(Intent(activity, HomeActivity::class.java))
            Log.d("ttt", "hay hay")
            activity.startService(Intent(activity, ChatHeadService::class.java))
        }
    }
}
