package strategy.client;

import strategy.domain.Item;
import strategy.domain.ShoppingCart;
import strategy.strategies.CreditCardPaymentStrategy;

public class Client {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Bike",40);
        Item item2 = new Item("Wooden Doll house", 10);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.takePayment();
    }


}
