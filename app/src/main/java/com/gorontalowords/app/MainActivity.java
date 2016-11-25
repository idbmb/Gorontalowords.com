package com.gorontalowords.app;

/**
 * Created by IDBMB on 11/23/2016.
 */

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Use remote resource
        mWebView.loadUrl("http://gorontalowords.com");

        // Stop local links and redirects from opening in browser instead of WebView
        mWebView.setWebViewClient(new MyAppWebViewClient());
        //Mendefinisikan MediaPlayer sebagai audioBackground
        MediaPlayer audioBackground;
        //Memanggil file sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.previewpuresweetness);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start();

        // Use local resource
        // mWebView.loadUrl("file:///android_asset/www/index.html");


    }

    // Prevent the back-button from closing the app
    @Override
    public void onBackPressed() {
        if(mWebView.canGoBack()) {
            mWebView.goBack();
        } else {

            new AlertDialog.Builder(this)

                    .setMessage("Keluar dari permainan ini ?")
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO Auto-generated method stub
                            System.exit(1);
                        }
                    })
                    .setNegativeButton("Tidak", null)
                    .show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}