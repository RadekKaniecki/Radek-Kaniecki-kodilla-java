package com.kodilla.exception.test2;

public class Main {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Wroclaw", "Krakow");
        Flight flight2 = new Flight("Rzeszow", "Katowice");

        try {
            flightFinder.findFlight(flight1);
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Cannot find airport on the map.");
        }
    }
}
