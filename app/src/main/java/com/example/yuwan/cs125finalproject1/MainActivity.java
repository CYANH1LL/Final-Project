package com.example.yuwan.cs125finalproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "Final_Project";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button openTheObject = findViewById(R.id.button_1);
//        openTheObject.setOnClickListener(this);
    }
    public void onClick(View v) {
        EditText edittext = findViewById(R.id.editText);
        String message = edittext.getText().toString();
        Intent intent = new Intent(this, Sub1Activity.class);
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }
//    @Override
//    public void onClick(View v) {
//        // do something when the button is clicked
//        // Yes we will handle click here but which button clicked??? We don't know
//
//        // So we will make
//        switch (v.getId() /*to get clicked view id**/) {
//            case R.id.button_1:
//                Log.d(TAG, "Button 1 clicked");
//                System.out.println("Button 1 is clicked");
//                // do something when the button1 is clicked
//
//                break;
//            case R.id.:
//
//                // do something when the button2 is clicked
//
//                break;
//            case R.id.:
//
//                // do something when the button3 is clicked
//
//                break;
//            default:
//                break;
//        }
//    }

}
