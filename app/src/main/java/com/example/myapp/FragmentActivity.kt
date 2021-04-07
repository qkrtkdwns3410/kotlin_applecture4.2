package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        Log.d("Life Cycle", "onCreate")
        //
        val fragment1: Fragment1 = Fragment1()
        //프라그먼트에 데이터를 넣기
        val bundle: Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragment1.arguments = bundle




        button.setOnClickListener {
            //프라그먼트를 동적으로 작동하는 방법
            val fragmentManager: FragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위  >>시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment1)
            fragmentTransaction.commit() //끝.
            //끝을 내는 방법
            //commit() >>시간 될때 해 <좀더 안정적임>
            //commitnow() >> 지금 당장 해
        }
        button2.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.detach(fragment1)
            fragmentTransaction.commit()
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