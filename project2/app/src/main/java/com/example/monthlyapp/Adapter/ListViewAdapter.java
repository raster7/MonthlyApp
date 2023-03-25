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

    private Context context;
    private User[] users;

    public ListViewAdapter(@NonNull Context context, @NonNull User[] users) {
        super(context, R.layout.item, DataBase.users);
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item, parent, false);
        TextView textViewName = view.findViewById(R.id.name);
        textViewName.setText(this.users[position].name);
        ImageView imageAvatar = view.findViewById(R.id.avatar);
        imageAvatar.setImageResource(R.drawable.ic_launcher_foreground);
        return view;
    }
}
