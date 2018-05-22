package com.tarento.checkin.checkin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CameraRegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_registration)
    }

    fun capturePhoto(view: View) {
        finish()
    }
}
