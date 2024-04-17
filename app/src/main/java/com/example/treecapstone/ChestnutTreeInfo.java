package com.example.treecapstone;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.Nullable;

public class ChestnutTreeInfo extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestnutoakinfo);
        Log.d(TAG, "onCreate: Starting.");

        Button button12 = (Button) findViewById(R.id.button12);

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d(TAG, "onClick: Clicked button12.");

                Intent intent = new Intent(ChestnutTreeInfo.this, TreeLookup.class);
                startActivity(intent);
            }
        });

        Button button13 = (Button) findViewById(R.id.button13);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked button13.");

                Intent intent = new Intent(ChestnutTreeInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
