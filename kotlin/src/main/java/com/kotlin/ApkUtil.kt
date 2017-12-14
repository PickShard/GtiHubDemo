package com.kotlin

import android.app.Application
import android.content.Context
import android.content.pm.ActivityInfo
import android.content.pm.ApplicationInfo

/**
 * Created by sc on 2017/9/7.
 */
object ApkUtil {

    fun isApkInDebug(context: Context) : Boolean  {

        return try {

            var info :ApplicationInfo =  context.applicationInfo
            (info.flags and ApplicationInfo.FLAG_DEBUGGABLE) != 0
        } catch (e :Exception) {
            false
        }
    }
}