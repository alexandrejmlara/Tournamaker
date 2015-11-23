package com.example.alexandrelara.tournamaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.alexandrelara.tournamaker.R.layout.activity_main);
        this.webview = (WebView) findViewById(com.example.alexandrelara.tournamaker.R.id.imageBackgroundWebView);
        this.webview.loadUrl("file:///android_res/raw/main_background.html");
    }

    public void startHere(View v){

        //Open the stats page
        Intent intent = new Intent(this, SelectTypeActivity.class);
        startActivity(intent);
    }

}
