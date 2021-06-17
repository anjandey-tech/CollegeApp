package com.inturnsala.admincollegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice,addGalleryImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNotice);
        addGalleryImage = findViewById(R.id.addGalleryImage);
        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        Intent intent;
        switch (view.getId()){
            case R.id.addNotice:
                intent = new Intent(MainActivity.this,UploadNotice.class);
                startActivity(intent);
                break;
            case R.id.addGalleryImage:
                      intent = new Intent(MainActivity.this,UploadImage.class);
                      startActivity(intent);
                      break;
        }

    }
}