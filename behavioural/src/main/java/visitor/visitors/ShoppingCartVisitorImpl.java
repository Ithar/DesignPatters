package visitor.visitors;

import visitor.domain.BookItem;
import visitor.domain.CDItem;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public double visit(BookItem book) {
        return book.getPrice() * book.getWeight();
    }

    @Override
    public double visit(CDItem cd) {
        return cd.getPrice();
    }
}
