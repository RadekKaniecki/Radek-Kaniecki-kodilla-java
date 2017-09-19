package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .roll("regular")
                .sauce("standard")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("mushrooms")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientAmount = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, ingredientAmount);
    }
}
