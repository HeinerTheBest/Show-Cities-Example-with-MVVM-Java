package com.mobileapps.showcitiesexamplejava.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mobileapps.showcitiesexamplejava.R;
import com.mobileapps.showcitiesexamplejava.adapter.CitiesAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CitiesAdapter citiesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvCities);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
