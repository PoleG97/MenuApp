package com.example.menuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MostrarMenu extends Fragment {

    public MostrarMenu() {
        // Required empty public constructor
    }

    public static MostrarMenu newInstance(String param1, String param2) {
        MostrarMenu fragmentMostrarMenu = new MostrarMenu();
        return fragmentMostrarMenu;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mostrar_menu, container, false);
    }
}