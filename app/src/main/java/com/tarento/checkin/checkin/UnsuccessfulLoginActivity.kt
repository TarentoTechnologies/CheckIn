package com.tarento.checkin.checkin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UnsuccessfulLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unsuccessful_login)
    }

    fun callAdmin(view: View) {
        val intent = Intent(this, AdminCheckIn::class.java)
        startActivity(intent)
        finish()
    }

    fun tryAgain(view: View) {
        finish()
    }
}
