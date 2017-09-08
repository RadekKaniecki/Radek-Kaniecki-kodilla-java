package com.kodilla.good.patterns.flight;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightProcessor {
    private final Set<FlightConnection> flights;

    public FlightProcessor() {
        this.flights = new HashSet<>();
    }

    public void addFlightConnection(FlightConnection fc) {
        this.flights.add(fc);
    }

    public List getFlightsFromCity(String departureCity) {
        if(checkDepartureCity(departureCity)) {
            List departureCityFlights = flights.stream()
                    .filter(fc -> fc.getDepartureCity().equalsIgnoreCase(departureCity))
                    .map(fc -> fc.getArrivalCity())
                    .collect(Collectors.toList());

            return departureCityFlights;
        }
        return null;
    }

    public List getFlightsToCity(String arrivalCity) {
        if(checkArrivalCity(arrivalCity)) {
            List<String> arrivalCityFlights = flights.stream()
                    .filter(fc -> fc.getArrivalCity().equalsIgnoreCase(arrivalCity))
                    .map(fc -> fc.getDepartureCity())
                    .collect(Collectors.toList());

            return arrivalCityFlights;
        }
        return null;
    }

    public Set getFlightsThroughCity(String departureCity, String changeCity, String arrivalCity) {
        if(checkDepartureCity(departureCity) && checkArrivalCity(arrivalCity)) {
            Set<FlightConnection> departureToChange = flights.stream()
                    .filter(fc -> fc.getDepartureCity().equalsIgnoreCase(departureCity))
                    .filter(fc -> fc.getArrivalCity().equalsIgnoreCase(changeCity))
                    .collect(Collectors.toSet());

            Set<FlightConnection> changeToArrival = flights.stream()
                    .filter(fc -> fc.getDepartureCity().equalsIgnoreCase(changeCity))
                    .filter(fc -> fc.getArrivalCity().equalsIgnoreCase(arrivalCity))
                    .collect(Collectors.toSet());

            Set<FlightConnection> completeFlight = new HashSet<>();

            for(FlightConnection fc : departureToChange) {
                completeFlight.add(fc);
            }
            for(FlightConnection fc : changeToArrival) {
                completeFlight.add(fc);
            }

            return completeFlight;
        }
        return null;
    }

    private boolean checkDepartureCity(String departureCity) {
        for(FlightConnection fc : flights) {
            if(fc.getDepartureCity().equalsIgnoreCase(departureCity)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkArrivalCity(String arrivalCity) {
        for(FlightConnection fc : flights) {
            if(fc.getArrivalCity().equalsIgnoreCase(arrivalCity)) {
                return true;
            }
        }
        return false;
    }
}
