package com.example.kit;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NewsDetail extends AppCompatActivity {

    TextView TextView_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_detail);

        TextView_detail = findViewById(R.id.TextView_detail);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String content = bundle.getString("content");

        TextView_detail.setText(content);
    }
}