package com.example.holy_app.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.holy_app.R;
import com.example.holy_app.EucaristiaAdapter;
import com.example.holy_app.modelo.Eucaristia;

import java.util.ArrayList;

public class EucaristiaFragment extends Fragment {

    RecyclerView contenedorEucaristia;
    public EucaristiaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eucaristia, container, false);
        contenedorEucaristia = view.findViewById(R.id.contenedorEucaristia);
        LinearLayoutManager linearLayout = new LinearLayoutManager(getContext());
        linearLayout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedorEucaristia.setLayoutManager(linearLayout);
        EucaristiaAdapter eucaristiaAdapter = new EucaristiaAdapter(getActivity(), null,R.id.card);
        return view;
    }
    //Objetos propios
    public ArrayList<Eucaristia> cargarDato(){
        ArrayList<Eucaristia> Eucaristias = new ArrayList<>();
        Eucaristias.add(new Eucaristia("https://www.eluniversal.com.co/binrepository/1050x700/0c0/0d0/none/13704/TNTI/image_content_3023679_20200427114131.jpg","Don Pedro","Víveres","Made in China","Av 0",0,0,"3168281730"));
        Eucaristias.add(new Eucaristia("https://www.dominoprofesional.com/wp-content/uploads/2019/02/Los-nombres-de-tiendas-de-barrio-que-todos-en-Guatemala-han-visto-alguna-vez-885x500.jpg","Ateca","Restaurante","8:00-9:00","Av 10",0,0,"5698794"));
        Eucaristias.add(new Eucaristia("https://blog.oxfamintermon.org/wp-content/uploads/2014/11/tienda-solidaria-comercio-justo-oxfam-intermon.jpg","Varimanía","TiendaDetodito","Duran hasta que se acaban","Av 10",0,0,"5698794"));
        return Eucaristias;
    }
    //Cargar de Firebase
    public ArrayList<Eucaristia> cargarDatosFireBase(){
        return null;
    }
}