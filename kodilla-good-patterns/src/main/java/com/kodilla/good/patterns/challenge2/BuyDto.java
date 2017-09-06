package com.kodilla.good.patterns.challenge2;

public class BuyDto {
    private User user;
    private Item item;
    private boolean isBought;

    public BuyDto(User user, Item item, boolean isBought) {
        this.user = user;
        this.item = item;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public boolean isBought() {
        return isBought;
    }
}
