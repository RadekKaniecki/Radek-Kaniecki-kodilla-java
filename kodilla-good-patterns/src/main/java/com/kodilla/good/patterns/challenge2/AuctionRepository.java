package com.kodilla.good.patterns.challenge2;

public interface AuctionRepository {
    void createAuction(User user, Item item, String type);
}
