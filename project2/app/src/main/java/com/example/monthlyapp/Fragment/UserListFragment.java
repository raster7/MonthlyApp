package com.example.monthlyapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.monthlyapp.R;

public class UserListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_list, container, false);
        Button btn_list_view = view.findViewById(R.id.btn_list_view);
        Button btn_recycler_view = view.findViewById(R.id.btn_recycler_view);

        btn_list_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().beginTransaction().replace(R.id.fragmentContainerView5, new ListViewFragment(), "123").commit();
            }
        });

        btn_recycler_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().beginTransaction().replace(R.id.fragmentContainerView5, new RecyclerViewFragment(), "123").commit();
            }
        });
        return view;
    }
}