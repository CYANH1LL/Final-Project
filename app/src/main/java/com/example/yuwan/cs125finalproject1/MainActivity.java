package com.example.yuwan.cs125finalproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "Final_Project";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        // do something when the button is clicked
        // we will handle click here but which button clicked??? We don't know
        // So we will make
        switch (v.getId()) {
            case R.id.button_1:
                Log.d(TAG, "search button clicked");
                EditText edittext = findViewById(R.id.editText);
                String message = edittext.getText().toString();
                Intent intent = new Intent(this, Sub1Activity.class);
                intent.putExtra("EXTRA_MESSAGE", message);
                startActivity(intent);
                // do something when the button1 is clicked
                break;
            case R.id.imageButton7:
                Log.d(TAG, "jsm button clicked");
                String web7 = "https://apartments.jsmliving.com/";
                Intent webintent7 = new Intent(this, Web.class);
                webintent7.putExtra("WEB", web7);
                startActivity(webintent7);
                break;
            case R.id.imageButton2:
                Log.d(TAG, "roland button clicked");
                String web2 = "http://www.roland-realty.com/";
                Intent webintent2 = new Intent(this, Web.class);
                webintent2.putExtra("WEB", web2);
                startActivity(webintent2);
                break;
            case R.id.imageButton3:
                Log.d(TAG, "m&m button clicked");
                String web3 = "https://www.mhmproperties.com/";
                Intent webintent3 = new Intent(this, Web.class);
                webintent3.putExtra("WEB", web3);
                startActivity(webintent3);
                break;
            case R.id.imageButton4:
                Log.d(TAG, "CPM button clicked");
                String web4 = "https://cpm-apts.com/";
                Intent webintent4 = new Intent(this, Web.class);
                webintent4.putExtra("WEB", web4);
                startActivity(webintent4);
                break;
            case R.id.imageButton5:
                Log.d(TAG, "UG button clicked");
                String web5 = "https://ugroupcu.com/";
                Intent webintent5 = new Intent(this, Web.class);
                webintent5.putExtra("WEB", web5);
                startActivity(webintent5);
                break;
            case R.id.imageButton6:
                Log.d(TAG, "GSR button clicked");
                String web6 = "https://www.greenstrealty.com/home";
                Intent webintent6 = new Intent(this, Web.class);
                webintent6.putExtra("WEB", web6);
                startActivity(webintent6);
                break;
            default:
                break;
        }
    }
}
