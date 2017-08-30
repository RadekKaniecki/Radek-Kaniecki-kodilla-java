package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        //Creating countries
        Country poland = new Country(new BigDecimal("38000000"));
        Country germany = new Country(new BigDecimal("82000000"));
        Country spain = new Country(new BigDecimal("46000000"));
        Country brasil = new Country(new BigDecimal("207000000"));
        Country argentina = new Country(new BigDecimal("43000000"));
        Country peru = new Country(new BigDecimal("32000000"));

        //Creating continents
        Continent europe = new Continent();
        Continent southAmerica = new Continent();

        //Adding countries to continents
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);
        southAmerica.addCountry(brasil);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(peru);

        //Adding continents to world
        world.addContient(europe);
        world.addContient(southAmerica);

        //When
        BigDecimal totalPeopleAmount = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("448000000"), totalPeopleAmount);
    }
}
