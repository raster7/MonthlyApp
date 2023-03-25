package com.example.monthlyapp.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monthlyapp.Class.DataBase;
import com.example.monthlyapp.Class.User;
import com.example.monthlyapp.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final String TAG = "recyclerViewLogs";
    private LayoutInflater inflater;
    private User[] users;

    public RecyclerViewAdapter(@NonNull Context context, @NonNull User[] users) {
        this.inflater = LayoutInflater.from(context);
        this.users = users;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder
    onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void
    onBindViewHolder(RecyclerViewAdapter.ViewHolder
                             holder, int position) {
        User user = users[position];
        String name = "Имя пользователя: " + user.getName();
        String password = "Пароль: " + user.getPassword();
        holder.textViewName.setText(name);
        holder.imageAvatar.setImageResource(R.drawable.ic_launcher_foreground);
        holder.textViewPassword.setText(password);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(inflater.getContext(), "Имя пользователя: " + DataBase.users[holder.getAdapterPosition()].name + ", Пароль: " + DataBase.users[holder.getAdapterPosition()].password, Toast.LENGTH_SHORT).show();
                Log.i(TAG, "Имя пользователя: " + DataBase.users[holder.getAdapterPosition()].name + ", Пароль: " + DataBase.users[holder.getAdapterPosition()].password);
            }
        });
    }
    @Override
    public int getItemCount() {
        return DataBase.getCounter();
    }
    public static class ViewHolder extends
            RecyclerView.ViewHolder {
        final TextView textViewName;
        final ImageView imageAvatar;
        final RelativeLayout relativeLayout;
        final TextView textViewPassword;
        ViewHolder(View view){
            super(view);
            imageAvatar = view.findViewById(R.id.avatar);
            textViewName = view.findViewById(R.id.name);
            relativeLayout = view.findViewById(R.id.relative_layout);
            textViewPassword = view.findViewById(R.id.password);
        }
    }
}
