package com.example.dhh.koltintest.studykotlin.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.dhh.koltintest.R

/**
 * Created by DHH on 2018/1/22.
 * 页面：
 */
class StudyKotlinAdapter(val context: Context, val itemArray: Array<String>) :BaseAdapter(){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var mHolder : ViewHolder
        var view : View

        if (convertView == null){
            view = View.inflate(context, R.layout.item_study_kotlin,null)
            mHolder = ViewHolder(view)
            view.tag = mHolder
        }else{
            view = convertView
            mHolder = view.tag as ViewHolder
        }

        mHolder.tv_item_study_kotlin.text = itemArray[position]

        return view
    }

    override fun getItem(position: Int): Any {
        return itemArray.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return itemArray.size
    }

    class ViewHolder(var view: View) {
        var tv_item_study_kotlin : TextView = view.findViewById(R.id.tv_item_study_kotlin)
    }

}