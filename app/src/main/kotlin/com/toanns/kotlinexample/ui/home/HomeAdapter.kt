package com.toanns.kotlinexample.ui.home

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.toanns.kotlinexample.R
import com.toanns.kotlinexample.common.inflate
import com.toanns.kotlinexample.model.RedditNewsItem
import kotlinx.android.synthetic.main.item_home.view.*

/**
 * @author ToanNS
 */
class HomeAdapter(var items: List<RedditNewsItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        val homeViewHolder = holder as HomeViewHolder
        homeViewHolder.bind(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder? {
//    return LayoutInflater.from(context).inflate(R.layout.item_home, parent, false)
        return HomeViewHolder(parent)
    }

    class HomeViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.item_home)) {
        fun bind(item : RedditNewsItem) = with(itemView) {
            tvName.text = item.author
            tvAge.text = item.title
        }
    }

}