package com.denreyes.colortap.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.denreyes.colortap.R;

public class MainActivity extends AppCompatActivity {
    private TextView tvGreen, tvBlue, tvRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("");
        tvGreen = findViewById(R.id.tv_green);
        tvBlue = findViewById(R.id.tv_blue);
        tvRed = findViewById(R.id.tv_red);

        tvGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("color", ContextCompat.getColor(MainActivity.this, R.color.green));
                startActivity(i);
            }
        });

        tvBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("color", ContextCompat.getColor(MainActivity.this, R.color.blue));
                startActivity(i);
            }
        });

        tvRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("color", ContextCompat.getColor(MainActivity.this, R.color.red));
                startActivity(i);
            }
        });
    }
}
