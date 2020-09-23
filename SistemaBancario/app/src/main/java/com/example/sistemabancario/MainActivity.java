package com.example.sistemabancario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText identificacion,nombres,fecha,valorPrestamo;
    RadioGroup tipoCredito, numeroCuota;
    Button calcular, limpiar;
    CheckBox cuotaManejo;
    RadioButton vivienda,libreInversion,vehiculo, educacion,rb24,rb12,rb36;
    TextView deudaTotal, valorCuotaCredito;
    double interes, valorCuotaManejo, deudaFinal,valorCuotaFinal;
    int cuotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        identificacion=findViewById(R.id.etidentificacion);
        nombres = findViewById(R.id.etNombres);
        fecha = findViewById(R.id.etFecha);
        valorPrestamo=findViewById(R.id.etValorPrestamo);
        tipoCredito= findViewById(R.id.rgTipoPrestamo);
        numeroCuota=findViewById(R.id.rgNumeroCuota);
        calcular=findViewById(R.id.btnCalcular);
        limpiar=findViewById(R.id.btnLimpiar);
        cuotaManejo=findViewById(R.id.cbCuotaManejo);
        vivienda=findViewById(R.id.rbVivienda);
        libreInversion=findViewById(R.id.rbLibreInversion);
        vehiculo=findViewById(R.id.rbVehiculo);
        educacion=findViewById(R.id.rbEducacion);
        rb12=findViewById(R.id.rb12cuotas);
        rb24=findViewById(R.id.rb24cuotas);
        rb36=findViewById(R.id.rb36cuotas);
        deudaTotal=findViewById(R.id.txtTotalDeuda);
        valorCuotaCredito=findViewById(R.id.txtValorCuota);


        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                identificacion.setText("");
                nombres.setText("");
                fecha.setText("");
                valorPrestamo.setText("");
                numeroCuota.clearCheck();
                tipoCredito.clearCheck();
                cuotaManejo.setChecked(false);
                identificacion.setEnabled(true);
                nombres.setEnabled(true);
                fecha.setEnabled(true);
                valorPrestamo.setEnabled(true);
                deudaTotal.setText("0");
                valorCuotaCredito.setText("0");
            }
        });


        calcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(identificacion.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Ingrese una identificación",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(nombres.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Ingrese su nombre",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(fecha.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Ingrese una fecha",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(valorPrestamo.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Ingrese un valor del prestamo",Toast.LENGTH_SHORT).show();
            return;
        }


        if(vivienda.isChecked()){
            interes=0.01;
        }
        else if(libreInversion.isChecked()){
            interes=0.02;
        }
        else if(vehiculo.isChecked()){
            interes=0.015;
        }
        else if(educacion.isChecked()){
            interes=0.012;
        }
        else{
            Toast.makeText(getApplicationContext(),"Elija un tipo de prestamo",Toast.LENGTH_SHORT).show();
            return;
        }

        if(rb12.isChecked()){
            cuotas=12;
        }
        else if(rb24.isChecked()){
            cuotas=24;
        }
        else if(rb36.isChecked()){
            cuotas=36;
        }
        else{
            Toast.makeText(getApplicationContext(),"Elija un número de cuotas",Toast.LENGTH_SHORT).show();
            return;
        }

        if(cuotaManejo.isChecked()){
            valorCuotaManejo=10000;
        }else{
            valorCuotaManejo=0;
        }
        DecimalFormat numerofinal = new DecimalFormat("$###,###,###.##");
        deudaFinal=Double.parseDouble(valorPrestamo.getText().toString())+(Double.parseDouble(valorPrestamo.getText().toString())*interes*cuotas);
        valorCuotaFinal=(deudaFinal/cuotas)+valorCuotaManejo;
        deudaTotal.setText(numerofinal.format(deudaFinal));
        valorCuotaCredito.setText(numerofinal.format(valorCuotaFinal));


        identificacion.setEnabled(false);
        nombres.setEnabled(false);
        fecha.setEnabled(false);
        valorPrestamo.setEnabled(false);





    }
}
