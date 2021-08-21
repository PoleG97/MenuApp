package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabInfo, fabComida, fabRestaurante, fabCongelados;
    Animation fabOpen, fabClose, fabRotateForward, fabRotateBackward;

    boolean isOpen = false; //Por defecto

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabInfo = (FloatingActionButton) findViewById(R.id.fab1);
        fabComida = (FloatingActionButton) findViewById(R.id.fabComida);
        fabRestaurante = (FloatingActionButton) findViewById(R.id.fabRestaurante);
        fabCongelados = (FloatingActionButton) findViewById(R.id.fabCongelados);

        // Animaciones
        fabOpen = AnimationUtils.loadAnimation(this, R.anim.fab_open);
        fabClose = AnimationUtils.loadAnimation(this, R.anim.fab_close);
        fabRotateBackward = AnimationUtils.loadAnimation(this, R.anim.fab_rotate_backward);
        fabRotateForward = AnimationUtils.loadAnimation(this, R.anim.fab_rotate_forward);

        // Listener principal
        fabInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
            }
        });
        fabCongelados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
                Toast.makeText(MainActivity.this, "Abrimos congelados", Toast.LENGTH_LONG).show();
            }
        });
        fabRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
                Toast.makeText(MainActivity.this, "Abrimos restaurante", Toast.LENGTH_LONG).show();
            }
        });
        fabComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
                Toast.makeText(MainActivity.this, "Abrimos comida", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void animateFab(){
        if(isOpen){
            fabInfo.startAnimation(fabRotateForward);
            fabComida.startAnimation(fabClose);
            fabCongelados.startAnimation(fabClose);
            fabRestaurante.startAnimation(fabClose);
            fabComida.setClickable(false);
            fabCongelados.setClickable(false);
            fabRestaurante.setClickable(false);
            isOpen = false;
        }
        else{
            fabInfo.startAnimation(fabRotateBackward);
            fabComida.startAnimation(fabOpen);
            fabCongelados.startAnimation(fabOpen);
            fabRestaurante.startAnimation(fabOpen);
            fabComida.setClickable(true);
            fabCongelados.setClickable(true);
            fabRestaurante.setClickable(true);
            isOpen = true;
        }
    }
}