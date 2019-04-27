package com.example.menurecommendation;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class recipeDetail extends AppCompatActivity {
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
        textView = (TextView) findViewById(R.id.tv);
        String data = getIntent().getStringExtra("name");
        textView.setText(data);
    }
}
