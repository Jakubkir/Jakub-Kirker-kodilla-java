package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchngFlight {

    public Map<String, Boolean> airportMap() {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Balice", true);
        flightMap.put("Warszawa", true);
        flightMap.put("Katowice", true);
        flightMap.put("Wrocław", true);
        flightMap.put("Moskwa", false);
        return flightMap;
    }

    public void findFilght(Flight flight) throws RouteNotFoundException {
        if (flight.getArrivalAirport().equals(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
        if ((airportMap().containsKey(flight.getArrivalAirport())) &&
                (airportMap().containsKey(flight.getDepartureAirport()))
                && (airportMap().get(flight.getArrivalAirport()))) {
            System.out.println("You cant fly to:" + flight.getArrivalAirport() + "from" + flight.getDepartureAirport());
        } else {
            System.out.println("Find different directions");
            throw new RouteNotFoundException();
        }
    }
}

