package com.toanns.kotlinexample.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.toanns.kotlinexample.R
import com.toanns.kotlinexample.model.RedditNewsItem
import java.util.ArrayList

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
            val redit = RedditNewsItem("0$i", "e$i")
            mStudents.add(redit)
        }

    }

    private fun initAdapter() {
        if (homeList?.adapter == null) {
            homeList?.adapter = HomeAdapter(mStudents)
        }
    }
}