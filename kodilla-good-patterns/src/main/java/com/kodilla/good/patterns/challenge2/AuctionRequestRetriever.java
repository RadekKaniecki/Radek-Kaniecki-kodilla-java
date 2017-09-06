package com.kodilla.good.patterns.challenge2;

public class AuctionRequestRetriever {
    public AuctionRequest retrieve() {
        User user = new User("Radek", "Kaniecki", "radoslawkaniecki@gmail.com");
        Item item = new Item("Laptop", 1500.99);
        String type = "BUY";

        return new AuctionRequest(user, item, type);
    }
}
