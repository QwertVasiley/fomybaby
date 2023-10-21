package com.example.formybaby;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer sound;  //создал переменную для музыки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void OnClick(View view) {
        setContentView(R.layout.myscreen);
        sound = MediaPlayer.create(this, R.raw.music); //путь к медиафайлу
        sound.start(); //запуск самого медиафайла
    }
}