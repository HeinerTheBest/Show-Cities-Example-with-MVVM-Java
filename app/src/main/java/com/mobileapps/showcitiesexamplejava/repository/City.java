package com.mobileapps.showcitiesexamplejava.repository;

public class City
{
    private String country;
    private String name;
    private String lat;
    private String lng;

    public City(String country, String name, String lat, String lng) {
        this.country = country;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }




}

