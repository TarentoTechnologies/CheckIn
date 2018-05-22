package com.tarento.checkin.checkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessfulRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_registration);
    }

    public void register(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
        finish();
    }
}
