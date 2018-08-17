package com.ithar.malik.behavioral.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/*********************************************************
 * SVN: $Id: SubjectConcrete.java 322 2013-07-12 11:39:46Z ithar $
 * @author Ithar Malik
 * @version 9 Jul 2013
 **********************************************************/
public class SubjectConcrete implements Subject {

	private List<Observer> observerList = new ArrayList<Observer>();
	
	private List<Object> inputArgs;
	
	public SubjectConcrete() {
		
	}
	
	@Override
  public void addObserver(Observer observer) {
		observerList.add(observer);
  }

	@Override
  public void removeObserver(Observer observer) {
		observerList.remove(observer);
  }

	@Override
  public void notifyObserver(Observer observer) {
	  
		observer.update();
	  
  }

	@Override
  public void notifyAllObservers() {
		
		for (Observer observer : observerList) {
			observer.update();
		}
	  
  }

	@Override
	public void setInputArgs(List<Object> inputArgs) {
		this.inputArgs = inputArgs;
	}
	
	@Override
	public List<Object> getInputArgs() {
		return inputArgs;
	}
	
}
