package com.example.frenchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackBth, greenBtn, purpleBtn, redBtn, yellowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBth = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        redBtn.setOnClickListener(this);
        blackBth.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int clickBtnId = v.getId();
        if (clickBtnId == R.id.redBtn) {
            playSounds(R.raw.red);
        } else if (clickBtnId == R.id.blackBtn) {
            playSounds(R.raw.black);
        } else if (clickBtnId == R.id.greenBtn) {
            playSounds(R.raw.green);
        } else if (clickBtnId == R.id.purpleBtn) {
            playSounds(R.raw.purple);
        }else if (clickBtnId == R.id.yellowBtn){
            playSounds(R.raw.yellow);
        }

    }

    public void playSounds(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}