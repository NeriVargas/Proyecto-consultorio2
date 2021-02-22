package com.example.proyectoconsultorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PodologaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podologa);
    }
    public void Regresar4 (View view){
        Intent regresar4 =new Intent (this, MainActivity.class);
        startActivity(regresar4);
    }
}