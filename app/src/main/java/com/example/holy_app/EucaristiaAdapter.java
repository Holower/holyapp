package com.example.holy_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.holy_app.modelo.Eucaristia;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class EucaristiaAdapter extends RecyclerView.Adapter<EucaristiaAdapter.EucaristiaViewHolder> {
    private Context context;
    private ArrayList<Eucaristia> Eucaristias;
    private int cursor;

    public EucaristiaAdapter(Context context, ArrayList<Eucaristia> Eucaristias, int cursor) {
        this.context = context;
        this.Eucaristias = Eucaristias;
        this.cursor = cursor;
    }

    @NonNull
    @Override
    public EucaristiaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new EucaristiaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EucaristiaViewHolder holder, int position) {
        Picasso.get().load(Eucaristias.get(position).getFoto()).into(holder.foto);
        holder.nombre.setText(Eucaristias.get(position).getNombre());
        holder.descripcion.setText(Eucaristias.get(position).getDescripcion());
        holder.frase.setText(Eucaristias.get(position).getFrase());
    }

    @Override
    public int getItemCount() {
        return 0;
    }



    class EucaristiaViewHolder extends RecyclerView.ViewHolder{
        ImageView foto, localizacion, telefono;
        TextView nombre, descripcion, frase;

        public EucaristiaViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.foto);
            localizacion = itemView.findViewById(R.id.localizacion);
            telefono = itemView.findViewById(R.id.telefono);
            nombre = itemView.findViewById(R.id.nombre);
            descripcion = itemView.findViewById(R.id.descripcion);
            frase = itemView.findViewById(R.id.frase);

        }
    }

}
