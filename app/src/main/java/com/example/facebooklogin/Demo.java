package com.example.facebooklogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Demo extends AppCompatActivity {
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        start = findViewById(R.id.start);
        getSupportActionBar().hide();
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(Demo.this,MainActivity.class);
                Demo.this.startActivity(mainIntent);
                Demo.this.finish();
            }
        });
    }
}