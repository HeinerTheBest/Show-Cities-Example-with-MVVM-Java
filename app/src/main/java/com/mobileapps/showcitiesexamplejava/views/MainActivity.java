package com.mobileapps.showcitiesexamplejava.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.mobileapps.showcitiesexamplejava.R;
import com.mobileapps.showcitiesexamplejava.adapter.CitiesAdapter;
import com.mobileapps.showcitiesexamplejava.repository.City;
import com.mobileapps.showcitiesexamplejava.viewmodel.CitiesViewModel;

import java.util.List;

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

        CitiesViewModel model = ViewModelProviders.of(this).get(CitiesViewModel.class);
        model.getCities().observe(this, new Observer<List<City>>() {
            @Override
            public void onChanged(List<City> cities) {
                citiesAdapter = new CitiesAdapter(cities);
                recyclerView.setAdapter(citiesAdapter);
            }
        });


    }
}
