package com.example.treecapstone;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;

import com.example.treecapstone.databinding.ActivityAitreelookupBinding;

import java.io.File;

// test
public class AiTreeLookup extends MainActivity {

    private static final int CAMERA_PERMISSION_CODE = 0;
    ActivityAitreelookupBinding aiBinding;
    ActivityResultLauncher<Uri> takePictureLauncher;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInsatnceState){
        super.onCreate(savedInsatnceState);
        aiBinding = ActivityAitreelookupBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_aitreelookup);

        imageUri = createUri();
        registerPictureLauncher();


        aiBinding.btnTakePicture.setOnClickListener(view -> {
            checkCameraPermissionAndOpenCamera();
        });

        aiBinding.btnGoHome.setOnClickListener(view -> {
                Intent intent = new Intent(AiTreeLookup.this, MainActivity.class);
                startActivity(intent);
        });
    }

    private Uri createUri(){
        File imageFile = new File(getApplicationContext().getFilesDir(), "camera_photo.jpg");
        return FileProvider.getUriForFile(getApplicationContext(),"com.example.treecapstone.fileProvider",imageFile);
    }

    private void registerPictureLauncher(){
        takePictureLauncher = registerForActivityResult(
                new ActivityResultContracts.TakePicture(),
                new ActivityResultCallback<Boolean>() {
                    @Override
                    public void onActivityResult(Boolean o) {
                        try{
                            if(o){
                                aiBinding.ivUser.setImageURI(null);
                                aiBinding.ivUser.setImageURI(imageUri);
                            }
                        }catch (Exception exception){
                            exception.getStackTrace();
                        }
                    }
                }
        );
    }

    private void checkCameraPermissionAndOpenCamera(){
        if(ActivityCompat.checkSelfPermission(AiTreeLookup.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(AiTreeLookup.this,new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_CODE);
        } else {
            takePictureLauncher.launch(imageUri);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == CAMERA_PERMISSION_CODE){
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                takePictureLauncher.launch(imageUri);
            } else {
                Toast.makeText(this, "Camera Permission denied, please allow permission to take picture.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
