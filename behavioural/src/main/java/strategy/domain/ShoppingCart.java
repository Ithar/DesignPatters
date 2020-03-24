package strategy.domain;

import strategy.strategies.CreditCardPaymentStrategy;
import strategy.strategies.PayPalPaymentStrategy;
import strategy.strategies.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    private static List<PaymentStrategy> PAYMENT_STRATEGIES = new ArrayList<>();

    static {
        PAYMENT_STRATEGIES.add(new PayPalPaymentStrategy("jane.doe@test.com", "myPwd"));
        PAYMENT_STRATEGIES.add(new CreditCardPaymentStrategy("Jane Doe", "1234567890123456", "786"));
    }

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void takePayment() {
        int amount = items.stream()
                .mapToInt(Item::getPrice)
                .sum();

        for (PaymentStrategy paymentStrategy : PAYMENT_STRATEGIES) {
            boolean success = paymentStrategy.pay(amount);
            System.out.println("Payment succeeded : " + success);
            if (success) {
                break;
            }
        }
    }

}
