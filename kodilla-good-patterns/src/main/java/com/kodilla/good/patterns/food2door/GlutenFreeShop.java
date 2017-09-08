package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Provider {
    @Override
    public boolean process(DistributionInfo d) {
        String product = d.getProduct();

        if(product.contains("gluten free")) {
            return true;
        }else {
            return false;
        }
    }
}
