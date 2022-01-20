package com.kodilla.exception.test;

public class RunFlight {

    public static void main(String[] args) {
        SearchngFlight searchngFlight = new SearchngFlight();
        Flight flight = new Flight("Balice", "Moskwa");

        try {
            searchngFlight.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not finding, error:" + e);
        } finally {
            System.out.println("Awley SEE YOU");
        }


    }
}
