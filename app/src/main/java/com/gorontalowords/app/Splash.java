package com.gorontalowords.app;

/**
 * Created by IDBMB on 11/23/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.layout);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash.this,MainActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

        //Mendefinisikan MediaPlayer sebagai audioBackground
        MediaPlayer audioBackground;
        //Memanggil file sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.opening);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(false);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start();

    }
}