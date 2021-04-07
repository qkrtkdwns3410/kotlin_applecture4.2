package com.example.myapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.myapp.R
import com.example.myapp.R.*
import kotlinx.android.synthetic.main.activity_internet_view.*

class resource : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_resource)



//        //1.
//        val ment =resources.getString(R.string.Hello)
//        Log.d("mentt","ment : "+ment)
//
//        //2.
//        val ment2 =getString(R.string.Hello)
//        Log.d("mentt","ment : "+ment2)


        //SDK버전에 따른 분기 처리
        val color =btn1.setBackgroundColor(getColor(color.TextViewColor))




    }
}