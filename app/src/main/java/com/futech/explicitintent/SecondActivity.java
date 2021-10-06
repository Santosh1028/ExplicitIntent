package com.futech.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvLearn, tvFutech;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvLearn=findViewById(R.id.learn);
        tvFutech=findViewById(R.id.futech);

       Intent intent=getIntent();
       data=intent.getStringExtra("data");

       tvLearn.setText("Best Android Tutotials by: "+data);
       tvFutech.setText("Learn With: "+data);

    }
}