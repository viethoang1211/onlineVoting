package com.example.onlinevoting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    ImageView googleBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView ForgetPass= findViewById(R.id.forgotpass);
//        ForgetPass.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this,RegisterActivity.class)));
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        MaterialButton loginBtn = findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u = username.getText().toString().trim();
                String p= password.getText().toString().trim();
                if(u.isEmpty()){
                    username.setError("User name is required");
                    username.requestFocus();
                    return;
                }
                if(p.isEmpty()){
                    password.setError("Password is required");
                    password.requestFocus();
                    return;
                }
                if(p.length()<4){
                    password.setError("Password must longer than 4 digits");
                    password.requestFocus();
                    return;
                }
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(LoginActivity.this,"Welcome",Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }else
                    //incorrect
                    Toast.makeText(LoginActivity.this,"Username or password incorrect",Toast.LENGTH_SHORT).show();
            }
        });

    }

}