package com.toanns.kotlinexample.ui.home

import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import com.toanns.kotlinexample.R

/**
 * @author ToanNS
 */
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (savedInstanceState == null) {
            changeFragment(HomeFragment())
        }
    }

    private fun changeFragment(f: HomeFragment, cleanStack: Boolean = false) {
        val ft = supportFragmentManager.beginTransaction()

        if (cleanStack) {
            cleanBackStack();
        }
        ft.replace(R.id.containerFrame, f)
        ft.addToBackStack(null)
        ft.commit()
    }

    private fun cleanBackStack() {
        val manager = supportFragmentManager;
        if (manager.backStackEntryCount > 0) {
            val first = manager.getBackStackEntryAt(0);
            manager.popBackStack(first.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    /**
     * Finish activity when reaching the last fragment.
     */
    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager;
        if (fragmentManager.backStackEntryCount > 1) {
            fragmentManager.popBackStack();
        } else {
            finish();
        }
    }
}