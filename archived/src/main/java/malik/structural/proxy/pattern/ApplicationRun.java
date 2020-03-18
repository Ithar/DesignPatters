package malik.structural.proxy.pattern;

/*********************************************************
 * <b>Description:</b> Acts between client and real subject.
 * 
 * - RMI to subject in another JVM
 * - controls access to real subject
 * - Used to provide an alternative to expensively created subjects
 * 
 * SVN: $Id: ApplicationRun.java 378 2013-10-11 11:52:08Z ithar $
 * @author Ithar Malik
 * @version 11 Oct 2013
 **********************************************************/
public class ApplicationRun {

	public static void main(String[] args) {
		
		StocketInterface sub = new ProxySubject();
		System.out.println(sub.readLine()); 

		sub.writeLine("Client communicates to real subject");
		
		System.out.println(sub.readLine());
	}

}
