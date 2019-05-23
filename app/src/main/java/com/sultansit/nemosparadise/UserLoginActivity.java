package com.sultansit.nemosparadise;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class UserLoginActivity extends AppCompatActivity {
    private  EditText etSignInMail;
    private  EditText etSignInPass;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        etSignInMail = findViewById(R.id.etSignInEmailID);
        etSignInPass  = findViewById(R.id.etSignInPassID);
        firebaseAuth = FirebaseAuth.getInstance();
    }
    public void userSignInClick(View v){
        final ProgressDialog progressDialog = ProgressDialog.show(UserLoginActivity.this, "Signing in...","please wait...", true);
        (firebaseAuth.signInWithEmailAndPassword(etSignInMail.getText().toString(), etSignInPass.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                 progressDialog.dismiss();
                 
                 if (task.isSuccessful()){
                     Toast.makeText(UserLoginActivity.this, "Login Succesfull !!", Toast.LENGTH_SHORT).show();
                     Intent intent = new Intent(UserLoginActivity.this, MainActivity.class);;
                     startActivity(intent);
                 }
                 else {
                     Log.e("ERROR !!", task.getException().toString());
                     Toast.makeText(UserLoginActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                 }
            }
        });
    }
}
