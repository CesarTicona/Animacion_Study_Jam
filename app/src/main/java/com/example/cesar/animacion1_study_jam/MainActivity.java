package com.example.cesar.animacion1_study_jam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
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
    }

    public void zoomout(View v) {
    }

    public void fadein() {
    }

    public void fadeout() {
    }

    public void rotate() {
    }

    public void move() {
    }

    public void slideup() {
    }

    public void slidedown() {
    }

    public void blink() {
    }

    public void bounce() {
    }

    public void crossfade() {
    }

    public void sequential() {
    }

}
