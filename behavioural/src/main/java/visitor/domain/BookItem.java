package visitor.domain;

import visitor.visitors.ShoppingCartVisitor;

public class BookItem implements ShoppingItem {

    private String title;
    private double price;
    private int weight;

    public BookItem(String title, double price, int weight) {
        this.price = price;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public double calculate(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
