package malik.behavioral.observer.pattern;

/*********************************************************
 * SVN: $Id: BinaryObserver.java 322 2013-07-12 11:39:46Z ithar $
 * @author Ithar Malik
 * @version 9 Jul 2013
 **********************************************************/
public class BinaryObserver implements Observer {

	Subject subject; 
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void update() {
		
		for (Object object : subject.getInputArgs()) {
			convertToBinary(object);
		}

	}
	
	private void convertToBinary(Object object) {
		Integer number = Integer.parseInt(object.toString());
		System.out.println("Binary  of\t\t "+number+" > "+Integer.toBinaryString(number) ); 
	}
	

}
