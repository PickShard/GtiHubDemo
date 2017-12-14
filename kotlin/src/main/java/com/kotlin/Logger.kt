package com.kotlin

import com.orhanobut.logger.Logger
import org.json.JSONObject


/**
 * Created by sc on 2017/9/7.
 */


fun Any.logD(info: String) {
    Logger.d(info)
}

fun Any.logV(info: String) {
    Logger.v(info)
}

fun Any.logW(info: String) {
    Logger.w(info)
}

fun Any.logE(info: String) {
    Logger.e(info)
}

fun Any.logI(info: String) {
    Logger.i(info)
}

fun Any.logJson(info: String) {
    Logger.json(info)
}

