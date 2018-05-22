package com.tarento.checkin.checkin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CameraLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_login)
    }

    fun capturePhoto(view: View) {
        val intent = Intent(this, SuccessfulLoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun failVerification(view: View) {
        val intent = Intent(this, UnsuccessfulLoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
