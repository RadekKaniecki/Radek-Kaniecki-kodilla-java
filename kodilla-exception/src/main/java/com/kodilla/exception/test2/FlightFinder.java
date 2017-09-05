package com.kodilla.exception.test2;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        String city1 = "Wroclaw";
        String city2 = "Krakow";
        String city3 = "Warszawa";
        String city4 = "Gdansk";

        flights.put(city1, true);
        flights.put(city2, true);
        flights.put(city3, true);
        flights.put(city4, true);

        for(Map.Entry<String, Boolean> entry : flights.entrySet()) {
            if(flight.getArrivalAirport().equalsIgnoreCase(entry.getKey()) ||
                    flight.getDepartureAirport().equalsIgnoreCase(entry.getKey())) {
                System.out.println("Flight can be possible.");
            }
            throw new RouteNotFoundException("Cannot find airport.");
        }
    }
}
