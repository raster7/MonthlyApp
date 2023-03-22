package com.example.monthlyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragmentContainerView, FirstFragment.class, null)
                    .commit();
        }
    }
}