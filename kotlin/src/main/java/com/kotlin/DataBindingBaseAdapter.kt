package com.kotlin

import android.content.Context
import android.databinding.DataBindingUtil
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.kotlin.databinding.ItemGridImgBinding

/**
 * Created by sc on 2017/9/7.
 */
class DataBindingBaseAdapter(private var context: Context, var data :List<Any>): BaseAdapter(){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        
        var binding: ItemGridImgBinding = if (convertView == null) 

            DataBindingUtil.bind(View.inflate(context, R.layout.item_grid_img, null))
         else 
            DataBindingUtil.bind(convertView)

        binding.setImg(getItem(position) as ImgData)
        binding.img.setImageResource((getItem(position) as ImgData).url.get())

        return binding.root
    }

    override fun getItem(position: Int): Any {
        return data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position as Long
    }

    override fun getCount(): Int {
        return data.size
    }


}