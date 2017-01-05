package com.esamdevelopers.gamej.crafterapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    private String titulo;
    private String descripcion;

    private static final String ARG_TITLE = "titulo";
    private static final String ARG_DESCRIPTION = "descripcion";

    public static BaseFragment getInstance(String titulo, String descripcion){
        BaseFragment fragment = new BaseFragment();

        Bundle arg = new Bundle();
        arg.putString(ARG_TITLE, titulo);
        arg.putString(ARG_DESCRIPTION, descripcion);
        fragment.setArguments(arg);

        return fragment;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arg = getArguments();
        if (arg != null){
            titulo = arg.getString(ARG_TITLE);
            descripcion = arg.getString(ARG_DESCRIPTION);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((TextView) view.findViewById(R.id.titulo_base)).setText(this.titulo);
        ((TextView) view.findViewById(R.id.description_base)).setText(this.descripcion);
    }

}