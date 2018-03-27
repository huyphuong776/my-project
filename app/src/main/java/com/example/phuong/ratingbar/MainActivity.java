package com.example.phuong.ratingbar;

import android.annotation.SuppressLint;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    RatingBar ratingBar2;
    RatingBar ratingBar3;

    Button chapNhan;

    ViewPager viewPager;

    TextView textViewTB;
    TextView nhaXe;

    ImageView imgHinh;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        viewPager = (ViewPager) findViewById(R.id.viewPager) ;
//        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(this);
//        viewPager.setAdapter(viewPagerAdapter);

        ratingBar= (RatingBar) findViewById(R.id.ratingBarPhucvu);
        ratingBar2= (RatingBar) findViewById(R.id.ratingBarDungGio);
        ratingBar3= (RatingBar) findViewById(R.id.ratingBarChatLuong);

        textViewTB= (TextView) findViewById(R.id.trungBinh);
        nhaXe= (TextView) findViewById(R.id.tennhaxe);

        chapNhan= (Button) findViewById(R.id.ChapNhan);

        imgHinh = (ImageView) findViewById(R.id.imageViewHinh);

//        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
//                //Toast.makeText(MainActivity.this, "Stars " + (int)v , Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//        ratingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
//                //Toast.makeText(MainActivity.this, "Stars " + (int)v , Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//        ratingBar3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
//                //Toast.makeText(MainActivity.this, "Stars " + (int)v , Toast.LENGTH_SHORT).show();
//            }
//        });

        nhaXe.setText("Xe Hiếu Hòa");


            //Log.d("HUYPHUONG", "" + dem);
        imgHinh.setImageResource(R.drawable.h3);





        chapNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // noiDung="Chấp Nhận";
                //Toast.makeText(MainActivity.this, noiDung, Toast.LENGTH_LONG).show();
                int dem = (int) (ratingBar.getRating()+ratingBar2.getRating()+ratingBar3.getRating())/3;
                textViewTB.setText(dem + "/5");
                //Toast.makeText(MainActivity.this, "Stars: " + (float)ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });







    }
}
