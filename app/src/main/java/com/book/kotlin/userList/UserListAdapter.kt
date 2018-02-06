package com.book.kotlin.userList

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.book.kotlin.R
import com.squareup.picasso.Picasso

/**
 * Created by tom.saju on 2/6/2018.
 */
class UserListAdapter(val context: Context,val personList: List<Person>) : BaseAdapter() {

 private val mInflator:LayoutInflater
   init {
    mInflator = LayoutInflater.from(context)
   }



    override fun getView(postion: Int, convertView: View?, viewgroup: ViewGroup?): View? {

     val view:View?
     if(convertView ==null){
      view = mInflator.inflate(R.layout.personlist_layout,viewgroup,false)
      view.findViewById<TextView>(R.id.userName).text = personList[postion].name.first
      view.findViewById<TextView>(R.id.userEmail).text = personList[postion].email
      val imageView:ImageView = view.findViewById(R.id.thumb)
      Picasso.with(context).load(personList[postion].picture.thumbnail).into(imageView)
     }else{
      view = convertView
      view.findViewById<TextView>(R.id.userName).text = personList[postion].name.first
      view.findViewById<TextView>(R.id.userEmail).text = personList[postion].email
      val imageView:ImageView = view.findViewById(R.id.thumb)
      Picasso.with(context).load(personList[postion].picture.thumbnail).into(imageView)
     }
    return view
    }

    override fun getItem(position: Int): Any {
    return personList[position]
    }

    override fun getItemId(position: Int): Long {
    return 0
    }

    override fun getCount(): Int {
     return personList.size
    }
}