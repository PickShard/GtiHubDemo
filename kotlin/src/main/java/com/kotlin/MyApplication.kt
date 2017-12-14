package com.kotlin

import android.app.Application
import com.orhanobut.logger.LogLevel
import com.orhanobut.logger.Logger


/**
 * Created by sc on 2017/9/7.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Logger.init(if(ApkUtil.isApkInDebug(this)) LogLevel.FULL else LogLevel.NONE,"=====")
    }
}