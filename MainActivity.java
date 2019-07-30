package com.example.agecounterapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;

//_________ Splach __________________________
public class MainActivity extends AppCompatActivity {
    private static int SPLACH_TIME_OUT=4000; // 3 sec

    @Override protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent homeInten = new Intent (MainActivity.this, HomeActivity.class);
            startActivity(homeInten);
            finish();   }//run
        },SPLACH_TIME_OUT);//new

    }//onCreate


}//Class
