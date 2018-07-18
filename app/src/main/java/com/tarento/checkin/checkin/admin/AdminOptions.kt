package com.tarento.checkin.checkin.admin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tarento.checkin.checkin.camera.CheckInActivity
import com.tarento.checkin.checkin.R

class AdminOptions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_options)
    }

    fun organizationOptions(view: View) {
        val intent = Intent(this, OrganizationActivity::class.java)
        startActivity(intent)
    }

    fun shiftOptions(view: View) {
        val intent = Intent(this, ShiftActivity::class.java)
        startActivity(intent)
    }

    fun checkInOptions(view: View) {
        val intent = Intent(this, CheckInActivity::class.java)
        startActivity(intent)
    }
}
