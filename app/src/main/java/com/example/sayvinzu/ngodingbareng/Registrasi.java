package com.example.sayvinzu.ngodingbareng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registrasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
    }

    public void Login (View view){
        Toast.makeText(this, "Login dulu kk", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Registrasi.this, Login.class ));
    }
}
