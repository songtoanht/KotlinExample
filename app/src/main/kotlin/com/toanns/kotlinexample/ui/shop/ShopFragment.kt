package com.toanns.kotlinexample.ui.shop

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.toanns.kotlinexample.R
import com.toanns.kotlinexample.common.inflate

/**
 * Todo
 *
 * @author ToanNS
 */
class ShopFragment : Fragment() {

    private var mTvName: TextView? = null

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
    }

}