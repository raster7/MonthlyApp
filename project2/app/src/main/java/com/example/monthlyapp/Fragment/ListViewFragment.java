package com.example.monthlyapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.monthlyapp.Adapter.ListViewAdapter;
import com.example.monthlyapp.Class.DataBase;
import com.example.monthlyapp.R;

public class ListViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);
        ListView listView = view.findViewById(R.id.list_view);;
        ListViewAdapter listViewAdapter = new ListViewAdapter(getContext(), DataBase.users);
        listView.setAdapter(listViewAdapter);
        return view;
    }
}