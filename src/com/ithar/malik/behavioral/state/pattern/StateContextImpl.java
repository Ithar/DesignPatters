package com.ithar.malik.behavioral.state.pattern;

/*********************************************************
 * SVN: $Id: StateContextImpl.java 312 2013-06-26 10:14:21Z ithar $
 * @version 26 Jun 2013
 **********************************************************/
public class StateContextImpl implements StateContext {

	State state;
	
	public StateContextImpl() {
		state = new OffState();
	}
	
	@Override
	public void getStateName() {
		System.out.println(state.getName());
	}
	
	@Override
	public void getStateSpeed() {
		System.out.println(state.getSpeed());
	}
	
	@Override
  public void setState(State state) {
	  this.state = state;
  }
  
	@Override
	public void speedUp() {
		state.nextState(this);
	}
	
	@Override
	public void speedDown() {
		state.previousState(this);
	}	
}
