package com.example.proyectoconsultorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GinecologoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ginecologo);
    }
    public void Regresar2 (View view){
        Intent regresar2 =new Intent (this, MainActivity.class);
        startActivity(regresar2);
    }
}