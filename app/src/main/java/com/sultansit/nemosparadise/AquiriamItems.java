package com.sultansit.nemosparadise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AquiriamItems extends AppCompatActivity {
    Button BTback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquiriam_items);

        BTback = findViewById(R.id.btnBackID);
        BTback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AquiriamItems.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void thanksForPurchase(View v){
        Toast.makeText(AquiriamItems.this, "Purchase Successful\nThanks !!", Toast.LENGTH_SHORT).show();
    }
}
