package com.example.monthlyapp;

import android.content.Intent;
import android.os.Bundle;

import com.example.monthlyapp.databinding.ActivityMainBinding;
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

import com.example.monthlyapp.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityRegisterBinding view = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_register);
        EditText email = findViewById(R.id.edit_text_email);
        Button btn_register = findViewById(R.id.btn_register1);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(email.getText().toString().isEmpty())) {
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    MainActivity.flag = false;
                    intent.putExtra("email", email.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(RegisterActivity.this, "Поля не могут быть пустыми", Toast.LENGTH_SHORT).show();
                }
                /*Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                intent.putExtra("email", email.getText().toString());
                startActivity(intent);*/
            }
        });
    }
}