package com.example.myapp.Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapp.R



lateinit var lateCar :Car

class Car(var number :Int){

}
class NullSafety : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)
        ////
        lateCar = Car(10) //lateinit인 경우 사용전에 반드시 초기화를 해야합니다.
        Log.d("number","late number : "+lateCar.number) //lateinit 비추합니다.
        ////

        val number: Int = 10
        val number1: Int? = null

        val number3 = number1?.plus(number) //num1이 널 이기에 그 이하를 실행하지 않습니다.
//        Log.d("number", "number3 : " + number3)
//
//        //삼항 연산자 >>elvis연산자
//        //NullSafety를 위한 도구입니다.
        val number4 = number1 ?:10 //num1 널이 아니면 10이 넘4에 들어갑니다



    }

    fun plus(a: Int, b: Int?): Int {
        if (b != null) return a + b
        else return a
    }
    fun plus2(a:Int,b:Int?):Int?{
        return b?.plus(a) //실제로 b가 널일수있음
    }
}