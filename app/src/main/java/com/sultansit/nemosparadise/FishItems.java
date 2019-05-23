package com.sultansit.nemosparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FishItems extends AppCompatActivity {
    Button BTback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_items);

        BTback = findViewById(R.id.btnBackID);
        BTback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FishItems.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void thanksForPurchase(View v){
        Toast.makeText(FishItems.this, "Purchase Successful\nThanks !!", Toast.LENGTH_SHORT).show();
    }
}
