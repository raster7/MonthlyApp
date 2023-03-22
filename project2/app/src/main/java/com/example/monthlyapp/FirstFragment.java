package com.example.monthlyapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class FirstFragment extends Fragment {

    public FirstFragment() {
        super(R.layout.fragment_first);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        FrameLayout frameLayout = view.findViewById(R.id.FirstFragment);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("email", MainActivity.name);
                startActivity(intent);
            }
        });
        return view;
    }
}