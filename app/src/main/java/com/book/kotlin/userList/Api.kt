package com.book.kotlin.userList

import com.book.kotlin.userList.gsonmodels.personList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by tom.saju on 2/6/2018.
 */
interface Api  {
   // var BASE_URL: String  = "https://randomuser.me/"

    @GET("api/")
    abstract fun getRandonUsers(@Query("results") results: Int): Call<personList>
}