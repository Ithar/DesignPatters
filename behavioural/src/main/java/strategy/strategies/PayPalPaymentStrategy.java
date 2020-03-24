package strategy.strategies;

public class PayPalPaymentStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PayPalPaymentStrategy(String email, String pwd) {
        this.email = email;
        this.password = pwd;
    }


    @Override
    public boolean pay(int total) {
        System.out.println("Taking payment of: £" + total);
        System.out.println("PayPal account" + this.toString());
        return false;
    }

    @Override
    public String toString() {
        return "PayPalPaymentStrategy{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
