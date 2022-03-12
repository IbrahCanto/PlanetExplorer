package com.example.planet_explorer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterListPlanet extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombres;
    private final String[] descripcion;
    private final Integer[] id_images;

    public AdapterListPlanet(Activity context, String[] nombres, String[] descripcion, Integer[] id_images) {
        super(context, R.layout.item,nombres);
        this.context = context;
        this.nombres = nombres;
        this.descripcion = descripcion;
        this.id_images = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,  null);

        TextView _nombre = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.imagen);

        _nombre.setText(nombres[position]);
        _descripcion.setText(descripcion[position]);
        _imagen.setImageResource(id_images[position]);

        return itemView;



        //return super.getView(position, convertView, parent);
    }
}
