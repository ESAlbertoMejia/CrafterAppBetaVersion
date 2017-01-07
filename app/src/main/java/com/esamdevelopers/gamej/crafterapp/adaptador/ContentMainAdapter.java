package com.esamdevelopers.gamej.crafterapp.adaptador;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.esamdevelopers.gamej.crafterapp.holders.ContentMainHolder;

/**
 * Created by gamej on 6/1/2017.
 */

public class ContentMainAdapter extends RecyclerView.Adapter<ContentMainHolder> {

    Context context;
    LayoutInflater inflater;
    int[] imagenes = {};
    String[] titles = {};
    String[] descriptions = {};

    @Override
    public ContentMainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ContentMainHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}