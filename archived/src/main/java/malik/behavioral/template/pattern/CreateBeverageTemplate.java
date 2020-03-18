package malik.behavioral.template.pattern;

/*********************************************************
  * SVN: $Id: CreateBeverageTemplate.java 306 2013-06-18 09:15:20Z ithar $
 * @author Ithar Malik
 * @version 18 Jun 2013
 **********************************************************/
public abstract class CreateBeverageTemplate {

	protected final void doAlgorithum() {
		
		processOne();
		processTwo();
		processThree();
		
		if (hookMethd()) {
			processFour();
		}
		
		processFive();
	}
	
	private void processOne() {
		System.out.println("CreateBeverageTemplate: running process 'one'");
	}

	private void processTwo() {
		System.out.println("CreateBeverageTemplate: running process 'one'");
		
	}
	
	abstract void processThree();
	
	abstract void processFour();
	
	protected boolean hookMethd() {
		System.out.println("CreateBeverageTemplate: run hook method 'true'");
		return true;
	}
	
	final void processFive() {
		System.out.println("CreateBeverageTemplate: running process 'five'");
		
	}
}
