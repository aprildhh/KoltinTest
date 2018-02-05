package com.example.dhh.koltintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

/**
 * Created by DHH on 2018/1/18.
 * 页面：
 */
class SecondActivity : AppCompatActivity() {

    private var textview: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var textview = findViewById(R.id.textview) as TextView
        textview .setText("跳转的第二页") //直接使用布局中定义的id，不需要获取
    }
}