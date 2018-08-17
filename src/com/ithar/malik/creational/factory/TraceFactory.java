package com.ithar.malik.creational.factory;

import java.io.File;

/*********************************************************
 * SVN: $Id: TraceFactory.java 323 2013-07-17 15:07:53Z ithar $
 * @author Ithar Malik
 * @version 17 Jul 2013
 **********************************************************/
public class TraceFactory {

	
	public static Trace getTrace() {
		
		File file = new File("test.txt");
		
		if (file.exists()) {
			return new FileTracer();
		} 
			
		return new SystemTracer();
	}
	
	
}