package com.tarento.checkin.checkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }

    public void capturePhoto(View view) {
        Intent intent = new Intent(this, SuccessfulLoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void failVerification(View view) {
        Intent intent =new Intent(this, UnsuccessfulLoginActivity.class);
        startActivity(intent);
        finish();
    }
}
