package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Provider {
    @Override
    public boolean process(DistributionInfo d) {
        double totalPrice = d.getPrice() * d.getAmount();
        String provider = d.getProvider();

        if(provider.equalsIgnoreCase(getClass().getSimpleName()) &&
                totalPrice > 100.0) {
            return true;
        }else {
            return false;
        }
    }
}
