package com.example.androidfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView)findViewById(R.id.textView52);
        textView.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                //TextView.generateViewId(Integer.parseInt("fefe"));
            }


        });
    }
}