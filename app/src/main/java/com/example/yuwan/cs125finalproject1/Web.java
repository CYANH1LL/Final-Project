package com.example.yuwan.cs125finalproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
    public WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Intent intent = getIntent();
        String message = intent.getStringExtra("WEB");
        webView = (WebView) findViewById(R.id.webview1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(message);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        }
        super.onBackPressed();
    }
}
