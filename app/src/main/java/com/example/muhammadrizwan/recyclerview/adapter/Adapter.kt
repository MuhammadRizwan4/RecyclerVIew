package com.example.muhammadrizwan.recyclerview.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.muhammadrizwan.recyclerview.R
import com.example.muhammadrizwan.recyclerview.User

class Adapter(var ctx:Context , var List : ArrayList<User>) : RecyclerView.Adapter<Adapter.customViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): customViewHolder {

        val inflate = LayoutInflater.from(ctx).inflate(R.layout.card_row, null)
        return customViewHolder(inflate)
    }

    override fun getItemCount(): Int {
            return List.size
    }

    override fun onBindViewHolder(holder: customViewHolder?, position: Int) {
        holder!!.tv1.text = List[position].Name
        holder!!.tv2.text = List[position].Group
    }


    inner class customViewHolder(var view : View) : RecyclerView.ViewHolder(view)
    {
        val tv1 = view.findViewById<TextView>(R.id.TV1)
        val tv2 = view.findViewById<TextView>(R.id.TV2)
    }
}

