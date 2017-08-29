package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent continentMock = mock(Continent.class);
        Country countryMock = mock(Country.class);

        List<Country> continent1 = new ArrayList<>();
        continent1.add(countryMock);
        continent1.add(countryMock);
        continent1.add(countryMock);
        continent1.add(countryMock);

        List<Country> continent2 = new ArrayList<>();
        continent2.add(countryMock);
        continent2.add(countryMock);
        continent2.add(countryMock);
        continent2.add(countryMock);

        List<Country> continent3 = new ArrayList<>();
        continent3.add(countryMock);
        continent3.add(countryMock);
        continent3.add(countryMock);
        continent3.add(countryMock);

        BigDecimal peopleAmount = new BigDecimal("100000000");

        when(continentMock.getCountries()).thenReturn(continent1);
        when(continentMock.getCountries()).thenReturn(continent2);
        when(continentMock.getCountries()).thenReturn(continent3);
        when(countryMock.getPeopleQuantity()).thenReturn(peopleAmount);

        //When
        BigDecimal totalPeopleAmount = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(1200000000, totalPeopleAmount);
    }
}
