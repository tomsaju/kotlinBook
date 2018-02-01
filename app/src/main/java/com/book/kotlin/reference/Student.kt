package com.book.kotlin.reference

/**
 * Created by tom.saju on 1/16/2018.
 */

//A simple class extending another class. A class should be declared as open or abstract if we need to extend it
class Student(name : String,ID : Int) : Person(name,ID){



    //Simple function in kotlin example.
    fun addScores(External : Int,Internal: Int):Int {

        return External+Internal;
    }

    //if return type is Unit (like void in java), no need to specify it
    fun addScores(External: Int,Subject : String){}
}