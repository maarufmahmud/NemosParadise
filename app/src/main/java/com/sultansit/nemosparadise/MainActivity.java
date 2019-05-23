package com.sultansit.nemosparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnaqr, btnfish, btndecor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnaqr = findViewById(R.id.aquiriambtnID);
        btnfish = findViewById(R.id.fishbtnID);
        btndecor = findViewById(R.id.decorbtnID);

        btnaqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AquiriamItems.class);
                startActivity(intent);
            }
        });
        btnfish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FishItems.class);
                startActivity(intent);
            }
        });
        btndecor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DecoreItems.class);
                startActivity(intent);
            }
        });

    }
}
