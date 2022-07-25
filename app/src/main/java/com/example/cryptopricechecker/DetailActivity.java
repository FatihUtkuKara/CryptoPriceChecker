package com.example.cryptopricechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    private String coinName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if(getIntent().hasExtra("coinName")) {
            coinName = getIntent().getStringExtra("coinName");
        }
    }
}