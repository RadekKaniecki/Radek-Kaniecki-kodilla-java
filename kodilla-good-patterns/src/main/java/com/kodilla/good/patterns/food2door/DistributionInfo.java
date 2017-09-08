package com.kodilla.good.patterns.food2door;

public class DistributionInfo {
    private String provider;
    private String product;
    private double amount;
    private double price;

    public DistributionInfo(String provider, String product, double amount, double price) {
        this.provider = provider;
        this.product = product;
        this.amount = amount;
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public String getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
