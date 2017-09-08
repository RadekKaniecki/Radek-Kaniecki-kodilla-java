package com.kodilla.good.patterns.flight;

public class FlightConnection {
    private String departureCity;
    private String arrivalCity;

    public FlightConnection(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightConnection that = (FlightConnection) o;

        if (!departureCity.equals(that.departureCity)) return false;
        return arrivalCity.equals(that.arrivalCity);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FlightConnection{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }
}
