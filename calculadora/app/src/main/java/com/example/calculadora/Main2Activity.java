package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.TimeoutException;

public class Main2Activity extends AppCompatActivity {

    TextView valor1, resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        valor1 = findViewById(R.id.txtvalor1r);
        resultado = findViewById(R.id.txtresultador);

        valor1.setText(getIntent().getStringExtra("valor1"));
        resultado.setText(getIntent().getStringExtra("resultado"));

    }
}
