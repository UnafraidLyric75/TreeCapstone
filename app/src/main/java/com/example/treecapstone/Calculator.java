package com.example.treecapstone;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.Nullable;

public class Calculator extends AppCompatActivity{

    float input;
    String output = "";
    EditText editTextNumber;
    Button button5,button11;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Log.d(TAG, "onCreate: Starting.");

        editTextNumber = (EditText) findViewById(R.id.editTextNumber);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            input = Float.parseFloat((editTextNumber.getText().toString()));
            output = String.valueOf((input/2.5));
                ((TextView)findViewById(R.id.textView12)).setText(output);
            }

        });

        button11 = (Button) findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked button11.");

                Intent intent = new Intent(Calculator.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
