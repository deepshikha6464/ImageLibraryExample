package com.example.imagelibraryexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    //ui component
     ImageView imageView, imageView2, imageView3,imageView4,imageView5, imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
        imageView2 = findViewById(R.id.image2);
        imageView3 = findViewById(R.id.image3);
        imageView4 = findViewById(R.id.image4);
        imageView5 = findViewById(R.id.image5);
        imageView6 = findViewById(R.id.image6);

        //loading image with URL
        Glide.with(this)
                .load("https://www.android.com/static/2016/img/share/andy-lg.png")
                .into(imageView);

        //centre cropped image ... RequestOption()
        RequestOptions requestOptions = new RequestOptions()
                .centerCrop();

        Glide.with(this)
                .setDefaultRequestOptions(requestOptions)
                .load("https://www.android.com/static/2016/img/share/andy-lg.png")
                .into(imageView2);

        //circle cropped image
        RequestOptions requestOptions2 = new RequestOptions()
                .circleCrop();

        Glide.with(this)
                .setDefaultRequestOptions(requestOptions2)
                .load("https://www.android.com/static/2016/img/share/andy-lg.png")
                .into(imageView3);


        //low resolution image
        RequestOptions requestOptions3 = new RequestOptions()
                .override(50, 50);

        Glide.with(this)
                .setDefaultRequestOptions(requestOptions3)
                .load("https://www.android.com/static/2016/img/share/andy-lg.png")
                .into(imageView4);
    }
}
