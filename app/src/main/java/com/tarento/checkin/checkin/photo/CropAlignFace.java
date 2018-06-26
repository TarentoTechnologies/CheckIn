package com.tarento.checkin.checkin.photo;

import android.icu.text.DisplayContext;
import android.icu.text.LocaleDisplayNames;
import android.os.Build;
import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.util.SparseArray;
import android.widget.ImageView;

import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;


public class CropAlignFace implements CropAlignFaceInterface {

    private SparseArray<Face> mFaces;

    public Double getDistance(Face face) {

        return null;
    }

    @Override
    public Double getDistance(SparseArray<Face> mFaces) {
//        double scale = Math.min(viewWidth / imageWidth, viewHeight / imageHeight);

        for (int i = 0; i < mFaces.size(); ++i) {
            Face face = mFaces.valueAt(i);
            for (Landmark landmark : face.getLandmarks()) {
                int cx = (int) (landmark.getPosition().x * 2.0);
                int cy = (int) (landmark.getPosition().y * 2.0);
            }
        }
        return null;
    }

    @Override
    public ImageView scaleRotateTranslate() {
        return null;
    }

    @Override
    public ImageView cropFace() {
        return null;
    }
}
