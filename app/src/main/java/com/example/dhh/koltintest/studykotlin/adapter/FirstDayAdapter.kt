package com.example.dhh.koltintest.studykotlin.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.BaseExpandableListAdapter
import android.widget.ListAdapter
import android.widget.TextView
import com.example.dhh.koltintest.R
import com.example.dhh.koltintest.studykotlin.KotlinFirstDay

/**
 * Created by DHH on 2018/1/22.
 * 页面：
 */
class FirstDayAdapter(var context: Context, var itemArray: Array<String>) : BaseAdapter() {

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