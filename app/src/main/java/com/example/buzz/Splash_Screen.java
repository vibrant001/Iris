package com.example.buzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {

    private static final long SPLASH_SCREEN_TIME_OUT =2000 ;
    TextView logo;
    TextView name,own1,own2;
    Animation topanim,bottomanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        logo=findViewById(R.id.textView);
        name=findViewById(R.id.textView2);
        own1=findViewById(R.id.textView3);
        own2=findViewById(R.id.textView4);

        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        logo.setAnimation(topanim);
        name.setAnimation(bottomanim);
        own1.setAnimation(bottomanim);
        own2.setAnimation(bottomanim);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, login.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);

    }
}