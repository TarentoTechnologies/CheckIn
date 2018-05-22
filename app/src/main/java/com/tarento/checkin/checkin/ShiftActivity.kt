package com.tarento.checkin.checkin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ShiftActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shift)
    }

    fun createShift(view: View) {
        val intent = Intent(this, CreateShiftActivity::class.java)
        startActivity(intent)
    }

    fun editShift(view: View) {
        val intent = Intent(this, EditShiftActivity::class.java)
        startActivity(intent)
    }
}
