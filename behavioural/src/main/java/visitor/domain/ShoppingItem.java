package visitor.domain;

import visitor.visitors.ShoppingCartVisitor;

public interface ShoppingItem {

    double calculate(ShoppingCartVisitor visitor);

}
