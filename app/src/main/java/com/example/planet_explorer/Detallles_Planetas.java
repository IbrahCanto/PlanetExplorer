package com.example.planet_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detallles_Planetas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallles_planetas);
        
        TextView nombre = (TextView)  findViewById(R.id.tbnombre);
        TextView descripcion = (TextView)  findViewById(R.id.tbdescripcion);
        
        Intent intent = getIntent();
        Bundle b = intent.getExtras();


        if(b!=null) {
            nombre.setText(b.getString("TIT"));
            descripcion.setText(b.getString("DET"));
        }


    }
}