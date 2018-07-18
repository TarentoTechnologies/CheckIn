package com.tarento.checkin.checkin.camera

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tarento.checkin.checkin.R

class CameraRegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_registration)
    }

    fun capturePhoto(view: View) {
        finish()
    }
}
