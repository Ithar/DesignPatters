package com.ithar.malik.creational.factory;

/*********************************************************
 * SVN: $Id: FileTracer.java 323 2013-07-17 15:07:53Z ithar $
 * @author Ithar Malik
 * @version 17 Jul 2013
 **********************************************************/
public class FileTracer implements Trace {

	@Override
	public void printStackTrace() {
		System.out.println("Printting to FILE ... pretend");
	}

}
