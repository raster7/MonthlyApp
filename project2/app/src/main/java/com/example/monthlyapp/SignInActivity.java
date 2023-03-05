package com.example.monthlyapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.monthlyapp.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // ActivitySignInBinding view = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_sign_in);
        EditText email = findViewById(R.id.edit_text_email);
        Button btn_sign_in = findViewById(R.id.btn_sign_in1);
        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(email.getText().toString().isEmpty())) {
                    MainActivity.flag = false;
                    Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                    intent.putExtra("email", email.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(SignInActivity.this, "Поля не могут быть пустыми", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}