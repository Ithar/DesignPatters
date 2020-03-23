package mediator.aucation;

import mediator.domian.Buyer;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

    private List<Buyer> buyers = new ArrayList<>();

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    @Override
    public void findHighestBidder() {

        Buyer maxBuyer = null;

        for (Buyer buyer : buyers) {
            if (maxBuyer == null || buyer.getBid() > maxBuyer.getBid()) {
                maxBuyer = buyer;
            }
        }

        assert maxBuyer != null;
        System.out.println("The winning bidder is: '" + maxBuyer.getName() +"' with a bid of £" + maxBuyer.getBid());
    }
}
