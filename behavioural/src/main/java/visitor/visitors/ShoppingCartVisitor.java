package visitor.visitors;

import visitor.domain.BookItem;
import visitor.domain.CDItem;

public interface ShoppingCartVisitor {

    double visit(BookItem book);
    double visit(CDItem cd);

}
