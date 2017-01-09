package com.esamdevelopers.gamej.crafterapp.adaptador;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esamdevelopers.gamej.crafterapp.R;
import com.esamdevelopers.gamej.crafterapp.holders.MainHolder;

/**
 * Created by gamej on 6/1/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainHolder> {

    Context context;
    LayoutInflater inflater;
    int[] imagenes = {
            R.drawable.capuchino,
            R.drawable.crepa,
            R.drawable.pie
    };
    String[] titles = {
            "Capuchino", "Crepa", "Pie"
    };
    String[] descriptions = {
            "Bebida italiana preparada con café expreso y leche montada con el vapor para crear la espuma (en ocasiones lleva cacao o canela en polvo).",
            "Se denomina crepe, crepa, o crep (del francés crêpe, y éste a su vez del latín crispus, ‘crespo’) a la receta europea de origen francés bretón, hecha fundamentalmente de harina de trigo. Se sirve habitualmente como base de un plato o postre, aplicándole todo tipo de ingredientes dulces o salados.",
            "Postre hecho a base de requesón o queso crema o queso quark, azúcar y algunas veces otros ingredientes, tales como: huevos, crema de leche, frutas o bayas (fresas, moras, zarzamoras, mora azul, arándanos e, inclusive, limones o naranjas, etc.)."
    };
    String[] prices = {
            "$ 3.99", "$ 4.99", "$ 1.99"
    };

    public MainAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_recycler, parent, false);
        MainHolder holder = new MainHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MainHolder holder, int position) {
        holder.imagen.setImageResource(imagenes[position]);
        holder.title.setText(titles[position]);
        holder.description.setText(descriptions[position]);
        holder.price.setText(prices[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}