package com.esamdevelopers.gamej.crafterapp.holders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.esamdevelopers.gamej.crafterapp.CapuchinoActivity;
import com.esamdevelopers.gamej.crafterapp.R;

/**
 * Created by gamej on 6/1/2017.
 */

public class MainHolder extends RecyclerView.ViewHolder{

    public ImageView imagen;
    public TextView title, description, price;
    public Context context;

    public MainHolder(View itemView) {
        super(itemView);
        imagen = (ImageView) itemView.findViewById(R.id.img_description);
        title = (TextView) itemView.findViewById(R.id.title_item_card);
        description = (TextView) itemView.findViewById(R.id.description_item_card);
        price = (TextView) itemView.findViewById(R.id.price);
        context = itemView.getContext();
        itemView.setClickable(true);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (getAdapterPosition()){
                    case 0:
                        Intent intent = new Intent(context, CapuchinoActivity.class);
                        context.startActivity(intent);
                        break;
                }
            }
        });
    }
}