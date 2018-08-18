package com.denreyes.colortap.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.denreyes.colortap.R;

public class ColorActivity extends AppCompatActivity {
    private ImageView ivColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        ivColor = findViewById(R.id.iv_color);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ivColor.setColorFilter(getIntent().getIntExtra("color", -1));
    }
}
