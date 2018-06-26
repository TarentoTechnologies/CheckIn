package com.tarento.checkin.checkin.photo;

import android.util.SparseArray;
import android.widget.ImageView;

import com.google.android.gms.vision.face.Face;


public interface CropAlignFaceInterface {

    public Double getDistance(SparseArray<Face> mFaces);

    public ImageView scaleRotateTranslate();

    public ImageView cropFace();

}
