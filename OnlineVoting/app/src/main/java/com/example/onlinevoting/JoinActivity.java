package com.example.onlinevoting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        EditText pollID= findViewById(R.id.editfastpollid);
        EditText pollpass=findViewById(R.id.editfastpollpass);
        Button joinbtn=findViewById(R.id.checkfastjoinbtn);
        joinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pID= pollID.getText().toString().trim();
                String pPass= pollpass.getText().toString().trim();
                if(pID.isEmpty()){
                    pollID.setError("Poll ID is required");
                    pollID.requestFocus();
                    return;
                }
                if(pPass.isEmpty()){
                    pollpass.setError("Poll password is required");
                    pollpass.requestFocus();
                    return;
                }
            }
        });
    }


}