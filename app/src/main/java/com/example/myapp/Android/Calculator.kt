package com.example.myapp.Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.R
import kotlinx.android.synthetic.main.activity_test20210405.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test20210405)
        //new ->old (new +old)
        var new = "0"
        var old = "0"

        number0.setOnClickListener {
            new += "0"
            result.setText(new)

        }
        number1.setOnClickListener {
            new += "1"
            result.setText(new)

        }
        number2.setOnClickListener {
            new += "2"
            result.setText(new)

        }
        number3.setOnClickListener {
            new += "3"
            result.setText(new)

        }
        number4.setOnClickListener {
            new += "4"
            result.setText(new)
        }
        number5.setOnClickListener {
            new += "5"
            result.setText(new)
        }
        number6.setOnClickListener {
            new += "6"
            result.setText(new)
        }
        number7.setOnClickListener {
            new += "7"
            result.setText(new)
        }
        number8.setOnClickListener {
            new += "8"
            result.setText(new)
        }
        number9.setOnClickListener {
            new += "9"
            result.setText(new)
        }
        ca.setOnClickListener {
            result.setText("0")
            new = "0"
            old = "0"
        }
        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            result.setText(old)

        }


    }

}