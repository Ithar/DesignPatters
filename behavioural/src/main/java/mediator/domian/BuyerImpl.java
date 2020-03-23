package mediator.domian;

import mediator.aucation.Mediator;

public class BuyerImpl extends Buyer {

    public BuyerImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        System.out.println(this.getName() + " has placed a bid of: £" + price);
        this.price = price;
    }

    @Override
    public void cancelBid() {
        System.out.println(this.getName() + " has cancelled their bid.");
        this.price = -1;
    }
}
