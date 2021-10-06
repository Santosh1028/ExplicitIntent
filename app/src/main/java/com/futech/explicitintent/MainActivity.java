package com.futech.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvFutech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFutech=findViewById(R.id.tvFutech);

        tvFutech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data=tvFutech.getText().toString();
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("data",data);
                startActivity(intent);
            }
        });
    }
}