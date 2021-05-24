package com.example.facebooklogin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupTabFragment  extends Fragment {
    EditText email,pass,cpass;
    Button signup;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.signup_tab_fragment,container,false);
        email = view.findViewById(R.id.semail);
        pass = view.findViewById(R.id.spassword);
        cpass = view.findViewById(R.id.xd_password);
        signup = view.findViewById(R.id.s_button);
        return view;
    }
}
