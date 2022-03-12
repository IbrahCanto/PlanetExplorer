package com.example.planet_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listafrut);

        String[] nombres = {
                "Sol",
                "Estrellas",
                "Mercurio",
                "Venus",
                "Tierra",
                "Marte",
                "Jupiter",
                "Saturno",
                "Urano",
                "Neptuno",
                "Plutón"
        };
        String[] descripcion = {
                "Es una estrella 1",
                "Es una estrella 2",
                "Es un planeta 1",
                "Es un planeta 2",
                "Es un planeta 3",
                "Es un planeta 4",
                "Es un planeta 5",
                "Es un planeta 6",
                "Es un planeta 7",
                "Es un planeta 8",
                "Es un planeta 9"
        };
        Integer[] idimagenes = {
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana,
                R.drawable.manzana
        };
        AdapterListPlanet adaptador = new AdapterListPlanet(this, nombres, descripcion, idimagenes);

        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent visorDetalles = new Intent(view.getContext(), Detallles_Planetas.class);
                        visorDetalles.putExtra("TIT", nombres[i]);
                        visorDetalles.putExtra("DET", descripcion[i]);


                        startActivity(visorDetalles);

                    }
                });
                //Toast.makeText(getApplicationContext(),"Seleccionaste : "+nombres[i],Toast.LENGTH_LONG).show();


                //Intent intent = new Intent(getApplicationContext(), Tierra.class);
                //startActivity(intent);
                //startActivity(intent);
            }
        });

        //listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
        //    @Override
        //    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        //        Toast.makeText(getApplicationContext(),"El costo es : "+precios[i],Toast.LENGTH_LONG).show();
        //        return true;
        //    }
        //});


    }
}