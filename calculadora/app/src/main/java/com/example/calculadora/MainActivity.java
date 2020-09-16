package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText valor1, valor2;
    TextView resultado;
    Button sumar, restar, dividir, multiplicar, limpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //valores por teclado
        valor1 = findViewById(R.id.txtValor1);
        valor2 = findViewById(R.id.txtValor2);

        //resultado
        resultado = findViewById(R.id.txtResultado);

        //botones
        sumar = findViewById(R.id.btnsumar);
        restar = findViewById(R.id.btnrestar);
        multiplicar = findViewById(R.id.btnmultiplicar);
        dividir = findViewById(R.id.btndividir);
        limpiar = findViewById(R.id.btnlimpiar);

        /*
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double mvalor1 = Double.parseDouble(valor1.getText().toString());
                double mvalor2 = Double.parseDouble(valor2.getText().toString());
                double mresultado = mvalor1+mvalor2;
                resultado.setText(String.valueOf(mresultado));


            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double mvalor1 = Double.parseDouble(valor1.getText().toString());
                double mvalor2 = Double.parseDouble(valor2.getText().toString());
                double mresultado = mvalor1-mvalor2;
                resultado.setText(String.valueOf(mresultado));

            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double mvalor1 = Double.parseDouble(valor1.getText().toString());
                double mvalor2 = Double.parseDouble(valor2.getText().toString());
                double mresultado = mvalor1/mvalor2;
                resultado.setText(String.valueOf(mresultado));
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double mvalor1 = Double.parseDouble(valor1.getText().toString());
                double mvalor2 = Double.parseDouble(valor2.getText().toString());
                double mresultado = mvalor1*mvalor2;
                resultado.setText(String.valueOf(mresultado));
            }
        });

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
                valor1.setText("");
                valor2.setText("");
            }
        });

         */
        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        limpiar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        if (!valor1.getText().toString().isEmpty() && !valor2.getText().toString().isEmpty()) {

            double mvalor1 = Double.parseDouble(valor1.getText().toString());
            double mvalor2 = Double.parseDouble(valor2.getText().toString());
            double mresultado=0;
            //validamos en que boton se hace click
            switch (view.getId()){
                case R.id.btnsumar:
                    mresultado = mvalor1 + mvalor2;
                    break;

                case R.id.btnrestar:
                    mresultado = mvalor1 - mvalor2;
                    break;

                case R.id.btndividir:
                    mresultado = mvalor1 / mvalor2;
                    break;

                case R.id.btnmultiplicar:
                    mresultado = mvalor1 * mvalor2;
                    break;

            }
            DecimalFormat nro = new DecimalFormat("$###,###,###.##");
            resultado.setText(nro.format(mresultado));
        }
        else{
            //mostrar alerta de campos incompletos
            Toast.makeText(getApplicationContext(),"campos incompletos",Toast.LENGTH_SHORT).show();
        }

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1.setText("");
                valor2.setText("");
                resultado.setText("");
                valor1.requestFocus();
            }
        });
    }


}
