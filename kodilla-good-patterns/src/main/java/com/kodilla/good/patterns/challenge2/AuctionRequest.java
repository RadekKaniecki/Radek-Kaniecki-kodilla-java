package com.kodilla.good.patterns.challenge2;

public class AuctionRequest {
    private User user;
    private Item item;
    private String type;

    public AuctionRequest(User user, Item item, String type) {
        this.user = user;
        this.item = item;
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public String getType() {
        return type;
    }
}
