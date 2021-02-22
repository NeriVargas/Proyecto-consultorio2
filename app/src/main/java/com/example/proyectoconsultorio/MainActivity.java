package com.example.proyectoconsultorio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void siguiente (View view){
        Intent siguiente = new Intent(this, MedicoActivity.class);
        startActivity(siguiente);
    }
    public void Siguiente1 (View view){
        Intent siguiente1 = new Intent(this, GinecologoActivity.class);
        startActivity(siguiente1);
    }
    public void Siguiente2 (View view){
        Intent siguiente2 = new Intent(this, PediatraActivity.class);
        startActivity(siguiente2);
    }
    public void Siguiente3 (View view){
        Intent siguiente3 = new Intent(this, PodologaActivity.class);
        startActivity(siguiente3);
    }
}