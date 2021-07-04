package com.example.sheji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sheji.util.ToastUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnLogin;
    private EditText mEtUser;
    private EditText mEtPassword;
    private Button mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLogin = findViewById(R.id.bu_login);
        mEtUser = findViewById(R.id.et_1);
        mEtPassword = findViewById(R.id.et_2);
        mBtnRegister = findViewById(R.id.bu_register);

        mBtnLogin.setOnClickListener(this);

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this,registerActivity.class);
                startActivity(intent);
            }
        });



    }

    public void onClick(View v){
        String username = mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();
        String ok = "登陆成功";
        String fail = "密码错误或用户未注册";
        Intent intent = null;

        if(username.equals("zonghe")&&password.equals("sheji")){
            //Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();
            ToastUtil.showMsg(MainActivity.this,ok);
            intent = new Intent( MainActivity.this,homepageActivity.class);
            startActivity(intent);
        }else{
            Toast toastCenter = Toast.makeText(getApplicationContext(),fail,Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER, 0,0);
            toastCenter.show();

        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
