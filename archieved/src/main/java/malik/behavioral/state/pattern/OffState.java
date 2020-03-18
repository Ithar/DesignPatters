package malik.behavioral.state.pattern;

/*********************************************************
 * SVN: $Id: OffState.java 312 2013-06-26 10:14:21Z ithar $
 * @version 26 Jun 2013
 **********************************************************/
public class OffState implements State {

	@Override
	public String getName() {
		return "Off State";
	}

	@Override
	public int getSpeed() {
		return 0;
	}
	
	@Override
	public void nextState(StateContext stateContext) {
		stateContext.setState(new LowState());
	}

	@Override
  public void previousState(StateContext stateContext) {
		stateContext.setState(this);
  }
}
