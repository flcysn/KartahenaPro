package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Surface;
import android.view.SurfaceView;

public class Karta {
    private int id;


    public Karta(int id) {
        this.id = id;

    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
