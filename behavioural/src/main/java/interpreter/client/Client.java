package interpreter.client;

import interpreter.expressions.AndExpression;
import interpreter.expressions.Expression;
import interpreter.expressions.OrExpression;
import interpreter.expressions.TerminalExpression;

public class Client {

    public static void main(String[] args) {

        Expression person1 = new TerminalExpression("John");
        Expression person2 = new TerminalExpression("Frank");
        Expression isSingle = new OrExpression(person1, person2);

        Expression person3 = new TerminalExpression("Karl");
        Expression person4 = new TerminalExpression("Jane");
        Expression isMarried = new AndExpression(person3, person4);

        System.out.println("Is John single:" + isSingle.interpreter("John"));
        System.out.println("Is Frank single:" +isSingle.interpreter("Frank"));
        System.out.println("Is Karl single:" +isSingle.interpreter("Karl"));

        System.out.println("Is Karl married to Jane:" + isMarried.interpreter("This is to test if Karl is married to Jane."));
        System.out.println("Is John married to Jane:" + isMarried.interpreter("This is to test if John is married to Jane."));
    }
}