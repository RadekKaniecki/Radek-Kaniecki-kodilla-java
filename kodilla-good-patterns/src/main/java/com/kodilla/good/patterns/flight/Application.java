package com.kodilla.good.patterns.flight;

import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightProcessor flightProcessor = new FlightProcessor();
        flightProcessor.addFlightConnection(new FlightConnection("Wroclaw", "Krakow"));
        flightProcessor.addFlightConnection(new FlightConnection("Wroclaw", "Warszawa"));
        flightProcessor.addFlightConnection(new FlightConnection("Wroclaw", "Gdansk"));
        flightProcessor.addFlightConnection(new FlightConnection("Wroclaw", "Poznan"));
        flightProcessor.addFlightConnection(new FlightConnection("Wroclaw", "Rzeszow"));
        flightProcessor.addFlightConnection(new FlightConnection("Wroclaw", "Szczecin"));


        flightProcessor.addFlightConnection(new FlightConnection("Krakow", "Szczecin"));
        flightProcessor.addFlightConnection(new FlightConnection("Krakow", "Radom"));
        flightProcessor.addFlightConnection(new FlightConnection("Krakow", "Rzeszow"));
        flightProcessor.addFlightConnection(new FlightConnection("Krakow", "Warszawa"));
        flightProcessor.addFlightConnection(new FlightConnection("Krakow", "Gdansk"));
        flightProcessor.addFlightConnection(new FlightConnection("Krakow", "Poznan"));

        flightProcessor.addFlightConnection(new FlightConnection("Warszawa", "Krakow"));
        flightProcessor.addFlightConnection(new FlightConnection("Warszawa", "Wroclaw"));
        flightProcessor.addFlightConnection(new FlightConnection("Warszawa", "Gdansk"));
        flightProcessor.addFlightConnection(new FlightConnection("Warszawa", "Rzeszpw"));
        flightProcessor.addFlightConnection(new FlightConnection("Warszawa", "Poznan"));
        flightProcessor.addFlightConnection(new FlightConnection("Warszawa", "Radom"));

        List<String> departureCity = flightProcessor.getFlightsFromCity("Wroclaw");
        System.out.println("All available flights from Wroclaw are to:");
        for(String city : departureCity) {
            System.out.println(city);
        }

        System.out.println("=========================");

        List<String> arrivalCity = flightProcessor.getFlightsToCity("Warszawa");
        System.out.println("All available flights to Warszawa are from:");
        for(String city : arrivalCity) {
            System.out.println(city);
        }

        System.out.println("=========================");

        Set<FlightConnection> flightConnectionSet = flightProcessor.getFlightsThroughCity("Wroclaw",
                                                                "Warszawa", "Krakow");
        for(FlightConnection fc : flightConnectionSet) {
            System.out.println(fc);
        }





    }
}
