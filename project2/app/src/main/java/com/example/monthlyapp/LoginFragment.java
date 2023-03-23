package com.example.monthlyapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Objects;

public class LoginFragment extends Fragment {
    private static final String TAG = "fragmentLogs";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("requestKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String bundle = result.getString("name");
                Log.i(TAG, bundle);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        EditText emailEditText = view.findViewById(R.id.edit_text_email);
        Button btn = view.findViewById(R.id.btn_login);
        if (getActivity() instanceof SignInActivity) {
            btn.setText("Войти");
        } else if (getActivity() instanceof RegisterActivity) {
            btn.setText("Зарегистрироваться");
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = emailEditText.getText().toString();
                if (name.isEmpty()) {
                    Toast.makeText(getContext(), "Поля не могут быть пустыми!", Toast.LENGTH_SHORT).show();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("name", name);
                    getParentFragmentManager().setFragmentResult("requestKey", bundle);
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    MainActivity.flag = false;
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}