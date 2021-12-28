package com.kodilla.good.patterns.findFlights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class flightFinder {
    public List<String> finaAllFlightsFrom(String cityFrom) {
        List<String> flightsFrom = flightDataBase.accessToSet().stream()
                .filter(flight -> flight.getFlightFrom().equals(cityFrom))
                .map(flight -> flight.getFlightTo())
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public void findFlightsFromPrint(String cityFrom) {
        System.out.println("From" + cityFrom + "you can fly to ->" + finaAllFlightsFrom(cityFrom));
    }

    public List<String> finaAllFlightsTo(String cityTo) {
        List<String> flightsTo = flightDataBase.accessToSet().stream()
                .filter(flight -> flight.getFlightTo().equals(cityTo))
                .map(flight -> flight.getFlightFrom())
                .collect(Collectors.toList());
        return flightsTo;
    }

    public void findFlightsToPrint(String cityTo) {
        System.out.println("To" + cityTo + "you can fly From <-" + finaAllFlightsFrom(cityTo));

    }
    public  void findFlightWithChange(String cityFrom, String cityTo) {
        List<String> flightsFromCity = finaAllFlightsFrom(cityFrom);
        List<String> flightsToCity = finaAllFlightsTo(cityTo);

        List<String> list = new ArrayList<>();
        for (String fly : flightsFromCity) {

            if (flightsToCity.contains(fly)) {
                list.add(fly);
            }
        }
        System.out.println(cityFrom + "->" + "You can fly by" + list + "->" + cityTo);
    }
}
