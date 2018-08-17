package com.ithar.malik.behavioral.strategy.pattern;

import java.util.ArrayList;
import java.util.List;

/*********************************************************
 * SVN: $Id: ApplicationRun.java 308 2013-06-20 08:53:49Z ithar $
 * @author Ithar Malik
 * @version 19 Jun 2013
 **********************************************************/
public class ApplicationRun {

	public static void main(String[] args) {
		
		List<SearchStartegy> startegyList = new ArrayList<SearchStartegy>();
		startegyList.add(new SearchById());
		startegyList.add(new SearchByClassname());
		
		for (SearchStartegy startegy : startegyList) {
			startegy.doSearch("test");
		} 

	}

}
