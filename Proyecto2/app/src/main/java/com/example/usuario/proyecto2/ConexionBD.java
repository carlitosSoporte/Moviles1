package com.example.usuario.proyecto2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionBD extends SQLiteOpenHelper {

    String tblUsuario ="CREATE TABLE usuario(email text primary key, nombre text,clave text, rol text)";
    String tblMaterial="CREATE TABLE material(idMaterial text primary key,email text, nombre text,genero text)";
    public ConexionBD( Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tblUsuario);
        db.execSQL(tblMaterial);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE usuario");
            db.execSQL(tblUsuario);
            db.execSQL("DROP TABLE material");
            db.execSQL(tblMaterial);
    }
}
