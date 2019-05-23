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
import com.google.firebase.auth.FirebaseAuthException;

public class UserRegistrationActivity extends AppCompatActivity {
    private   EditText etRegmail;
    private EditText etRegPass;
    private   FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        etRegmail = findViewById(R.id.etRegiEmailID);
        etRegPass = findViewById(R.id.etRegiPassID);
        firebaseAuth = FirebaseAuth.getInstance();
    }
    public void userRegistrationClick(View v){
        final ProgressDialog progressDialog = ProgressDialog.show(UserRegistrationActivity.this,"Please wait....", "your request is on process", true);
        (firebaseAuth.createUserWithEmailAndPassword(etRegmail.getText().toString(), etRegPass.getText().toString()))
                .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();

                if (task.isSuccessful()){
                    Toast.makeText(UserRegistrationActivity.this, "Congratulation !! \n Registration Succesfull !!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(UserRegistrationActivity.this, UserLoginActivity.class);
                    startActivity(intent);
                }
                else {
                    Log.e("Error!!", task.getException().toString());
                    Toast.makeText(UserRegistrationActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
