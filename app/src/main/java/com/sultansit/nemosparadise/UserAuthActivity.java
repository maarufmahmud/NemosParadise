package com.sultansit.nemosparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserAuthActivity extends AppCompatActivity {
    Button BTlogin, BTregi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_auth);

        BTlogin = findViewById(R.id.toLoginBtnID);
        BTregi = findViewById(R.id.toRegisterBtnID);

        BTlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAuthActivity.this,UserLoginActivity.class);
                startActivity(intent);
            }
        });

        BTregi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAuthActivity.this,UserRegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}
