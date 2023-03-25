package com.example.monthlyapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.monthlyapp.Adapter.ListViewAdapter;
import com.example.monthlyapp.Class.DataBase;
import com.example.monthlyapp.R;

public class ListViewFragment extends Fragment {
    private final String TAG = "listViewLogs";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);
        ListView listView = view.findViewById(R.id.list_view);;
        ListViewAdapter listViewAdapter = new ListViewAdapter(getContext(), R.layout.item, DataBase.users);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i(TAG, "Имя пользователя: " + DataBase.users[position].name + ", Пароль: " + DataBase.users[position].password);
                Toast.makeText(getContext(), "Имя пользователя: " + DataBase.users[position].name + ", Пароль: " + DataBase.users[position].password, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}