package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class Contacts : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_contacts)
		
		var phoneBook=createFakePhoneBook(30)
		createPhoneBookList(phoneBook)
		
	}
	
	fun createFakePhoneBook(fakeNumber: Int = 10, phoneBook: PhoneBook = PhoneBook()): PhoneBook {
		for (i in 0 until fakeNumber) {
			phoneBook.addPerson(
				Person(name = ""+i+"번째 사람", number = ""+i+"번째 사람의 전화번호")
			
			)
		}
		return phoneBook
	}
	fun createPhoneBookList(phoneBook: PhoneBook){
		val layoutInflater =LayoutInflater.from(this)
		val container =findViewById<LinearLayout>(R.id.phonebook_list_container)
		for (i in 0 until phoneBook.personlist.size){
			val view = layoutInflater.inflate(R.layout.phonebook_item,null)
			val personview = view.findViewById<TextView>(R.id.person_name)
			personview.setText(phoneBook.personlist.get(i).name)
			addSetonClickListener(phoneBook.personlist.get(i),view)
			container.addView(view)
		}
	}
	
	fun addSetonClickListener(person: Person,view: View){
		view.setOnClickListener{
			val intent: Intent = Intent(this@Contacts,PhoneBookDetailActivity::class.java)
			intent.putExtra("name",person.name)
			intent.putExtra("number",person.number)
			startActivity(intent)
		}
	}
}

class PhoneBook() {
	//전화번호부 (종합)
	val personlist = ArrayList<Person>()
	fun addPerson(person: Person) {
		personlist.add(person)
	}
}

class Person(val name: String, val number: String) {
	//인명부
}