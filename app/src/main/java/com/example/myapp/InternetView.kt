package com.example.myapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.myapp.R
import kotlinx.android.synthetic.main.activity_internet_view.*


class InternetView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet_view)


        btn1.setOnClickListener {
            val address = editText1.text.toString()
            val intent =Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        editText1.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit","beforeTextChanged : "+s)

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit","onTextChanged : "+s)

            }

            override fun afterTextChanged(s: Editable?) {
                Log.d("edit","afterTextChanged : "+s)
            }
        })
    }
}