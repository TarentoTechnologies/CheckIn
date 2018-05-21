package com.tarento.checkin.checkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UnsuccessfulLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsuccessful_login);
    }

    public void callAdmin(View view) {
        Intent intent = new Intent(this, AdminCheckIn.class);
        startActivity(intent);
    }

    public void tryAgain(View view) {
        finish();
    }
}
