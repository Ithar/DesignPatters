package mediator.client;

import mediator.aucation.Mediator;
import mediator.aucation.MediatorImpl;
import mediator.domian.Buyer;
import mediator.domian.BuyerImpl;

public class Client {

    public static void main(String[] args) {

        Mediator mediator = new MediatorImpl();

        Buyer buyer1 = new BuyerImpl(mediator, "Jane");
        Buyer buyer2 = new BuyerImpl(mediator, "Leon");
        Buyer buyer3 = new BuyerImpl(mediator, "Brad");

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);

        buyer1.bid(4500);
        buyer2.bid(5700);
        buyer3.bid(3500);

        mediator.findHighestBidder();

        buyer2.cancelBid();

        mediator.findHighestBidder();
    }
}
