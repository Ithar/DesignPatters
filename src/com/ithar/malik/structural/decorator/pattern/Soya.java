package com.ithar.malik.structural.decorator.pattern;

/*********************************************************
 * SVN: $Id: Soya.java 320 2013-07-09 10:44:12Z ithar $
 * @author Ithar Malik
 * @version 4 Jul 2013
 **********************************************************/
public class Soya implements CoffeeDecorator {

	Beverage beverage;
	
	public Soya(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " soya";
	}

	@Override
	public double getPrice() {
		return beverage.getPrice() + 1.25;
	}

}
