package com.ithar.malik.structural.facade.pattern;


/*********************************************************
 * <b>Description:</b> Provide a unified interface to a set of interfaces in a subsystem.
 * Facade defines a higher-level interface that makes the subsystem easier to use.
 * 
 * Facades and adapters may wrap multiple classes, 
 * but a facade’s intent is to simplify, while an adapter’s is to convert.
 * 
 * SVN: $Id$
 * 
 * @author Ithar Malik
 * @version 13 Aug 2013
 **********************************************************/
public class ApplicationRun {
	
	public static void main(String[] args) {
		
		SubSystemOne one = new SubSystemOne();
		SubSystemTwo	two = new SubSystemTwo();
		SubSystemThree three = new SubSystemThree();

		SystemsFacade facade = new SystemsFacade(one, two, three);
		facade.runSystems();
		
	}

}
