package com.kodilla.good.patterns.findFlights;

public class Aplications {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFromPrint("Warszawa");
        flightFinder.findFlightsToPrint("Kraków");
        flightFinder.findFlightWithChange("Rzeszów", "Wrocław");

    }
}
