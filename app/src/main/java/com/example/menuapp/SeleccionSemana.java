package com.example.menuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SeleccionSemana extends Fragment {

    public SeleccionSemana() {
        // Required empty public constructor
    }

    public static SeleccionSemana newInstance(String param1, String param2) {
        SeleccionSemana fragmentSeleccionSemana = new SeleccionSemana();
        return fragmentSeleccionSemana;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seleccion_semana, container, false);
    }
}