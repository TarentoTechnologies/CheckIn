package com.tarento.checkin.checkin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OrganizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organization)
    }

    fun createOrganization(view: View) {
        val intent = Intent(this, CreateOrganizationActivity::class.java)
        startActivity(intent)
    }

    fun editOrganization(view: View) {
        val intent = Intent(this, EditOrganizationActivity::class.java)
        startActivity(intent)
    }
}
