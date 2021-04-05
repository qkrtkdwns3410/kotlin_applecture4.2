package com.example.myapp.Android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.R
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        change_activity.setOnClickListener {
//            val intent = Intent(this@Intent1, Intent2::class.java) //인텐트를 만들었다
//            //요청을 보낼때
//            // KEY와 value 방식  -> key와 value 를 쌍으로 만들어 저장한다.  >> Dictionary
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivity(intent)
//            //위 아래 서로 같습니다.

            val intent2 = Intent(this@Intent1, Intent2::class.java)
            //apply >>
            intent2.apply {
                this.putExtra("number1", 1)
                this.putExtra("number2", 2)
            }
            startActivity(intent2)
        }
    }
}