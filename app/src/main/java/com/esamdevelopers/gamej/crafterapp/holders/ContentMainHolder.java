package com.esamdevelopers.gamej.crafterapp.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.esamdevelopers.gamej.crafterapp.R;

/**
 * Created by gamej on 6/1/2017.
 */

public class ContentMainHolder extends RecyclerView.ViewHolder {

    ImageView img_description;
    TextView title, description;

    public ContentMainHolder(View itemView) {
        super(itemView);
        img_description = (ImageView) itemView.findViewById(R.id.img_description);
        title = (TextView) itemView.findViewById(R.id.title_item_card);
        description = (TextView) itemView.findViewById(R.id.description_item_card);
    }
}