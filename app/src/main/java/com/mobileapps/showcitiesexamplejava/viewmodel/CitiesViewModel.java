package com.mobileapps.showcitiesexamplejava.viewmodel;




import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mobileapps.showcitiesexamplejava.repository.City;
import com.mobileapps.showcitiesexamplejava.repository.network.Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class CitiesViewModel extends ViewModel
{
    private MutableLiveData<List<City>> citiesList;

    public LiveData<List<City>> getCities()
    {
        if (citiesList == null)
        {
            citiesList = new MutableLiveData<List<City>>();
            loadCities();
        }

        return citiesList;

    }

    private void loadCities() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<City>> call = api.getCities();
        call.enqueue(new Callback<List<City>>() {
            @Override
            public void onResponse(Call<List<City>> call, Response<List<City>> response) {
                citiesList.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<City>> call, Throwable t) {

            }
        });
    }

}
