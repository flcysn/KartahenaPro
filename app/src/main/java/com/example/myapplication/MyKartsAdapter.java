package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.myapplication.Karta;
import com.example.myapplication.MyKarts;
import com.example.myapplication.R;

public class MyKartsAdapter extends ArrayAdapter<Karta> {
    public MyKartsAdapter(Context context, Karta[] arr) {
        super(context, R.layout.adapter_item, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Karta kart = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item, null);
        }
        int resId = 0;
        if(kart.getId() == KHelper.bottle) {
            resId = R.drawable.bottle;
        }
        else if(kart.getId() == KHelper.key){
            resId = R.drawable.key;
        }
        else if(kart.getId() == KHelper.saber) {
            resId = R.drawable.saber;
        }
        else if(kart.getId() == KHelper.hat){
            resId = R.drawable.hat;
        }
        else if(kart.getId() == KHelper.gun){
            resId = R.drawable.gun;
        }
        else if(kart.getId() == KHelper.flag){
            resId = R.drawable.flag;
        }
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView);

        img.setImageResource(resId);


        return convertView;
    }
}
