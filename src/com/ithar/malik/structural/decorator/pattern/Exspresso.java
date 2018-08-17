package com.ithar.malik.structural.decorator.pattern;

/*********************************************************
 * SVN: $Id: Exspresso.java 320 2013-07-09 10:44:12Z ithar $
 * @author Ithar Malik
 * @version 4 Jul 2013
 **********************************************************/
public class Exspresso implements Beverage {

	@Override
  public String getDescription() {
	  return "Espresso";
  }

	@Override
  public double getPrice() {
	  return 2.55;
  }

}
