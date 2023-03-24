package com.example.monthlyapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.monthlyapp.Fragment.FirstFragment;
import com.example.monthlyapp.R;

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
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MainActivity.setStatusOpenMainActivity(true);
    }
}