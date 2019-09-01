package com.mobileapps.showcitiesexamplejava.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mobileapps.showcitiesexamplejava.R;
import com.mobileapps.showcitiesexamplejava.repository.City;

import java.util.List;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.ViewHolder>
{
    List<City> cities;

    public CitiesAdapter(List<City> cities) {
        this.cities = cities;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        City city = cities.get(position);
        holder.tvCityName.setText(city.getName());
        holder.tvCountryName.setText(city.getCountry());
        holder.tvLat.setText(String.valueOf(city.getLat()));
        holder.tvLong.setText(String.valueOf(city.getLng()));
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvCityName;
        TextView tvCountryName;
        TextView tvLat;
        TextView tvLong;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCityName = itemView.findViewById(R.id.tvCityName);
            tvCountryName = itemView.findViewById(R.id.tvCountryName);
            tvLat = itemView.findViewById(R.id.tvLat);
            tvLong = itemView.findViewById(R.id.tvLong);
        }
    }
}
