package com.example.dhh.koltintest.studykotlin

import android.app.Activity
import android.os.Bundle
import com.example.dhh.koltintest.R
import kotlinx.android.synthetic.main.activity_constant_activity.*

/**
 * Created by DHH on 2018/1/23.
 * 页面：常量
 */
class ConstantActivity:Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constant_activity)

        var content = "预期范围内恒定不变的量。\n" +
                "\n" +
                "定义：val 常量名（任意文字、长度不限）\n" +
                "给常量一个值，叫“赋值”，形式 val = 值\n" +
                "\n" +
                "例如：\n" +
                "val π = 3.1415926\n" +
                "var 工资 = 5000\n" +
                "（常量名虽然用中文也可以但一般不用）\n" +
                "\n" +
                "var appleCount = 4\n" +
                "fun main(args: Array<String>){\n" +
                "    print(appleCount)\n" +
                "}\n" +
                "\n" +
                "这样就把常量打印在控制台上了"
        tv_constant.text = content
    }
}