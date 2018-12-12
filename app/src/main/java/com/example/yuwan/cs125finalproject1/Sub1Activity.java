package com.example.yuwan.cs125finalproject1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Sub1Activity extends AppCompatActivity {
    public WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1);
        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
//        String url = "https://www.google.com/search?q="+message;
        // Create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(message));;
// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
// Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");
// Attempt to start an activity that can handle the Intent
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
//        webView = (WebView) findViewById(R.id.webview2);
//        webView.setWebViewClient(new WebViewClient());
//        webView.loadUrl(url);
    }
}
