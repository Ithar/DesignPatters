package visitor.client;

import visitor.domain.BookItem;
import visitor.domain.CDItem;
import visitor.domain.ShoppingItem;
import visitor.visitors.ShoppingCartVisitor;
import visitor.visitors.ShoppingCartVisitorImpl;

public class Client {

    public static void main(String[] args) {

        ShoppingItem[] items = new ShoppingItem[] {
                new BookItem("Baby Universe", 29.99, 2),
                new BookItem("A Brief History of Everything", 24.99, 3),
                new CDItem("Queen Greatest hits", 15.99),
                new CDItem("RHCP", 12.99)};

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double total = 0;
        for (ShoppingItem item : items) {
            total = total + item.calculate(visitor);
        }

        System.out.println("Total Cost = " + total);
    }

}
