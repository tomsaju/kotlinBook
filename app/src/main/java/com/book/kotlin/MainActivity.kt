package com.book.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class MainActivity : AppCompatActivity()  {
    private val items = listOf( "Weatherlist","Retrofit and gson")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mainList = findViewById<ListView>(R.id.homeList)
        mainList.adapter = MainListAdapter(this, items)





    }
}


