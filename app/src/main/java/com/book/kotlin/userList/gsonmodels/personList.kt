package com.book.kotlin.userList.gsonmodels

import com.book.kotlin.userList.Person
import com.google.gson.annotations.SerializedName

/**
 * Created by tom.saju on 2/6/2018.
 */
data class personList(
   @SerializedName("results") val personlist :List<Person>
){

}
