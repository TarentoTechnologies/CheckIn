package com.tarento.checkin.checkin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AdminCheckIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_check_in)
    }

    fun capturePhoto(view: View) {
        val intent = Intent(this, CameraRegistrationActivity::class.java)
        startActivity(intent)
    }

    fun manualCheckIn(view: View) {
        val intent = Intent(this, SuccessfulLoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
