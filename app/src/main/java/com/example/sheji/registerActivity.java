package com.example.sheji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import com.example.sheji.util.ToastUtil;

public class registerActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mpassword1;
    private EditText mpassword2;
    private Button mBtnregister;
    private EditText musername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mpassword1 = findViewById(R.id.et_2);
        mpassword2 = findViewById(R.id.et_3);
        mBtnregister = findViewById(R.id.bu_register);
        musername = findViewById(R.id.et_1);

        mBtnregister.setOnClickListener(this);
    }

    public void onClick(View v) {
        String password1 = mpassword1.getText().toString();
        String password2 = mpassword2.getText().toString();
        String username = musername.getText().toString();
        String success = "注册成功，请登录";
        String fail1 = "用户名不能为空！";
        String fail2 = "两次密码不一致！";
        Intent intent = null;

        if (password1.equals(password2) && username.length() != 0) {
            ToastUtil.showMsg(registerActivity.this, success);
            intent = new Intent(registerActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (password1.equals(password2) && username.length() == 0) {
            ToastUtil.showMsg(registerActivity.this, fail1);
        } else {
            ToastUtil.showMsg(registerActivity.this, fail2);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
