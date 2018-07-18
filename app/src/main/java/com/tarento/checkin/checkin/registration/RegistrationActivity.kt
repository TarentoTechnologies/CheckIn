package com.tarento.checkin.checkin.registration

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tarento.checkin.checkin.R
import com.tarento.checkin.checkin.camera.CameraActivity

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    fun register(view: View) {
        val intent = Intent(this, SuccessfulRegistrationActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun capturePhoto(view: View) {
        val intent = Intent(this, CameraActivity::class.java)
        startActivity(intent)
    }
}
