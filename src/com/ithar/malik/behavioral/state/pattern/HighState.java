package com.ithar.malik.behavioral.state.pattern;

/*********************************************************
 * SVN: $Id: HighState.java 312 2013-06-26 10:14:21Z ithar $
 * @version 26 Jun 2013
 **********************************************************/
public class HighState implements State {

	@Override
	public String getName() {
		return "High speed";
	}

	@Override
	public int getSpeed() {
		return 3;
	}

	@Override
  public void nextState(StateContext stateContext) {
		stateContext.setState(this);
  }

	@Override
  public void previousState(StateContext stateContext) {
		stateContext.setState(new MediumState());
  }
	
}
