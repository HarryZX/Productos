package com.example.a21_pc25.productos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Principal extends AppCompatActivity {
    //Declaramos las variables
    private String[] PAISES = {"El Salvador","Honduras","Guatemala","Nicaragua","Costa Rica","Panama"};
    private ArrayAdapter<String> adaptador;
    private AutoCompleteTextView txtPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Inicializacion de variables
        this.txtPaises = findViewById(R.id.txtPaises);
        this.adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,this.PAISES);
        //configuramos el AutocompleteTextView
        this.txtPaises.setThreshold(3);
        this.txtPaises.setAdapter(this.adaptador);
    }
}
