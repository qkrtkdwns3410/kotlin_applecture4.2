package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class AddViewActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_add_view)
		
		//item리스트 준비
		val carlist = ArrayList<CarForList>()
		for (i in 0 until 10) {
			carlist.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))
		}
		val container =findViewById<LinearLayout>(R.id.addView_container)
		val inflater =this@AddViewActivity.layoutInflater
		for (i in 0 until carlist.size){
			val itemview = inflater.inflate(R.layout.item_view,null)
			val carNameView = itemview.findViewById<TextView>(R.id.Car_name)
			val carEngineView = itemview.findViewById<TextView>(R.id.Car_engine)
			
			
			carNameView.setText(carlist.get(i).name)
			carEngineView.setText(carlist.get(i).engine)
			container.addView(itemview)
		}
		
		
	}
}

class CarForList(val name: String, val engine: String) {

}