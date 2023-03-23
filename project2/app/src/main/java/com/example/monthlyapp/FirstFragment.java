package com.example.monthlyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.Objects;

public class FirstFragment extends Fragment {

    private static final String TAG = "fragmentLogs";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach");
        Toast.makeText(getContext(), "onAttach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        Toast.makeText(getContext(), "onCreate", Toast.LENGTH_SHORT).show();
    }

    public FirstFragment() {
        super(R.layout.fragment_first);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        FrameLayout frameLayout = view.findViewById(R.id.FirstFragment);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!MainActivity.openMainActivity) {
                    Intent intent = new Intent(getContext(), MainActivity.class);
                    intent.putExtra("email", MainActivity.name);
                    startActivity(intent);
                }
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "onViewCreated");
        Toast.makeText(getContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated");
        Toast.makeText(getContext(), "onActivityCreated", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
        Toast.makeText(getContext(), "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
        Toast.makeText(getContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
        Toast.makeText(getContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
        Toast.makeText(getContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView");
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
        Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }
}