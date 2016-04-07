package com.example.zubairbhatti.bookmyumrah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Splash extends AppCompatActivity {

    Intent intent;
//    MediaPlayer ourSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        ourSong = MediaPlayer.create(this, R.raw.whistle);
//        ourSong.start();

        Thread th = new Thread() {

            public void run() {

                try {
                    sleep(2000);

                } catch (Exception ex) {

                } finally {
                    intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                }

            }

        };

        th.start();

    }


    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
  //      ourSong.release();
        finish();

    }
}









