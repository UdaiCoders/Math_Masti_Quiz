package com.erinfa.mathmasti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class Splash extends Activity {

TextView createdBy;
Animation animatiopnRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        createdBy=findViewById(R.id.createdBy);
        animatiopnRight= AnimationUtils.loadAnimation(this,R.anim.slide);
        animatiopnRight.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                createdBy.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                Intent it  = new Intent(Splash.this, MainActivity.class);
//                startActivity(it);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        createdBy.startAnimation(animatiopnRight);


           new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();


            }
        }, 5000);


    }
}
