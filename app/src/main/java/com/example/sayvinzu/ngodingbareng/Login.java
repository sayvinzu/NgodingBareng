package com.example.sayvinzu.ngodingbareng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Registrasi (View view){
        Toast.makeText(this, "good", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Login.this, Registrasi.class ));
    }
}
