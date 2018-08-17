package com.ithar.malik.behavioral.state.pattern;

/*********************************************************
 * SVN: $Id: ApplicationRun.java 312 2013-06-26 10:14:21Z ithar $
 * @version 26 Jun 2013
 **********************************************************/
public class ApplicationRun {

	public static void main(String[] args) {

		StateContext stateContext = new StateContextImpl(); // TODO should make StateContect an interface
		
		stateContext.getStateName();	// Off State
		stateContext.speedUp();
		
		stateContext.getStateName();	// Low speed
		stateContext.speedUp();
		
		stateContext.getStateName();	// Medium speed
		stateContext.speedUp();
		
		stateContext.getStateName();	// High speed
		stateContext.speedUp();
		
		stateContext.getStateName();	// High speed
		
		stateContext.speedDown();
		stateContext.speedDown();
		stateContext.speedDown();
				
		stateContext.getStateName();	// Off State
	}

}
