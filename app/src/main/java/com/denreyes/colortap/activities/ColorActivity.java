package com.denreyes.colortap.activities;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.denreyes.colortap.R;

public class ColorActivity extends AppCompatActivity {
    private ImageView ivGreen, ivRed, ivBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        ivGreen = findViewById(R.id.iv_green);
        ivBlue = findViewById(R.id.iv_blue);
        ivRed = findViewById(R.id.iv_red);

        String color = getIntent().getStringExtra("color");
        switch (color) {
            case "green":
                ivGreen.setVisibility(View.VISIBLE);
                ivBlue.setVisibility(View.GONE);
                ivRed.setVisibility(View.GONE);
                break;
            case "blue":
                ivGreen.setVisibility(View.GONE);
                ivBlue.setVisibility(View.VISIBLE);
                ivRed.setVisibility(View.GONE);
                break;
            case "red":
                ivGreen.setVisibility(View.GONE);
                ivBlue.setVisibility(View.GONE);
                ivRed.setVisibility(View.VISIBLE);
                break;
        }
    }
}
