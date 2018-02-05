package com.example.dhh.koltintest.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.dhh.koltintest.MainActivity
import com.example.dhh.koltintest.R

/**
 * Created by DHH on 2018/1/19.
 * 页面：
 */
 class MainItemAdapter(val context: Context, val itemArray: Array<String>) : BaseAdapter() {

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return itemArray.size
    }

    override fun getItem(position: Int): Any {
        return itemArray.get(position)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var holder : ViewHolder
        var cv : View
        if (convertView == null){
            cv = View.inflate(context, R.layout.item_main,null)
            holder = ViewHolder(cv)
            cv.tag = holder
        }else{
            cv = convertView
            holder = cv.tag as ViewHolder
        }

        holder.str.text = itemArray[position]

        return cv
    }

    class ViewHolder(var viewItem : View){
        var str: TextView = viewItem.findViewById(R.id.str)
//        var str : TextView = viewItem.findViewById(R.id.str) as TextView
    }
}