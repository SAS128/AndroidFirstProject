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
        final TextView btn_1text = (TextView)findViewById(R.id.btn_1);
        final TextView btn_inp = (TextView) findViewById(R.id.btn_inpit);
        final TextView btn_2text = (TextView) findViewById(R.id.btn_2);
        btn_1text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {

                 btn_inp.setText(  btn_inp.getText().toString() +"1"); //set text for text view
            }


        });
        btn_2text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                btn_inp.setText("2"); //set text for text view
            }


        });
    }
}