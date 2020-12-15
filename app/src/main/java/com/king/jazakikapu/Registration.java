package com.king.jazakikapu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
    EditText mEdtPhone, mEdtPassword, mEdtConfirmPassword;
    TextView mTvReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        mEdtPhone = findViewById(R.id.edt_phone);
        mEdtPassword = findViewById(R.id.edt_pass);
        mEdtConfirmPassword = findViewById(R.id.edt_pass_con);
        mTvReg = findViewById(R.id.tv_register);

        mTvReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = mEdtPhone.getText().toString().trim();
                String password = mEdtPassword.getText().toString().trim();
                String confirm_password = mEdtConfirmPassword.getText().toString().trim();

                if(mobile.isEmpty() || mobile.length() < 10){
                    mEdtPhone.setError("Enter a valid mobile");
                    mEdtPhone.requestFocus();
                    return;
                }else if (password.isEmpty() || password.length() < 4){
                    mEdtPassword.setError("Password must be 4 or more characters");
                    mEdtPassword.requestFocus();
                    return;
                }else if (confirm_password.isEmpty() || confirm_password.length() < 4){
                    mEdtConfirmPassword.setError("Confirm password must be 4 or more characters");
                    mEdtConfirmPassword.requestFocus();
                    return;
                }else if (!password.equals(confirm_password)){
                    mEdtPassword.setError("Passwords don't match");
                    mEdtPassword.requestFocus();
                    return;
                }else {
                    Intent intent = new Intent(Registration.this, VerifyPhoneActivity.class);
                    intent.putExtra("mobile", mobile);
                    intent.putExtra("password", password);
                    startActivity(intent);
                    finish();
                }
            }
        });


    }

    public void signin(View view) {
        startActivity(new Intent(getApplicationContext(),SignIn.class));
        finish();
    }
}