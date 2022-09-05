package com.example.locationsearchmapapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SearchRecyclerAdapter : RecyclerView.Adapter<> {

    class SearchResultItemViewHolder(itemView : View, val searchResultClickListener : (Any) -> Unit) : RecyclerView.ViewHolder(itemView) {
        fun bindData(data : Any) = with(itemView) {

        }
    }

    override fun getItemViewType(position: Int): Int = R.layout.viewholder_search_result_item

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ???, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}