package com.example.monthlyapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monthlyapp.Class.DataBase;
import com.example.monthlyapp.Class.User;
import com.example.monthlyapp.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

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
        holder.textViewName.setText(user.getName());
        holder.imageAvatar.setImageResource(R.drawable.ic_launcher_foreground);
        holder.textViewPassword.setText(user.getPassword());
    }
    @Override
    public int getItemCount() {
        return DataBase.getCounter();
    }
    public static class ViewHolder extends
            RecyclerView.ViewHolder {
        final TextView textViewName;
        final ImageView imageAvatar;
        final TextView textViewPassword;
        ViewHolder(View view){
            super(view);
            imageAvatar = view.findViewById(R.id.avatar);
            textViewName = view.findViewById(R.id.name);
            textViewPassword = view.findViewById(R.id.password);
        }
    }
}
