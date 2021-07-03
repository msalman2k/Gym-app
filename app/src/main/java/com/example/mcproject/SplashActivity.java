package com.example.mcproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;

public class SplashActivity extends AppCompatActivity {

    Handler handler;
    GifImageView titlelogo;
    ImageView iv_1,iv_2;
    Animation animation_logo,animation_upper,animation_lower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        titlelogo.findViewById(R.id.logo_gif);
        iv_1.findViewById(R.id.upperline);
        iv_2.findViewById(R.id.lowerline);
        animation_upper = AnimationUtils.loadAnimation(this, R.anim.upperline);
        animation_lower = AnimationUtils.loadAnimation(this,R.anim.lowerline);
        animation_logo = AnimationUtils.loadAnimation(this,R.anim.logo);
        titlelogo.setAnimation(animation_logo);
        iv_1.setAnimation(animation_upper);
        iv_2.setAnimation(animation_lower);
        Intent intent=new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();

//        handler=new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent=new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        },3000);

    }
}