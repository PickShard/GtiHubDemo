package com.kotlin

import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.databinding.ActivityLoadImgctivityBinding

class LoadImgctivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val contentView = DataBindingUtil.setContentView<ActivityLoadImgctivityBinding>(this, R.layout.activity_load_imgctivity)

        var imgList = ArrayList<ImgData>()

        imgList.add(ImgData(ObservableField(R.drawable.find), ObservableField("图片1")))
        imgList.add(ImgData(ObservableField(R.drawable.find),ObservableField("图片1")))

        contentView.adapter = DataBindingBaseAdapter(this,imgList)
    }
}
