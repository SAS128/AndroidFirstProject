package com.example.androidfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView btn_1text = (TextView)findViewById(R.id.btn_1);
        final TextView btn_inp = (TextView) findViewById(R.id.btn_inpit);
        final TextView btn_2text = (TextView) findViewById(R.id.btn_2);
        final TextView btn_3text = (TextView) findViewById(R.id.btn_3);
        final TextView btn_4text = (TextView) findViewById(R.id.btn_4);
        final TextView btn_5text = (TextView) findViewById(R.id.btn_5);
        final TextView btn_6text = (TextView) findViewById(R.id.btn_6);
        final TextView btn_7text = (TextView) findViewById(R.id.btn_7);
        final TextView btn_8text = (TextView) findViewById(R.id.btn_8);
        final TextView btn_9text = (TextView) findViewById(R.id.btn_9);
        final TextView btn_clear = (TextView) findViewById(R.id.btn_c);


        final TextView btn_plus = (TextView) findViewById(R.id.btn_plus);
        final TextView btn_minus = (TextView) findViewById(R.id.btn_minus);
        final TextView btn_umn = (TextView) findViewById(R.id.btn_umn);
        final TextView btn_del = (TextView) findViewById(R.id.btn_del);
        final TextView btn_dele = (TextView) findViewById(R.id.btn_dele);
        btn_inp.setText("0");
        btn_1text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                 btn_inp.setText(  btn_inp.getText().toString() +"1"); //set text for text view
            }


        });
        btn_2text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                btn_inp.setText(btn_inp.getText().toString() +"2");
            }


        });
        btn_3text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                btn_inp.setText(  btn_inp.getText().toString() +"3"); //set text for text view
            }


        });
        btn_4text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                btn_inp.setText(  btn_inp.getText().toString() +"4"); //set text for text view
            }


        });
        btn_5text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                btn_inp.setText(  btn_inp.getText().toString() +"5"); //set text for text view
            }


        });
        btn_6text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                btn_inp.setText(  btn_inp.getText().toString() +"6"); //set text for text view
            }


        });
        btn_7text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                btn_inp.setText(  btn_inp.getText().toString() +"7"); //set text for text view
            }


        });
        btn_8text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                btn_inp.setText(  btn_inp.getText().toString() +"8"); //set text for text view
            }


        });
        btn_9text.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(btn_inp.getText().toString()=="0")
                {
                    btn_inp.setText("");
                }
                btn_inp.setText(  btn_inp.getText().toString() +"9"); //set text for text view
            }


        });
        btn_clear.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                btn_inp.setText("0"); //set text for text view
            }


        });
        btn_plus.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {

                btn_inp.setText(btn_inp.getText().toString() +"+");
            }


        });
        btn_minus.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {

                btn_inp.setText(btn_inp.getText().toString() +"-");
            }


        });
        btn_umn.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {

                btn_inp.setText(btn_inp.getText().toString() +"*");
            }


        });
        btn_del.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {

                btn_inp.setText(btn_inp.getText().toString() +"/");
            }


        });


    }
}