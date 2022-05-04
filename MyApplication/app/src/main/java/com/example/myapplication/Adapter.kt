package com.example.myapplication

import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (
    private val nameList: MutableList<Rest>,
    val mainActivity: MainActivity):RecyclerView.Adapter<MyAdapter.MyViewHolder>()

    {
        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

        val list = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(list)
        val list = nameList[position]
        holder.itemView.findViewById<TextView>(R.id.answer).text = list.answer
        override fun getItemCount() = nameList.size

    }
}