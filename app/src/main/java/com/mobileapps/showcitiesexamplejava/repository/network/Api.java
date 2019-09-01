package com.mobileapps.showcitiesexamplejava.repository.network;

import com.mobileapps.showcitiesexamplejava.repository.City;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api
{
    public String BASE_URL = "https://raw.githubusercontent.com/lutangar/cities.json/master/";

    @GET("cities.json")
    Call<List<City>> getCities();
}
