package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void estGetPeopleQuantity(){
        //Given
        //Create country
        Country country1 = new Country("Poland",new BigDecimal(1));
        Country country2 = new Country("England",new BigDecimal(1));
        Country country3 = new Country("Spain",new BigDecimal(1));
        Country country4 = new Country("China",new BigDecimal(1));
        Country country5 = new Country("Japan",new BigDecimal(1));
        Country country6 = new Country("RPA",new BigDecimal(1));
        Country country7 = new Country("Egipt",new BigDecimal(1));
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");

        //Create relations for Europe
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        //Create relations for Asia
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        //Create relations for Africa
        continent3.addCountry(country6);
        continent3.addCountry(country7);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal all = world.getPeopleQuantityAll();

        //Then
        assertEquals(new BigDecimal(7),all);

    }

}

