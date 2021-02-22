package com.example.proyectoconsultorio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicoActivity extends AppCompatActivity {
    private Button mAlertbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medico2);
    }
    public void Regresar1 (View view){
        Intent regresar1 =new Intent (this, MainActivity.class);
        startActivity(regresar1);

        mAlertbtn=(Button)findViewById(R.id.Enviar1);
        mAlertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder enviar1 = new AlertDialog.Builder(MedicoActivity.this);
                enviar1.setMessage("Su cita se envio con exito")
                        .setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
            }
        });

    }
}