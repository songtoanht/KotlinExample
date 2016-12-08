package com.toanns.kotlinexample.ui.shop

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.toanns.kotlinexample.R

class ShopActivity : AppCompatActivity() {

    private var mViewPage: ViewPager? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        mViewPage = findViewById(R.id.viewPager) as ViewPager?
        val adapter = ViewPagerAdapter(supportFragmentManager)
        mViewPage?.setAdapter(adapter)
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
