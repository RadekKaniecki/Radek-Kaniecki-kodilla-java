package com.kodilla.good.patterns.challenge2;

public class TextFileRepository implements AuctionRepository {
    @Override
    public void createAuction(User user, Item item, String type) {
        System.out.println("Saving information as an text file:" +
                "\nUser - " + user +
                "\nItem - " + item +
                "\nTransaction type - " + type + "\n");
    }
}
