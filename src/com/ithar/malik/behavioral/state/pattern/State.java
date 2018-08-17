package com.ithar.malik.behavioral.state.pattern;

/*********************************************************
 * SVN: $Id: State.java 312 2013-06-26 10:14:21Z ithar $
 * @version 26 Jun 2013
 **********************************************************/
public interface State {
	public String getName();
	public int getSpeed();
	public void nextState(StateContext stateContext);
	public void previousState(StateContext stateContext);
}
