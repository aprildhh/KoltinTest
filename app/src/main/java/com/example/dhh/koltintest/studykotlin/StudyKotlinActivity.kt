package com.example.dhh.koltintest.studykotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.dhh.koltintest.R
import com.example.dhh.koltintest.studykotlin.adapter.StudyKotlinAdapter
import kotlinx.android.synthetic.main.activity_study_kotlin.*

/**
 * Created by DHH on 2018/1/22.
 * 页面：
 */
class StudyKotlinActivity : Activity(){

    private var itemArray : Array<String> = arrayOf("第一天","第二天","第三天")
    private var mAdapter : StudyKotlinAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_kotlin)

        mAdapter = StudyKotlinAdapter(this, itemArray)
        lv_study_kotlin.adapter = mAdapter

        lv_study_kotlin.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, position: Int, l: Long ->
            when(position){
                0->{
                    val intent : Intent = Intent(this,KotlinFirstDay::class.java)
                    startActivity(intent)
                }
            }
        }

    }

}