package com.book.kotlin.userList

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import com.book.kotlin.R
import com.book.kotlin.userList.gsonmodels.personList

import kotlinx.android.synthetic.main.activity_user_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class UserListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)

        val userlist = findViewById<ListView>(R.id.userlist)
      //  val api :Api
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://randomuser.me/")
                .build()

        val api :Api = retrofit.create(Api::class.java)

      val  call: Call<personList> = api.getRandonUsers(10)

        call.enqueue(object : Callback<personList> {
            override fun onResponse(call: Call<personList>, response: Response<personList>) {
                val personList = response.body()
                val adapter = UserListAdapter(baseContext, personList!!.personlist)

                userlist.adapter = adapter
            }

            override fun onFailure(call: Call<personList>, t: Throwable) {
             //   Log.d(TAG, "onFailure: " + t.message)
              //  Toast.makeText(this@RetrofitActivity, "error " + t.message, Toast.LENGTH_SHORT).show()
           Toast.makeText(baseContext,"Error",Toast.LENGTH_SHORT)
            }
        })
    }

}
