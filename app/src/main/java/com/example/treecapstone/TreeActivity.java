package com.example.treecapstone;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.treecapstone.databinding.ActivityTreeBinding;

public class TreeActivity extends AppCompatActivity {

    ActivityTreeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding = ActivityTreeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if(intent != null){

            int imageId = intent.getIntExtra("imageId", R.drawable.a);
            String name = intent.getStringExtra("name");
            String sciName = intent.getStringExtra("sciName");
            String facts = intent.getStringExtra("facts");
            String healthFacts = intent.getStringExtra("healthFacts");

            binding.profileImage.setImageResource(imageId);
            binding.nameProfile.setText(name);
            binding.phoneProfile.setText(sciName);
            binding.factsProfile.setText(facts);
            binding.hfactsProfile.setText(healthFacts);
        }
    }
}
