package com.example.menurecommendation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void recipe_page (View view) {
        Intent intent = new Intent(MainActivity.this, recipe.class);
        //intent.putExtra(EXTRA_MESSAGE, );
        startActivity(intent);
    }
}
