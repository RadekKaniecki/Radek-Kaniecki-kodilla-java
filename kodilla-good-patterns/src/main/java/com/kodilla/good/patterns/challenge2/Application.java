package com.kodilla.good.patterns.challenge2;

public class Application {
    public static void main(String[] args) {
        AuctionRequestRetriever auctionRequestRetriever = new AuctionRequestRetriever();
        AuctionRequest auctionRequest = auctionRequestRetriever.retrieve();

        AuctionProcessor auctionProcessor = new AuctionProcessor(new EmailService(), new AuctionBuy(), new TextFileRepository());
        auctionProcessor.process(auctionRequest);
    }


}
