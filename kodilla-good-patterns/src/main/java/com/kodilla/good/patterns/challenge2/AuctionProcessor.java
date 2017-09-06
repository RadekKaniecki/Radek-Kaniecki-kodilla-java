package com.kodilla.good.patterns.challenge2;

public class AuctionProcessor {
    private InformationService informationService;
    private AuctionService auctionService;
    private AuctionRepository auctionRepository;

    public AuctionProcessor(final InformationService informationService,
                            final AuctionService auctionService,
                            final AuctionRepository auctionRepository) {
        this.informationService = informationService;
        this.auctionService = auctionService;
        this.auctionRepository = auctionRepository;
    }

    public BuyDto process(final AuctionRequest auctionRequest) {
        boolean isBought = auctionService.process(auctionRequest.getUser(), auctionRequest.getItem(), auctionRequest.getType());

        if(isBought) {
            System.out.println("Transaction: " + auctionRequest.getType() + " is successful for user: " + auctionRequest.getUser().getName() +
                    ", on item: " + auctionRequest.getItem().getName() + "\n");
            informationService.inform(auctionRequest.getUser());
            auctionRepository.createAuction(auctionRequest.getUser(),auctionRequest.getItem(), auctionRequest.getType());
            return new BuyDto(auctionRequest.getUser(), auctionRequest.getItem(), true);
        } else {
            return new BuyDto(auctionRequest.getUser(), auctionRequest.getItem(), false);
        }
    }
}
