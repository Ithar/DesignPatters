package com.ithar.malik.behavioral.observer.pattern;

/*********************************************************
 * SVN: $Id: HexObserver.java 322 2013-07-12 11:39:46Z ithar $
 * @author Ithar Malik
 * @version 9 Jul 2013
 **********************************************************/
public class HexObserver implements Observer {

	Subject subject; 
	
	public HexObserver(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void update() {
		
		for (Object object : subject.getInputArgs()) {
			convertToHex(object);			
		}

	}
	
	private void convertToHex(Object object) {
		Integer number = Integer.parseInt(object.toString());
		System.out.println("Hex  of\t\t\t "+number+" > "+Integer.toHexString(number) ); 
	}
	
}
