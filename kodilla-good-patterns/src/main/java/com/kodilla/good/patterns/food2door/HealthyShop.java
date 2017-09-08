package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Provider {
    @Override
    public boolean process(DistributionInfo d) {
        double amount = d.getAmount();

        if(amount <= 20) {
            return true;
        }else {
            return false;
        }
    }
}
