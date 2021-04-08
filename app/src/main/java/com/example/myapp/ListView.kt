package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_list_view.*
import java.nio.file.Files.size

class ListView : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_list_view)
		
		val carList = ArrayList<CarForList>()
		for (i in 0 until 10){
			carList.add(CarForList(""+i+"번째 자동차",""+i+"순위 엔진"))
		}
		val adapter =ListViewAdapter(carList, LayoutInflater.from(this))
		listView.adapter =adapter
	}
}
class ListViewAdapter(
	val carForList: ArrayList<CarForList>,
	val layoutInflater : LayoutInflater
) :BaseAdapter(){
	override fun getCount(): Int { // 내가가진 리스트 개수를 알려주는 함수
		return carForList.size
	}
	
	override fun getItem(position: Int): Any {
		return carForList.get(position) //리스트뷰의 순서
	}
	
	override fun getItemId(position: Int): Long { //id는 그냥 포지션 ..
		//해당 포지션에 위치해 있는 아이템뷰의 아이디설정
		return position.toLong()
	}
	
	override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
		//뷰를 그리는 부분입니다
		//그리고자 하는 아이템 리스트의 하나(포지션에 해당하는)
		val view =layoutInflater.inflate(R.layout.item_view,null)
		val carNameTextView =  view.findViewById<TextView>(R.id.Car_name)
		val carEngineTextView =  view.findViewById<TextView>(R.id.Car_engine)
		
		carEngineTextView.setText(carForList.get(position).engine)
		carNameTextView.setText(carForList.get(position).name)
		return view
		
	}
}