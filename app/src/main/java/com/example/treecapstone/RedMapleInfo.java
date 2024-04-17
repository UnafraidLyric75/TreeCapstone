package com.example.treecapstone;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.Nullable;

public class RedMapleInfo extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redmapleinfo);
        Log.d(TAG, "onCreate: Starting.");

        Button button12rm = (Button) findViewById(R.id.button12rm);

        button12rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d(TAG, "onClick: Clicked button12rm.");

                Intent intent = new Intent(RedMapleInfo.this, TreeLookup.class);
                startActivity(intent);
            }
        });

        Button button13rm = (Button) findViewById(R.id.button13rm);

        button13rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked button13rm.");

                Intent intent = new Intent(RedMapleInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
