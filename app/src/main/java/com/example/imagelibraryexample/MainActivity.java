package com.example.imagelibraryexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    //ui component
     ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
        //loading image with URL
        Glide.with(this)
                .load("https://www.android.com/static/2016/img/share/andy-lg.png")
                .into(imageView);
    }
}
