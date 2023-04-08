package com.example.monthlyapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.monthlyapp.Fragment.FirstFragment;
import com.example.monthlyapp.Fragment.UserListFragment;
import com.example.monthlyapp.R;

public class ForDevelopersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_developers);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragmentContainerView4, FirstFragment.class, null)
                    .commit();
        }
    }
}