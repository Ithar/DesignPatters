package malik.behavioral.template.pattern;

/*********************************************************
  * SVN: $Id: TeaBeverage.java 306 2013-06-18 09:15:20Z ithar $
 * @author Ithar Malik
 * @version 18 Jun 2013
 **********************************************************/
public class TeaBeverage extends CreateBeverageTemplate {

	
	@Override
	void processThree() {
		System.out.println("TeaBeverage: processThree is 'Tea' class");
	}

	@Override
	void processFour() {
		System.out.println("TeaBeverage: processFour is 'Tea' class"); // NOTE: this will never be class as the hook method is set to false;
	}

	@Override
	protected boolean hookMethd() {
		System.out.println("TeaBeverage: hook method is false in 'Tea' class ");
		return false;
	}
	
}
