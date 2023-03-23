package com.example.monthlyapp;

import static androidx.fragment.app.FragmentManagerKt.commit;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import com.example.monthlyapp.databinding.ActivityMainBinding;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "monthlyLogs";
    public static String name;
    public static Boolean flag = true;
    public static Boolean openMainActivity;
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
        setStatusOpenMainActivity(true);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.firstFragment,
                            FirstFragment.class, null)
                    .commit();
        }
        view.btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StartActivity.class);
                //setStatusOpenMainActivity(false);
                startActivity(intent);
            }
        });

        view.calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"Clicked on button 'Календарь'");
                Intent intent1 = new Intent(MainActivity.this, CalendarActivity.class);
                //setStatusOpenMainActivity(false);
                startActivity(intent1);
            }
        });
        view.settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, SettingsActivity.class);
                //setStatusOpenMainActivity(false);
                startActivity(intent2);
            }
        });
    }
    public void onClickGraph(View view) {
        Log.i(TAG,"Clicked on button 'График'");
        Intent intent = new Intent(this, GraphicActivity.class);
        //setStatusOpenMainActivity(false);
        startActivity(intent);
    }

    public static void setStatusOpenMainActivity(Boolean bool) {
        openMainActivity = bool;
    }

    @Override
    protected void onPause() {
        super.onPause();
        setStatusOpenMainActivity(false);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}