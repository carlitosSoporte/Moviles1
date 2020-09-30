package com.example.usuario.proyecto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    EditText email,contrasena;
    Button iniciarSesion;
    TextView registrarse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.etEmail);
        contrasena=findViewById(R.id.etContraseña);
        iniciarSesion=findViewById(R.id.btnIniciarSesion);
        registrarse=findViewById(R.id.tvRegistrarse);

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), usuario.class);
                startActivity(intent);
            }
        });


    }
}
