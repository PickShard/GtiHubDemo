package com.kotlin

import android.content.Intent
import android.media.MediaRecorder
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.media.MediaRecorder.OutputFormat.THREE_GPP
import android.media.MediaRecorder.AudioSource.MIC



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.load_img -> {
                var intent = Intent(this@MainActivity, LoadImgctivity::class.java)
                startActivity(intent)
                var mRecorder = MediaRecorder()
                mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC)
                mRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
                mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)

            }
        }
    }

}
