package com.denreyes.colortap.activities;

import android.content.Intent;
import android.os.Bundle;
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

        tvGreen = findViewById(R.id.tv_green);
        tvBlue = findViewById(R.id.tv_blue);
        tvRed = findViewById(R.id.tv_red);

        tvGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ColorActivity.class);
                i.putExtra("color", "green");
                startActivity(i);
            }
        });

        tvBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ColorActivity.class);
                i.putExtra("color", "blue");
                startActivity(i);
            }
        });

        tvRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ColorActivity.class);
                i.putExtra("color", "red");
                startActivity(i);
            }
        });
    }
}
