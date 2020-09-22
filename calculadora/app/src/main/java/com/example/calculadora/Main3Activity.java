package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button ingresar;
    EditText usuario, contraseña;
    String nombreAplicativo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ingresar = findViewById(R.id.btningresar);
        usuario = findViewById(R.id.etusuario);
        contraseña = findViewById(R.id.etcontraseña);
        



        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usuario.getText().toString().isEmpty() || contraseña.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"datos incompletos",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(contraseña.getText().toString().equals("1234") && usuario.getText().toString().equals("carlos")){
                    Intent actividad1 = new Intent(getApplicationContext(),MainActivity.class);
                    actividad1.putExtra("eusuario","carlos");
                    Toast.makeText(getApplicationContext(),"datos correctos, bienvenido",Toast.LENGTH_SHORT).show();
                    startActivity(actividad1);
                }
                else{
                    Toast.makeText(getApplicationContext(),"datos invalidos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
