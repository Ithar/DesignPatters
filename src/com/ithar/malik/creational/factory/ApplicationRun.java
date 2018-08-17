package com.ithar.malik.creational.factory;

/*********************************************************
 * <b>Description:</b> Factory method is just a fancy name for a method that instantiates objects. 
 * 
 * http://www.javaworld.com/javaqa/2001-05/02-qa-0511-factory.html
 * 
 * SVN: $Id: ApplicationRun.java 323 2013-07-17 15:07:53Z ithar $
 * @author Ithar Malik
 * @version 17 Jul 2013
 **********************************************************/
public class ApplicationRun {

	public static void main(String[] args) {
		
		
		Trace trace = TraceFactory.getTrace();
		
		trace.printStackTrace();
		
		

	}

}
