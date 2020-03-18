package malik.behavioral.state.pattern;

/*********************************************************
 * SVN: $Id: LowState.java 312 2013-06-26 10:14:21Z ithar $
 * @version 26 Jun 2013
 **********************************************************/
public class LowState implements State {

	@Override
	public String getName() {
		return "Low speed";
	}

	@Override
	public int getSpeed() {
		return 1;
	}

	@Override
  public void nextState(StateContext stateContext) {
		stateContext.setState(new MediumState());
  }

	@Override
  public void previousState(StateContext stateContext) {
		stateContext.setState(new OffState());
  }

}
