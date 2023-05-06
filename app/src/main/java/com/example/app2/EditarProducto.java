package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditarProducto extends AppCompatActivity {

    Button guardarEdicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editarproducto);

        guardarEdicion = findViewById(R.id.guardarEdicion);
        guardarEdicion.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(EditarProducto.this, Productos.class);
            startActivity(i);
            }
        });
    }
}