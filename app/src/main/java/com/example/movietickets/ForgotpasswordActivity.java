package com.example.movietickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotpasswordActivity extends AppCompatActivity {
    private Button updatepassword;
    private TextView buttonbacklogin;
    private EditText llemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        updatepassword = findViewById(R.id.updatepassword);
        buttonbacklogin = findViewById(R.id.buttonbacklogin);
        llemail = findViewById(R.id.llemail);

        updatepassword.setOnClickListener(v -> {

            String email = llemail.getText().toString();


            if (llemail.getText().toString().isEmpty() ) {
                Toast.makeText(ForgotpasswordActivity.this,
                        "Không được để trống!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(ForgotpasswordActivity.this,
                        "Vui làm kiểm tra email của bạn  để cập nhật lại mật khẩu", Toast.LENGTH_LONG).show();
            }
        });

        buttonbacklogin . setOnClickListener(v -> {

            Intent intent = new Intent(ForgotpasswordActivity.this , SigninActivity.class);
            startActivity(intent);
        });

    }
}