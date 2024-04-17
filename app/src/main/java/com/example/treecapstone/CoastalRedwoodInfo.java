package com.example.treecapstone;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.Nullable;

public class CoastalRedwoodInfo extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coastalredwoodinfo);
        Log.d(TAG, "onCreate: Starting.");

        Button button12cr = (Button) findViewById(R.id.button12cr);

        button12cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d(TAG, "onClick: Clicked button12cr.");

                Intent intent = new Intent(CoastalRedwoodInfo.this, TreeLookup.class);
                startActivity(intent);
            }
        });

        Button button13cr = (Button) findViewById(R.id.button13cr);

        button13cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked button13cr.");

                Intent intent = new Intent(CoastalRedwoodInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
