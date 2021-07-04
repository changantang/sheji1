package com.example.sheji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personalActivity extends AppCompatActivity {

    private Button mBtnmessage;
    private Button mBtncommubity;
    private Button mBtnpicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        mBtnpicture = findViewById(R.id.bu_picture);
        mBtncommubity = findViewById(R.id.bu_community);
        mBtnmessage = findViewById(R.id.bu_message);

        mBtnpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(personalActivity.this,homepageActivity.class);
                startActivity(intent);
            }
        });

        mBtncommubity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(personalActivity.this,communityActivity.class);
                startActivity(intent);
            }
        });

        mBtnmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(personalActivity.this,messageActivity.class);
                startActivity(intent);
            }
        });
    }
}
