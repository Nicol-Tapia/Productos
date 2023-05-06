package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import DB.DbPoductos;

public class Registro extends AppCompatActivity {
    EditText nombre, Cantidad, Precio, lugar;
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = findViewById(R.id.NombreProducto);
        Cantidad = findViewById(R.id.Cantidad);
        Precio = findViewById(R.id.Precio);
        lugar = findViewById(R.id.LugarCompra);


        guardar = findViewById(R.id.guardarCambios);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbPoductos dbPoductos = new DbPoductos(Registro.this);
                long id = dbPoductos.insertarProducto(nombre.getText().toString(), Cantidad.getText().toString(), Precio.getText().toString(), lugar.getText().toString());
                if(id > 0){
                    Toast.makeText(Registro.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                    limpiar();
                }else{
                    Toast.makeText(Registro.this, "ERROS AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();
                }

                Intent i = new Intent(Registro.this, Productos.class);
                startActivity(i);
            }
        });
    }
    private void limpiar(){
        nombre.setText("");
        Cantidad.setText("");
        Precio.setText("");
        lugar.setText("");
    }
}