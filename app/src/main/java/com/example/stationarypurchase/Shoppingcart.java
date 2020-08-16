package com.example.stationarypurchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shoppingcart extends AppCompatActivity {

    Button Spbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcart);
        Spbtn = findViewById(R.id.button3);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Spbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shoppingcart.this,checkout.class);
                startActivity(intent);
            }
        });
    }
}