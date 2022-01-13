package com.kodilla.good.patterns.findFlights;

import java.util.HashSet;
import java.util.Set;

public class FlightDataBase {
    private static final String WAW = "Warszawa";
    private static final String KRK = "Kraków";
    private static final String GDA = "Gdańsk";
    private static final String WRO = "Wrocław";
    private static final String LOD = "Lodza";
    private static final String RZE = "Rzeszów";

    private static Set<Flight> flightSet = new HashSet<>();

    static {
        flightSet.add(new Flight(WAW, KRK));
        flightSet.add(new Flight(WAW, GDA));
        flightSet.add(new Flight(WAW, WRO));
        flightSet.add(new Flight(WAW, LOD));
        flightSet.add(new Flight(WAW, RZE));
        flightSet.add(new Flight(KRK, GDA));
        flightSet.add(new Flight(KRK, WRO));
        flightSet.add(new Flight(KRK, LOD));
        flightSet.add(new Flight(KRK, RZE));
        flightSet.add(new Flight(GDA, WRO));
        flightSet.add(new Flight(GDA, LOD));
        flightSet.add(new Flight(GDA, RZE));
        flightSet.add(new Flight(LOD, RZE));
        flightSet.add(new Flight(LOD, KRK));
        flightSet.add(new Flight(LOD, GDA));
        flightSet.add(new Flight(RZE, GDA));
        flightSet.add(new Flight(RZE, WAW));
        flightSet.add(new Flight(RZE, KRK));

    }

    public static Set<Flight> accessToSet() {
        return new HashSet<>(flightSet);
    }

    @Override
    public String toString() {
        return "FlightDataBase{" +
                "flightSet=+" + flightSet +
                '}';
    }
}
