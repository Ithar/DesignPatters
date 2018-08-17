package com.ithar.malik.structural.adapter.pattern;

/*********************************************************
 * <b>Description:</b> Convert the interface of a class into another interface clients expect.<br/> 
 * Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
 * 
 * SVN: $Id: ApplicationRun.java 333 2013-08-05 11:30:09Z ithar $
 * 
 * @author Ithar Malik
 * @version 5 Aug 2013
 **********************************************************/
public class ApplicationRun {

	public static void main(String[] args) {
		
		SimpleBook simpleBook = new SimpleBookImp("Design Patterns in Action", "Ithar Malik");
		
		ComplexBook complexBook = new SimpleBookAdapter(simpleBook);
		System.out.println(complexBook.getTitleAndAuthor());
	}

}
