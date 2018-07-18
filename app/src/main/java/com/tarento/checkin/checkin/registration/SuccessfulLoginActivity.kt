package com.tarento.checkin.checkin.registration

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tarento.checkin.checkin.R
import com.tarento.checkin.checkin.camera.CameraLoginActivity

class SuccessfulLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_successful_login)
    }

    fun checkIn(view: View) {
        val intent = Intent(this, CameraLoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
