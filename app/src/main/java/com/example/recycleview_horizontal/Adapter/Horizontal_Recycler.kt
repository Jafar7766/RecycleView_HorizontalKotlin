package com.example.recycleview_horizontal.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview_horizontal.R

class Horizontal_Recycler: RecyclerView.Adapter<Horizontal_Recycler.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: Horizontal_Recycler.MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 25
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }
}