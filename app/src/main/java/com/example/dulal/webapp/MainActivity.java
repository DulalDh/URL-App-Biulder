package com.example.dulal.webapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView myWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();*/

        myWebview = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //insert hare required website link
        myWebview.loadUrl("https://mail.yahoo.com/d/folders/1");

        //for show webpage without browser
        myWebview.setWebViewClient(new WebViewClient());
    }

    //For back functionality in webpage
    @Override
    public void onBackPressed() {

        if(myWebview.canGoBack())
            myWebview.goBack();
        else
            super.onBackPressed();
    }
}
