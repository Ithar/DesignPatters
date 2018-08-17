package com.ithar.malik.structural.decorator.pattern;

/*********************************************************
 * Attach additional responsibilities to an object dynamically. 
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * 
 * SVN: $Id: ApplicationRun.java 320 2013-07-09 10:44:12Z ithar $
 * 
 * @author Ithar Malik
 * @version 4 Jul 2013
 **********************************************************/
public class ApplicationRun {

	
	public static void main(String[] args) {
		
		Beverage beverage = new Exspresso();
		beverage = new Cream(beverage);
		beverage = new Soya(beverage);
		
		System.out.println(beverage.getDescription()+" > "+beverage.getPrice());

	}

}
