package com.toanns.kotlinexample.ui.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.toanns.kotlinexample.R
import com.toanns.kotlinexample.model.RedditNewsItem
import java.util.*

/**
 * @author ToanNS
 */
class HomeFragment : Fragment() {
    private var homeList: RecyclerView? = null
    private var mStudents: ArrayList<RedditNewsItem> = ArrayList()

    private val newsList by lazy {
        homeList
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        homeList = view?.findViewById(R.id.recycler) as RecyclerView?
        newsList?.setHasFixedSize(true)
        newsList?.layoutManager = LinearLayoutManager(context)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getDummyData()
        initAdapter()
    }

    private fun getDummyData() {
        for (i in 1..10) {
            val reddit = RedditNewsItem("0" + i, "e" + i)
            mStudents.add(reddit)
        }

    }

    private fun initAdapter() {
        if (homeList?.adapter == null) {
            homeList?.adapter = HomeAdapter(mStudents)
        }
    }
}