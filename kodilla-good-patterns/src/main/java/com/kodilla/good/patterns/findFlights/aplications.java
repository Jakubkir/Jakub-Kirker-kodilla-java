package com.kodilla.good.patterns.findFlights;

public class aplications {

    public static void main(String[] args) {

        flightFinder flightFinder = new flightFinder();
        flightFinder.findFlightsFromPrint("Warszawa");
        flightFinder.findFlightsToPrint("Kraków");
        flightFinder.findFlightWithChange("Rzeszów", "Wrocław");

    }
}
