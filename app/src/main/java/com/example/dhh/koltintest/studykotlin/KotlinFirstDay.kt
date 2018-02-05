package com.example.dhh.koltintest.studykotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ExpandableListView
import android.widget.Toast
import com.example.dhh.koltintest.R
import com.example.dhh.koltintest.studykotlin.adapter.FirstDayAdapter
import kotlinx.android.synthetic.main.activity_kotlin_firstday.*

/**
 * Created by DHH on 2018/1/22.
 * 页面：
 */
class KotlinFirstDay : Activity() {

    var mAdapter: FirstDayAdapter? = null

    private var itemArray: Array<String> = arrayOf("1节 第一天 课程概览 & 1~4集", "-- 课程概览", "-- IDE安装", "-- 第一个Hello World程序", "-- 常量", "-- 变量", "2节 第一天 5~9集", "-- 整数型", "-- 浮点型", "-- ", "-- ", "-- ", "第三天")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_firstday)
        mAdapter = FirstDayAdapter(this, itemArray)
        lv_first_day.adapter = mAdapter

        lv_first_day.setOnItemClickListener(){ adapterView: AdapterView<*>, view1: View, position: Int, l: Long ->
            when(position){
                0 ->{
                    Toast.makeText(this,"1节 第一天 课程概览 & 1~4集",Toast.LENGTH_SHORT).show()
                }
                1->{
                    Toast.makeText(this,"暂无内容 -- 课程概览",Toast.LENGTH_SHORT).show()
                }
                2->{
                    Toast.makeText(this,"暂无内容 -- IDE安装",Toast.LENGTH_SHORT).show()
                }
                3->{
                    Toast.makeText(this,"暂无内容 -- 第一个Hello World程序",Toast.LENGTH_SHORT).show()
                }
                4->{
                    //-- 常量
                    var intent:Intent = Intent(this,ConstantActivity::class.java)
                    startActivity(intent)
                }
                5->{
                    //-- 变量
                    var intent:Intent = Intent(this,VariableActivity::class.java)
                    startActivity(intent)
                }
                6 -> {
                    Toast.makeText(this, "2节 第一天 5~9集", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}