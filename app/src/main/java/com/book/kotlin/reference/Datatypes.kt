package com.book.kotlin.reference

import android.content.Context

/**
 * Created by tom.saju on 1/16/2018.
 */
class Datatypes {
    //variables can be declared with or without the type

    val i = 3;
    val x:Int = 5;

    //There are no automatic conversions for datatypes. You have to explicitly convert
    val a :Int=7
    val d :Double = a.toDouble();

    //characters cannot be directly used as numbers. But can be converted to numbers
    val c:Char = '5'
    val numberFromChar = c.toInt();

    //Bitwise operators-- or and and can be used instead of || and &&
    val firstBool = true;
    val secondBool = false;
    val result = firstBool or secondBool
    val result2 = firstBool and secondBool


    //Literals can give information about their types. This can be used to tell the compiler what type of data is it
    val q = 3L //long
    val w = 5.6 //double
    val f = 4.5f//float


    //A string can be accessed as an array and can be iterated
    val string ="Cleopatra"
    val one = string[3]


    //val creates and immutable object and var creates mutable one. val is more recommended since the object is immutable, code will be much
    //more robust and thread safe



    //Also we dont need to specify object types. But more generic types must be specified
    val m = 4;
    //val context:Context =activity










}