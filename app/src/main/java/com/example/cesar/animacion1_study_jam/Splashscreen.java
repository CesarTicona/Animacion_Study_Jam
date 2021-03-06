package com.example.cesar.animacion1_study_jam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splashscreen extends AppCompatActivity {


    private ImageView logo;
    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashscreen);

        logo = (ImageView)findViewById(R.id.idlogo);

        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashscreen);

        logo.startAnimation(animacion);
        animacion.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



    }


}
