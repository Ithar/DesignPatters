package com.ithar.malik.behavioral.state.pattern;

/*********************************************************
 * SVN: $Id: StateContext.java 312 2013-06-26 10:14:21Z ithar $
 * @version 26 Jun 2013
 **********************************************************/
public interface StateContext {

	public void getStateName();
	
	public void getStateSpeed();
	
	public void speedUp();
	
	public void speedDown();
	
	public void setState(State state);
	
}
