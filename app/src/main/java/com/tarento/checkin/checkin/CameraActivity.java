package com.tarento.checkin.checkin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions;

public class CameraActivity extends AppCompatActivity {

    private FirebaseVisionFaceDetectorOptions.Builder options;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CameraFragment.newInstance())
                    .commit();
        }
        // todo show graphic overlay
         options = new FirebaseVisionFaceDetectorOptions.Builder()
                 .setModeType(FirebaseVisionFaceDetectorOptions.FAST_MODE)
                 .setLandmarkType(FirebaseVisionFaceDetectorOptions.ALL_LANDMARKS)
                 .setClassificationType(FirebaseVisionFaceDetectorOptions.NO_CLASSIFICATIONS)
                 .setMinFaceSize(0.15f)
                 .setTrackingEnabled(true);
    }
}

