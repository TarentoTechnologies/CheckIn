package com.tarento.checkin.checkin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun checkIn(view: View) {
        val intent = Intent(this, CameraLoginActivity::class.java)
        startActivity(intent)
    }

    fun signUp(view: View) {
        val intent = Intent(this, RegistrationActivity::class.java)
        startActivity(intent)
    }

    fun adminOptions(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
