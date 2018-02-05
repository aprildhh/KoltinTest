package com.example.dhh.koltintest.studykotlin

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import com.example.dhh.koltintest.R
import kotlinx.android.synthetic.main.activity_variable_activity.*
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import com.example.dhh.koltintest.util.SpannableBuilder


/**
 * Created by DHH on 2018/1/23.
 * 页面：变量
 */
class VariableActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variable_activity)
        var content = "可主动变更或者可预计期间内自动有规律或者无规律的量。\n" +
                "\n" +
                "定义：var 变量名（任意文字、长度不限）\n" +
                "给变量一个值，叫“赋值”，形式 var = 值\n" +
                "\n" +
                "例如：\n" +
                "var steps = 5（常量名虽然用中文也可以但一般不用）\n" +
                "var mealCost = 34\n" +
                "\n" +
                "思考：常量与变量的关系\n" +
                "变化才是永恒不变的。无论如何变化，总有规律可循。\n" +
                "变量与常量在一定条件下可以相互转换\n" +
                "常量就是变量的一种。\n" +
                "\n" +
                "/**\n" +
                "代码注释\n" +
                "    有助于自己理解\n" +
                "    便于他人理解\n" +
                "    专业优雅\n" +
                "**/"+
                "fun main(args: Array<String>){\n" +
                "    print(appleCount)\n" +
                "}\n" +
                "\n" +
                "这样就把常量打印在控制台上了"

//        tv_variable.text = Html.fromHtml(content)

        val spannable = SpannableStringBuilder(content)

        val keyword = "思考：常量与变量的关系"
        val spanStartIndex = content.indexOf(keyword)
        val spacEndIndex = spanStartIndex + keyword.length

        spannable.setSpan(ForegroundColorSpan(Color.RED), spanStartIndex, spacEndIndex
                , Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val dmzsKeyword = "代码注释"
        val dmzsSpanStartIndex = content.indexOf(dmzsKeyword)
        val dmzsSpacEndIndex = dmzsSpanStartIndex + dmzsKeyword.length

        spannable.setSpan(ForegroundColorSpan(Color.RED), dmzsSpanStartIndex, dmzsSpacEndIndex
                , Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        tv_variable.text = spannable

    }
}