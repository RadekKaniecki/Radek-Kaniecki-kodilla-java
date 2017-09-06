package com.kodilla.good.patterns.challenge2;

public class AuctionBuy implements AuctionService {
    @Override
    public boolean process(User user, Item itemToBuy, String type) {
        //here would be more conditions to make process true like:
        //having item on the available list, having user created
        //but i make it very simple

        if(user != null && itemToBuy != null && type != null) {
            return true;
        }

        return false;
    }
}
