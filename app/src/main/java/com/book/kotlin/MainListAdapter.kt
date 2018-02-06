package com.book.kotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.book.kotlin.userList.UserListActivity
import com.book.kotlin.weather.WeatherListActivty

/**
 * Created by tom.saju on 2/1/2018.
 */
class MainListAdapter (val context: Context,val items: List<String>) : BaseAdapter() {


    private val mInflator:LayoutInflater
    init {
        mInflator = LayoutInflater.from(context)
    }


    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View? {

        val view:View?
        if(convertView==null){
            view = mInflator.inflate(R.layout.homelist_item,p2,false)
            view.findViewById<TextView>(R.id.listItemText).text = items[position]
        }else{
            view = convertView
            view.findViewById<TextView>(R.id.listItemText).text = items[position]


        }

        view?.setOnClickListener {
            when(position){
                0 -> {
                    val intent = Intent(context, WeatherListActivty::class.java)
                    context.startActivity(intent)
                }
                1->{
                    val intent = Intent(context, UserListActivity::class.java)
                    context.startActivity(intent)
                }
            }
        }
        return view

    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
    return p0.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }

}