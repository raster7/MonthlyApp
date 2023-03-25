package com.example.monthlyapp.Adapter;

import static com.example.monthlyapp.Class.DataBase.users;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.monthlyapp.Class.DataBase;
import com.example.monthlyapp.Class.User;
import com.example.monthlyapp.R;

public class ListViewAdapter extends ArrayAdapter<User> {
    private LayoutInflater inflater;
    private int layout;
    private User[] users;
    public ListViewAdapter(Context context, int resource,
                                 User[] users) {
        super(context, resource, users);
        this.users = users;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);
        TextView textViewName = view.findViewById(R.id.name);
        String name = "Имя пользователя: " + this.users[position].name;
        textViewName.setText(name);
        String password = "Пароль: " + this.users[position].password;
        TextView textViewPassword = view.findViewById(R.id.password);
        textViewPassword.setText(password);
        ImageView imageAvatar = view.findViewById(R.id.avatar);
        imageAvatar.setImageResource(R.drawable.ic_launcher_foreground);
        return view;
    }
}
