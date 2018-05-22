package com.tarento.checkin.checkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void register(View view) {
        Intent intent = new Intent(this, SuccessfulRegistrationActivity.class);
        startActivity(intent);
        finish();
    }
}
