package com.example.sheji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class communityActivity extends AppCompatActivity {

    private Button mBtnmessage;
    private Button mBtnpicture;
    private Button mBtnpersonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        mBtnmessage = findViewById(R.id.bu_message);
        mBtnpersonal = findViewById(R.id.bu_personal);
        mBtnpicture = findViewById(R.id.bu_picture);

        mBtnpersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(communityActivity.this,personalActivity.class);
                startActivity(intent);
            }
        });

        mBtnmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(communityActivity.this,messageActivity.class);
                startActivity(intent);
            }
        });

        mBtnpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(communityActivity.this,homepageActivity.class);
                startActivity(intent);
            }
        });
    }
}
