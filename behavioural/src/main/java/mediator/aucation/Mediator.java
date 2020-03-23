package mediator.aucation;

import mediator.domian.Buyer;

public interface Mediator {

    void addBuyer(Buyer buyer);
    void findHighestBidder();

}
