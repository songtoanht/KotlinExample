package com.toanns.kotlinexample.ui.shop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.toanns.kotlinexample.R
import kotlinx.android.synthetic.main.activity_shop.viewPager

/**
 * Copyright © 2016 AsianTech inc.
 * Created by toanns on 18/12/2016.
 */
class ShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        viewPager.adapter=ViewPagerAdapter(supportFragmentManager)
    }


    class ViewPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            return ShopFragment.newInstance()
        }

        override fun getCount(): Int {
            return 4
        }

    }
}
