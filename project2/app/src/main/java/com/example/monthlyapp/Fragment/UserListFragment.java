package com.example.monthlyapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.monthlyapp.R;

public class UserListFragment extends Fragment {

    public UserListFragment() {
        super(R.layout.fragment_user_list);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_list, container, false);
        Button btn_list_view = view.findViewById(R.id.btn_list_view);
        Button btn_recycler_view = view.findViewById(R.id.btn_recycler_view);

        btn_list_view.setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_UserListFragment_to_ListViewFragment, null);
        });

        btn_recycler_view.setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_UserListFragment_to_RecyclerViewFragment, null);
        });
        return view;
    }
}