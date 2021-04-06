package com.example.myapp.Android

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapp.R


class Fragment1:Fragment(){
    override fun onAttach(context: Context) {
        Log.d("Life Cycle","onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Life Cycle","onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 프라그먼트가 인터페이스를 처음으로 그릴 때 호출된다.
        // inflater >> 뷰를 그려주는 역할
        //container >> 부모뷰
        Log.d("Life Cycle","onCreateView")
        return inflater.inflate(R.layout.fragment_one,container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Life Cycle","onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Life Cycle","onActivityCreated")

        val data = arguments?.getString("hello")
        Log.d("data", data)

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("Life Cycle","onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Life Cycle","onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Life Cycle","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Life Cycle","onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Life Cycle","onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("Life Cycle","onDetach")
        super.onDetach()
    }
}