package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {
    var number =10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

//      view를 액티비티로 가져오는 방법
        //1>직접 가져온다
//        val textView: TextView =findViewById(R.id.hello)
        //2>xml을 import해서 가져온다

        //람다방법
        hello.setOnClickListener {
            Log.d("click","click!!")
        }
        //익명함수 방법
        hello.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click","click!!")
            }
        })
        //3번째 방식>>이름이 필요한 경우 (click)
        val click = object :View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click","click!!")
                hello.setText("안녕하세요")
                image.setImageResource(R.drawable.book)
                number+=10
                Log.d("number",""+number)


            }
        }
        hello.setOnClickListener(click)
        //뷰를 조작하는 함수들
        //1.setText
        //2.setImageResource


    }
}