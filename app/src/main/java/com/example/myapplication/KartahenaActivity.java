package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsoluteLayout;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class KartahenaActivity extends AppCompatActivity {
    ListView lv;
    ImageView rp;
    int position = 0;
    Karta[] karts = new Karta[]{
            new Karta(KHelper.saber),
            new Karta(KHelper.flag),
            new Karta(KHelper.key),
            new Karta(KHelper.gun),
            new Karta(KHelper.bottle),
            new Karta(KHelper.hat)
    };
    Iacheika[] iacheikas = new Iacheika[]{
            new Iacheika(KHelper.bottle, 0, 1, 130, 630),
            new Iacheika(KHelper.flag, 1, 1, 195, 630),
            new Iacheika(KHelper.hat, 1, 0, 195, 690),
            new Iacheika(KHelper.saber, 2, 0, 265, 690),
            new Iacheika(KHelper.key, 2, 1, 265, 630),
            new Iacheika(KHelper.gun, 2, 2, 265, 563),

            new Iacheika(KHelper.key, 2, 3, 265, 495),
            new Iacheika(KHelper.saber, 1, 3, 195, 495),
            new Iacheika(KHelper.flag, 1, 2, 195, 563),
            new Iacheika(KHelper.hat, 0, 2, 130, 563),
            new Iacheika(KHelper.gun, 0, 3, 130, 495),
            new Iacheika(KHelper.bottle, 0, 4, 130, 420),

            new Iacheika(KHelper.bottle, 0, 5, 130, 360),
            new Iacheika(KHelper.flag, 1, 5, 195, 360),
            new Iacheika(KHelper.hat, 1, 4, 195, 420),
            new Iacheika(KHelper.saber, 2, 4, 265, 420),
            new Iacheika(KHelper.key, 2, 5, 265, 360),
            new Iacheika(KHelper.gun, 2, 6, 265, 290),

            new Iacheika(KHelper.key, 2, 7, 265, 221),
            new Iacheika(KHelper.saber, 1, 7, 198, 221),
            new Iacheika(KHelper.flag, 1, 6, 196, 290),
            new Iacheika(KHelper.hat, 0, 6, 130, 290),
            new Iacheika(KHelper.gun, 0, 7, 130, 221),
            new Iacheika(KHelper.bottle, 0, 8, 130, 150)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kartahena);
        rp = findViewById(R.id.player);
        lv = findViewById(R.id.lv);
        MyKartsAdapter adapter = new MyKartsAdapter(this, karts);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Karta kart = karts[i];

                for (int j = position; j < iacheikas.length; j++) {
                    Iacheika iacheika = iacheikas[j];
                    if(iacheika.getV()== kart.getId()){
                        position = j;
                        Resources r = getResources();

                        float px = TypedValue.applyDimension(
                                TypedValue.COMPLEX_UNIT_DIP,
                                iacheika.getX(),
                                r.getDisplayMetrics()
                        );

                        float py = TypedValue.applyDimension(
                                TypedValue.COMPLEX_UNIT_DIP,
                                iacheika.getY(),
                                r.getDisplayMetrics()
                        );

                        rp.setX(px);
                        rp.setY(py);
                        position++;
                        break;
                    }
                }


            }
        });
    }
}