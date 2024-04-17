package com.example.treecapstone;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.Nullable;

public class DouglasFirInfo extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_douglusfirinfo);
        Log.d(TAG, "onCreate: Starting.");

        Button button12df = (Button) findViewById(R.id.button12df);

        button12df.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d(TAG, "onClick: Clicked button12df.");

                Intent intent = new Intent(DouglasFirInfo.this, TreeLookup.class);
                startActivity(intent);
            }
        });

        Button button13df = (Button) findViewById(R.id.button13df);

        button13df.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked button13df.");

                Intent intent = new Intent(DouglasFirInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
