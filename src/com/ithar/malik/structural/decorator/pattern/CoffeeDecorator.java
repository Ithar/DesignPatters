package com.ithar.malik.structural.decorator.pattern;

/*********************************************************
 * SVN: $Id: CoffeeDecorator.java 320 2013-07-09 10:44:12Z ithar $
 * @author Ithar Malik
 * @version 4 Jul 2013
 **********************************************************/
public interface CoffeeDecorator extends Beverage {

	// Needs to have the same methods as Beverage; that way we can call
	// beverage = new Cream(beverage);
		
}
