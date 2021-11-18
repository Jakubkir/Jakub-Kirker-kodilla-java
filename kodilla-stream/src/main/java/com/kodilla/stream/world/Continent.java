package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {



    private final String nameContinent;
    private final List<Country> listCountry = new ArrayList<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }
    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getListCountry() {
        return listCountry;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(nameContinent, continent.nameContinent) && Objects.equals(listCountry, continent.listCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameContinent, listCountry);
    }
    public void addCountry(Country country){
        listCountry.add(country);
    }



}
