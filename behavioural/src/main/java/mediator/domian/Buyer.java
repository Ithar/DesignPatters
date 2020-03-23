package mediator.domian;

import mediator.aucation.Mediator;

public abstract class Buyer {

    private Mediator mediator;
    private String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelBid();

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public int getBid(){
        return price;
    }
}
