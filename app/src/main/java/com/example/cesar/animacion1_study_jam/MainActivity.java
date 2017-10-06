package com.example.cesar.animacion1_study_jam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagen1;
    private ImageView imagen2;

    private Animation animacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen1 = (ImageView) findViewById(R.id.idImagen1);
        imagen2 = (ImageView) findViewById(R.id.idImagen2);
    }


    public void zoomin(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        imagen1.startAnimation(animacion);
    }

    public void zoomout(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        imagen1.startAnimation(animacion);
    }

    public void fadein(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        imagen1.startAnimation(animacion);
    }

    public void fadeout(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        imagen1.startAnimation(animacion);
    }

    public void rotate(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imagen1.startAnimation(animacion);
    }

    public void move(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        imagen1.startAnimation(animacion);
    }

    public void slideup(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        imagen1.startAnimation(animacion);
    }

    public void slidedown(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        imagen1.startAnimation(animacion);
    }

    public void blink(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        imagen1.startAnimation(animacion);
    }
    public void bounce(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        imagen1.startAnimation(animacion);
    }

    public void crossfade(View v) {
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        imagen1.startAnimation(animacion);
        Animation animacion2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        imagen1.startAnimation(animacion2);
        imagen2.startAnimation(animacion);
    }

    public void stop(View v) {
        imagen1.clearAnimation();
        imagen2.clearAnimation();
    }

}
