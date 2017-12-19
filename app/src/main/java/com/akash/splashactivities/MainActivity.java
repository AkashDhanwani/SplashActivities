package com.akash.splashactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivWatch;
    Button btnRotate,btnTranslate,btnAlpha,btnScale,btnCustom;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivWatch = (ImageView) findViewById(R.id.ivWatch);
        btnAlpha = (Button) findViewById(R.id.btnAlpha);
        btnRotate = (Button) findViewById(R.id.btnRotate);
        btnTranslate = (Button) findViewById(R.id.btnTranslate);
        btnScale = (Button) findViewById(R.id.btnScale);
        btnCustom = (Button) findViewById(R.id.btnCustom);

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                ivWatch.startAnimation(animation);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                ivWatch.startAnimation(animation);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                ivWatch.startAnimation(animation);
            }
        });

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                ivWatch.startAnimation(animation);
            }
        });

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.custom);
                ivWatch.startAnimation(animation);
            }
        });
    }
}
