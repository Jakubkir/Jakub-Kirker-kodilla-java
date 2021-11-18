package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {

    private final String nameCountry;
    private final BigDecimal getPeopleQuantity;

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getGetPeopleQuantity() {
        return getPeopleQuantity;
    }

    public Country(String nameCountry, BigDecimal getPeopleQuantity) {
        this.nameCountry = nameCountry;
        this.getPeopleQuantity = getPeopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameCountry, country.nameCountry) && Objects.equals(getPeopleQuantity, country.getPeopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCountry, getPeopleQuantity);
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", getPeopleQuantity=" + getPeopleQuantity +
                '}';
    }
}
