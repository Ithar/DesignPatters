package com.ithar.malik.behavioral.observer.pattern;

/*********************************************************
 * SVN: $Id: OctObserver.java 322 2013-07-12 11:39:46Z ithar $
 * @author Ithar Malik
 * @version 9 Jul 2013
 **********************************************************/
public class OctObserver implements Observer {

	Subject subject; 
	
	public OctObserver(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void update() {
		
		for (Object object : subject.getInputArgs()) {
			convertToOct(object);
		}
	}
	
	private void convertToOct(Object object) {
		Integer number = Integer.parseInt(object.toString());
		System.out.println("Oct  of\t\t\t "+number+" > "+Integer.toOctalString(number) ); 
	}
	
}
