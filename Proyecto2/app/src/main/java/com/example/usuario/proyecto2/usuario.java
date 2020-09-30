package com.example.usuario.proyecto2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class usuario extends AppCompatActivity implements View.OnClickListener {

    EditText nombreUsuario, contraseñaUsuario, emailUsuario;
    RadioButton administrador, usuario;
    Button agregarUsuario, buscarUsuario,actualizarUsuario, eliminarUsuario, listarUsuario;
    ConexionBD SQLdb = new ConexionBD(this,"DBbiblioteca",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        nombreUsuario=findViewById(R.id.etNombreUsuario);
        contraseñaUsuario=findViewById(R.id.etContraseñaUsuario);
        emailUsuario=findViewById(R.id.etEmailUsuario);

        administrador=findViewById(R.id.rbAdministrador);
        usuario=findViewById(R.id.rbUsuario);

        agregarUsuario=findViewById(R.id.btnAgregarUsuario);
        buscarUsuario= findViewById(R.id.btnBuscarUsuario);
        actualizarUsuario=findViewById(R.id.btnActualizarUsuario);
        eliminarUsuario= findViewById(R.id.btnEliminarUsuario);
        listarUsuario=findViewById(R.id.btnListarUsuario);
        agregarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(emailUsuario.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Email sin diligenciar",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(nombreUsuario.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Nombre sin diligenciar",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(contraseñaUsuario.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Clave sin diligenciar",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!administrador.isChecked() && !usuario.isChecked()){
                    Toast.makeText(getApplicationContext(),"Rol sin diligenciar",Toast.LENGTH_SHORT).show();
                    return;
                }
                //creamos objeto para manipular datos
                SQLiteDatabase db = SQLdb.getReadableDatabase();
                String comando= "select email from usuario where email='"+emailUsuario.getText().toString()+"'";
                Cursor tabla = db.rawQuery(comando,null);

                if(tabla.moveToFirst()){
                    Toast.makeText(getApplicationContext(),"Error, email ya registrado",Toast.LENGTH_SHORT).show();
                }
                else{
                    db = SQLdb.getWritableDatabase();

                    try
                    {
                        //Contenedor de datos del contacto
                        ContentValues contenidoInsertar = new ContentValues();
                        contenidoInsertar.put("email",emailUsuario.getText().toString().trim());
                        contenidoInsertar.put("nombre",nombreUsuario.getText().toString().trim());
                        contenidoInsertar.put("clave",contraseñaUsuario.getText().toString().trim());
                        if(administrador.isChecked()){
                            contenidoInsertar.put("rol","1");
                        }
                        else{
                            contenidoInsertar.put("rol","0");
                        }
                        db.insert("usuario",null,contenidoInsertar);
                        db.close();
                        Toast.makeText(getApplicationContext(),"usuario agregado correctamente...",Toast.LENGTH_SHORT).show();
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(getApplicationContext(),"Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        administrador.setOnClickListener(this);
        usuario.setOnClickListener(this);

        emailUsuario.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if((!emailUsuario.getText().toString().isEmpty() && !nombreUsuario.getText().toString().isEmpty() && !contraseñaUsuario.getText().toString().isEmpty())&& (administrador.isChecked() || usuario.isChecked())){
                    agregarUsuario.setEnabled(true);
                }
                else{
                    agregarUsuario.setEnabled(false);
                }
            }
        });

        nombreUsuario.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if((!emailUsuario.getText().toString().isEmpty() && !nombreUsuario.getText().toString().isEmpty() && !contraseñaUsuario.getText().toString().isEmpty())&& (administrador.isChecked() || usuario.isChecked())){
                    agregarUsuario.setEnabled(true);
                }
                else{
                    agregarUsuario.setEnabled(false);
                }
            }
        });

        contraseñaUsuario.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if((!emailUsuario.getText().toString().isEmpty() && !nombreUsuario.getText().toString().isEmpty() && !contraseñaUsuario.getText().toString().isEmpty())&& (administrador.isChecked() || usuario.isChecked())){
                    agregarUsuario.setEnabled(true);
                }
                else{
                    agregarUsuario.setEnabled(false);
                }
            }
        });

    }


    @Override
    public void onClick(View view) {
        if((!emailUsuario.getText().toString().isEmpty() && !nombreUsuario.getText().toString().isEmpty() && !contraseñaUsuario.getText().toString().isEmpty())&& (administrador.isChecked() || usuario.isChecked())){
            agregarUsuario.setEnabled(true);
        }
        else{
            agregarUsuario.setEnabled(false);
        }
    }
}
