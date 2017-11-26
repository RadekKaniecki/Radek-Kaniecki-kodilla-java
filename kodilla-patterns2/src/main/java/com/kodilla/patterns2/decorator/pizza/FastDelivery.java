package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FastDelivery extends AbstractPizzaOrderDecorator {
    public FastDelivery(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with fast delivery";
    }
}
