package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phone_book_new.*

class PhoneBookDetailActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_phone_book_new)
		
		getPersonInfoAndDraw()
		back.setOnClickListener{
			onBackPressed()
		}
	}
	fun getPersonInfoAndDraw(){
		val name = intent.getStringExtra("name")
		val number =intent.getStringExtra("number")
		
		person_name_detail.setText(name)
		person_number_detail.setText(number)
	}
}