package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import DB.DBAyudante;

public class Productos extends AppCompatActivity {

    Button Productos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productos);

        Productos =findViewById(R.id.Agregar);
        Productos.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                DBAyudante dbayudante = new DBAyudante(Productos.this);
                SQLiteDatabase db = dbayudante.getReadableDatabase();
                if (db != null) {
                    Toast.makeText(Productos.this, "BASE DE DATOS CREADA", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Productos.this, "ERROR AL CREAR LA BASE DE DATOS", Toast.LENGTH_LONG).show();
                }
                Intent i = new Intent(Productos.this, Registro.class);
                startActivity(i);
            }

        });
    }

}
