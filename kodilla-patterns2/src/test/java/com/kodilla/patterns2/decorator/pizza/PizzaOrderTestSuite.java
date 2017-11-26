package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("You have ordered standard pizza", description);
    }

    @Test
    public void testBasicPizzaWithOnionAndTomatoGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Onion(pizzaOrder);
        pizzaOrder = new Tomato(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), theCost);
    }

    @Test
    public void testBasicPizzaWithOnionAndTomatoGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Onion(pizzaOrder);
        pizzaOrder = new Tomato(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("You have ordered standard pizza + onion + tomato", description);
    }

    @Test
    public void testBasicPizzaWithChickendAnFastDeliveryGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Chicken(pizzaOrder);
        pizzaOrder = new FastDelivery(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testBasicPizzaWithChickendAnFastDeliveryGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Chicken(pizzaOrder);
        pizzaOrder = new FastDelivery(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("You have ordered standard pizza + chicken with fast delivery", description);
    }
}
