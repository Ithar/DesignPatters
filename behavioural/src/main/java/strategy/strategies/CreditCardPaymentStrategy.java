package strategy.strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;

    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean pay(int total) {
        System.out.println("Taking payment of: £" + total);
        System.out.println("Credit Card account" + this.toString());
        return true;
    }

    @Override
    public String toString() {
        return "CreditCardPaymentStrategy{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
