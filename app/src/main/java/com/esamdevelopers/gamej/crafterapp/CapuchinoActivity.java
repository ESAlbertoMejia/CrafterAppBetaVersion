package com.esamdevelopers.gamej.crafterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class CapuchinoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capuchino);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null)
            toolbar.setTitle(getString(R.string.title_tb_capuchino));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        TextView ratingResult = (TextView) findViewById(R.id.result_rating);
        Button shop = (Button) findViewById(R.id.shop_capuchino);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CapuchinoActivity.this, "Ha comprado este articulo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}