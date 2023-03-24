package com.example.monthlyapp.Activity;

import android.os.Bundle;

import com.example.monthlyapp.Fragment.LoginFragment;
import com.example.monthlyapp.R;

import androidx.appcompat.app.AppCompatActivity;

import com.example.monthlyapp.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_login, LoginFragment.class, null)
                    .commit();
        }
    }
}