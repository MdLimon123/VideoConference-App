package com.example.livetvnet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.DoubleBounce;

public class Splash_Screen extends AppCompatActivity {

    ImageView imageView;
    ProgressBar progressBar;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        imageView = findViewById(R.id.imageView);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        imageView.startAnimation(animation);

        progressBar = (ProgressBar)findViewById(R.id.progress);
        Sprite doubleBounce = new Circle();
        progressBar.setIndeterminateDrawable(doubleBounce);


        int SPLASH_DISPLAY_LENGTH = 5000;

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */

                Intent intent = new Intent(Splash_Screen.this,MainActivity.class);
                startActivity(intent);

            }
        }, SPLASH_DISPLAY_LENGTH);



    }
}