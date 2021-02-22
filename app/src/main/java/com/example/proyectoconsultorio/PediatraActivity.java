package com.example.proyectoconsultorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PediatraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pediatra);
    }
    public void Regresar3 (View view){
        Intent regresar3 =new Intent (this, MainActivity.class);
        startActivity(regresar3);
    }
}