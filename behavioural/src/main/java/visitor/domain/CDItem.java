package visitor.domain;

import visitor.visitors.ShoppingCartVisitor;

public class CDItem implements ShoppingItem {

    private String title;
    private double price;

    public CDItem(String title, double price) {
        this.price = price;
        this.title = title;
    }

    @Override
    public double calculate(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
