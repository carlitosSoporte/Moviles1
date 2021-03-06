package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText valor1, valor2;
    TextView resultado, usuario;
    Button sumar, restar, dividir, multiplicar, limpiar, enviar;
    RadioButton rbsi,rbno;
    CheckBox cbiva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //valores por teclado
        valor1 = findViewById(R.id.txtValor1);
        valor2 = findViewById(R.id.txtValor2);
        usuario = findViewById(R.id.txtusuario);

        //resultado
        resultado = findViewById(R.id.txtResultado);

        //botones
        sumar = findViewById(R.id.btnsumar);
        restar = findViewById(R.id.btnrestar);
        multiplicar = findViewById(R.id.btnmultiplicar);
        dividir = findViewById(R.id.btndividir);
        limpiar = findViewById(R.id.btnlimpiar);
        enviar = findViewById(R.id.btnenviar);

        //radio buton
        rbsi = findViewById(R.id.rbsi);
        rbno = findViewById(R.id.rbno);

        //checkbox
        cbiva = findViewById(R.id.cbiva);
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
        usuario.setText(getIntent().getStringExtra("eusuario"));
        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        limpiar.setOnClickListener(this);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                Intent actividad2 = new Intent(getApplicationContext(),Main2Activity.class);
                actividad2.putExtra("valor1",valor1.getText().toString());
                actividad2.putExtra("resultado",resultado.getText().toString());
                startActivity(actividad2);
            }
        });

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

            if(cbiva.isChecked()){
                mresultado *= 1.19;
            }
            if(rbsi.isChecked()){
                DecimalFormat nro = new DecimalFormat("$###,###,###.##");
                resultado.setText(nro.format(mresultado));
            }
            else{
                resultado.setText(String.valueOf(mresultado));
            }

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
