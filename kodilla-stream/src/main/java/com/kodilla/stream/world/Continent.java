package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    List<Country> countries;

    public Continent() {
        this.countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        this.countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
