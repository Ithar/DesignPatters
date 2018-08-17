package com.ithar.malik.behavioral.state.pattern;

/*********************************************************
 * SVN: $Id: MediumState.java 312 2013-06-26 10:14:21Z ithar $
 * @version 26 Jun 2013
 **********************************************************/
public class MediumState implements State {

	@Override
	public String getName() {
		return "Medium speed";
	}

	@Override
	public int getSpeed() {
		return 2;
	}
	
	@Override
  public void nextState(StateContext stateContext) {
		stateContext.setState(new HighState());
  }

	@Override
  public void previousState(StateContext stateContext) {
		stateContext.setState(new LowState());
  }

}
