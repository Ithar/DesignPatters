package com.ithar.malik.structural.decorator.pattern;

/*********************************************************
 * SVN: $Id: Cream.java 320 2013-07-09 10:44:12Z ithar $
 * @author Ithar Malik
 * @version 4 Jul 2013
 **********************************************************/
public class Cream implements CoffeeDecorator {

	Beverage beverage;
	
	public Cream(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
  public String getDescription() {
	  return beverage.getDescription() + " cream ";
  }

	@Override
  public double getPrice() {
	  return beverage.getPrice() + 0.25;
  }

	
	
	
	

}
