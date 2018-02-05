package com.example.dhh.koltintest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.dhh.koltintest.adapter.MainItemAdapter
import com.example.dhh.koltintest.studykotlin.StudyKotlinActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 *包裹进布局,然后后面直接可以通过xml里面写的id直接使用
 */

class MainActivity : Activity(){

    private var itemList = ArrayList<String>()
    private var itemArray : Array<String> = arrayOf("3天学会Kotlin","bb","bb","bb","bb","bb")
    private var mAdapter : MainItemAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = MainItemAdapter(this,itemArray)
        lv_main.adapter = mAdapter

        lv_main.setOnItemClickListener{
            adapterView: AdapterView<*>, view1: View, position: Int, l: Long ->
            when(position){
                0 ->{
                    val intent = Intent().setClass(this, StudyKotlinActivity::class.java)
                    // 获取class是使用::反射
                    startActivity(intent)
                }
                1->{
                    val intent = Intent().setClass(this, SecondActivity::class.java)
                    // 获取class是使用::反射
                    startActivity(intent)
                }
            }
        }


    }

    fun jump(view: View){

        val intent = Intent().setClass(this, SecondActivity::class.java)
        // 获取class是使用::反射
        startActivity(intent)
    }
}

private fun ArrayList<String>.getData() {

}


