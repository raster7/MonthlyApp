package com.example.monthlyapp.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.example.monthlyapp.R;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    private Button btn_sign_in;
    private Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_register = findViewById(R.id.btn_register);

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}