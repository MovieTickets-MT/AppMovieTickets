package com.example.movietickets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SigninActivity extends AppCompatActivity {
    private TextView buttoncreateaccount;
    private TextView forrgetaccount;
    private Button buttonSignin;
    private EditText llemail;
    private EditText llpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        buttonSignin = findViewById(R.id.buttonSignin);
        llemail = findViewById(R.id.llemail);
        llpassword = findViewById(R.id.llpassword);
        buttoncreateaccount = findViewById(R.id.buttoncreateaccount);
        forrgetaccount = findViewById(R.id.forrgetaccount);


        buttonSignin.setOnClickListener(v -> {

            String email = llemail.getText().toString();
            String password = llpassword.getText().toString();

            if (llemail.getText().toString().isEmpty() || llpassword.getText().toString().isEmpty()) {
                Toast.makeText(SigninActivity.this,
                        "Không được để trống!", Toast.LENGTH_LONG).show();
            } else {

            }
        });

        buttoncreateaccount.setOnClickListener(v -> {
            Intent intent = new Intent(SigninActivity.this , CreateaccountActivity.class);
            startActivity(intent);
        });

        forrgetaccount.setOnClickListener(v -> {
            Intent intent = new Intent(SigninActivity.this , ForgotpasswordActivity.class);
            startActivity(intent);
        });
    }
}
