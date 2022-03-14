package com.example.movietickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateaccountActivity extends AppCompatActivity {
    private TextView backtologin;
    private Button createbutton;
    private EditText taikhoan;
    private EditText sodienthoai;
    private EditText email;
    private EditText matkhau;
    private EditText nhapmatkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);
        createbutton = findViewById(R.id.createbutton);
        backtologin = findViewById(R.id.backtologin);
        taikhoan = findViewById(R.id.taikhoan);
        sodienthoai = findViewById(R.id.sodienthoai);
        email = findViewById(R.id.email);
        matkhau = findViewById(R.id.matkhau);
        nhapmatkhau = findViewById(R.id.nhapmatkhau);


        createbutton.setOnClickListener(v -> {

            String emaillogin = email.getText().toString();
            String account = taikhoan.getText().toString();
            String numberphone = sodienthoai.getText().toString();
            String password = matkhau.getText().toString();
            String repassword = nhapmatkhau.getText().toString();

            if (email.getText().toString().isEmpty() || taikhoan.getText().toString().isEmpty() || sodienthoai.getText().toString().isEmpty() || matkhau.getText().toString().isEmpty() ||  nhapmatkhau.getText().toString().isEmpty() ) {
                Toast.makeText(CreateaccountActivity.this,
                        "Không được để trống!", Toast.LENGTH_LONG).show();
            } else {

                Toast.makeText(CreateaccountActivity.this,
                        "Đăng ký thành công!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(CreateaccountActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });
        backtologin.setOnClickListener(v ->{
            Intent intent = new Intent(CreateaccountActivity.this, SigninActivity.class);
            startActivity(intent);
        });
    }
}