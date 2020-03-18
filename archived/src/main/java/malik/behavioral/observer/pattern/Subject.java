package malik.behavioral.observer.pattern;

import java.util.List;

/*********************************************************
 * SVN: $Id: Subject.java 322 2013-07-12 11:39:46Z ithar $
 * @author Ithar Malik
 * @version 9 Jul 2013
 **********************************************************/
public interface Subject {

	public void addObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObserver(Observer observer);
	
	public void notifyAllObservers();
	
	public List<Object> getInputArgs(); // Gets the data that will be used by the observers
	
	void setInputArgs(List<Object> inputArgs);
	
}
