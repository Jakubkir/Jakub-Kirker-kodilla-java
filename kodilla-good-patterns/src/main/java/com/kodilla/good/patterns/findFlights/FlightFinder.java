package com.kodilla.good.patterns.findFlights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    public List<Flight> finaAllFlightsFrom(String cityFrom) {
        List<Flight> flightsFrom = FlightDataBase.accessToSet().stream()
                .filter(flight -> flight.getFlightFrom().equals(cityFrom))
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public void findFlightsFromPrint(String cityFrom) {
        System.out.println("From " + cityFrom + " you can fly to ->" + finaAllFlightsFrom(cityFrom));
    }

    public List<Flight> finaAllFlightsTo(String cityTo) {
        List<Flight> flightsTo = FlightDataBase.accessToSet().stream()
                .filter(flight -> flight.getFlightTo().equals(cityTo))
                .collect(Collectors.toList());
        return flightsTo;
    }

    public void findFlightsToPrint(String cityTo) {
        System.out.println("To " + cityTo + " you can fly From <-" + finaAllFlightsFrom(cityTo));

    }

    public List<List<Flight>> findFlightWithChange(String cityFrom, String cityTo) {
        List<Flight> flightsFromCity = finaAllFlightsFrom(cityFrom);
        List<Flight> flightsToCity = finaAllFlightsTo(cityTo);

        List<List<Flight>> connections = new ArrayList<>();
        flightsFromCity.stream()
                .filter(flight -> flightsToCity.contains(new Flight(flight.getFlightTo(), cityTo)))
                .forEach(flight -> {
                    connections.add(List.of(
                            flight, new Flight(flight.getFlightTo(), cityTo)

                    ));
                });

        System.out.println(cityFrom + "->" + " You can fly by" + connections + "->" + cityTo);
        return connections;
    }
}
