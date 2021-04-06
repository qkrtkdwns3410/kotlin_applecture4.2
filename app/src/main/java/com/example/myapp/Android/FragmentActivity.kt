package com.example.myapp.Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import com.example.myapp.R
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        Log.d("Life Cycle", "onCreate")

        button.setOnClickListener{
             //프라그먼트를 동적으로 작동하는 방법
            val fragment1 :Fragment1 = Fragment1()
            val fragmentManager: FragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위  >>시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d("Life Cycle", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Life Cycle", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Life Cycle", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Life Cycle", "onStop")


    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life Cycle", "onDestroy")

    }

}