package com.example.sheji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class messageActivity extends AppCompatActivity {

    private Button mBtncommubity;
    private Button mBtnpersonal;
    private Button mBtnpicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        mBtnpersonal = findViewById(R.id.bu_personal);
        mBtnpicture = findViewById(R.id.bu_picture);
        mBtncommubity = findViewById(R.id.bu_community);

        mBtnpersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(messageActivity.this,personalActivity.class);
                startActivity(intent);
            }
        });

        mBtnpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(messageActivity.this,homepageActivity.class);
                startActivity(intent);
            }
        });

        mBtncommubity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(messageActivity.this,communityActivity.class);
                startActivity(intent);
            }
        });
    }
}
