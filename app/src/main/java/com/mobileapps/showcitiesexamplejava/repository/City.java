package com.mobileapps.showcitiesexamplejava.repository;

public class City
{
    private String country;
    private String name;
    private Long   _id;
    private Coord  coord;

    public City(String country, String name, Long _id, Coord coord) {
        this.country = country;
        this.name = name;
        this._id = _id;
        this.coord = coord;
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

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}

