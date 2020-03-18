package malik.behavioral.observer.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*********************************************************
  * SVN: $Id: ApplicationRun.java 322 2013-07-12 11:39:46Z ithar $
 * @author Ithar Malik
 * @version 12 Jul 2013
 **********************************************************/
public class ApplicationRun {

	public static void main(String[] args) {
		
		List<Object> inputs = new ArrayList<Object>();
		
		Subject subject = new SubjectConcrete();
		
		new BinaryObserver(subject);
		new HexObserver(subject);
		new OctObserver(subject);
		
		Scanner scanner = new Scanner(System.in);
		String line ="";
		while (true) {
			
			System.out.println("\n");
	    System.out.print("Please enter a number or 'end' to terminate:\t");
	    line = scanner.next();
	    System.out.println("\n");
	    
	    if ("end".equalsIgnoreCase(line)) {
	    	System.out.println("Program terminated..");
	    	break;
	    }
	    
	    inputs.add(line);
			subject.setInputArgs(inputs);
			subject.notifyAllObservers();
			inputs.clear();
		}
		
		scanner.close();
	}
	
}
