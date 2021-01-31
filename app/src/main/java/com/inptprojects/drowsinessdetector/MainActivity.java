package com.inptprojects.drowsinessdetector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton attentionTB, speedTB, breakTB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences shrd = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        attentionTB = findViewById(R.id.attentionTB);
        speedTB = findViewById(R.id.speedTB);
        breakTB = findViewById(R.id.breakTB);


        Intent intent = new Intent(MainActivity.this, JourneyActivity.class);
        shrd.edit().putBoolean("attention", attentionTB.isChecked()).apply();
        shrd.edit().putBoolean("speed", speedTB.isChecked()).apply();
        shrd.edit().putBoolean("attention", breakTB.isChecked()).apply();
        startActivity(intent);
    }
}