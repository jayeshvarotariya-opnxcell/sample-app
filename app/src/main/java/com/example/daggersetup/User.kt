package com.example.daggersetup

import android.util.Log

class User(private val name:String,private val mobile: Mobile) {

     fun print (){
        Log.e("User","I'm user $this ,  My name is $name and My number is  ${mobile.number}")
    }

}