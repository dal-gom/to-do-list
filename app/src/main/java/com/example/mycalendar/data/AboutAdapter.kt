package com.example.calendar.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.calendar.R
import kotlin.collections.ArrayList


class AboutAdapter(private var infoList: ArrayList<String>) : RecyclerView.Adapter<AboutAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.info_menu_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentTask = infoList[position]
        holder.myInfoName.text = currentTask
    }

    override fun getItemCount(): Int {
        return infoList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val myInfoName: TextView = itemView.findViewById(R.id.myInfo)
    }
}
