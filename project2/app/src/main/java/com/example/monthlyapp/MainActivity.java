package com.example.monthlyapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.monthlyapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "monthlyLogs";
    public static Boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding view = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(view.getRoot());
        if (flag) {
            Intent intent = new Intent(this, StartActivity.class);
            startActivity(intent);
            finish();
        }
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String hiEmail = "Привет, " + email;
        view.textHellowName.setText(hiEmail);
        view.btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });

        view.calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"Clicked on button 'Календарь'");
            }
        });
    }

    public void onClickGraph(View view) {
        Log.i(TAG,"Clicked on button 'График'");
    }
}