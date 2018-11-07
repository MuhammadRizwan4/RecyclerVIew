package com.example.muhammadrizwan.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.example.muhammadrizwan.recyclerview.adapter.Adapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user = ArrayList<User>()
        user.add(User("Muhammad Rizwan","BSSC"))
        user.add(User("Muhammad Farhan","Software Engineering"))
        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)

        val adapter = Adapter(this, user)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

    }
}
