package com.example.myapp.Android

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapp.R
import kotlinx.android.synthetic.main.activity_internet_view.*

class resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)



//        //1.
//        val ment =resources.getString(R.string.Hello)
//        Log.d("mentt","ment : "+ment)
//
//        //2.
//        val ment2 =getString(R.string.Hello)
//        Log.d("mentt","ment : "+ment2)


        //SDK버전에 따른 분기 처리
        val color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) { //minimum sdk level

            btn1.setBackgroundColor(getColor(R.color.TextViewColor))

        } else {

            btn1.setBackgroundColor(resources.getColor(R.color.TextViewColor))

        }


    }
}