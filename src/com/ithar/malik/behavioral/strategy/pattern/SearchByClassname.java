package com.ithar.malik.behavioral.strategy.pattern;

import java.util.List;

/*********************************************************
 * SVN: $Id: SearchByClassname.java 309 2013-06-20 08:54:36Z ithar $
 * @author Ithar Malik
 * @version 20 Jun 2013
 **********************************************************/
public class SearchByClassname implements SearchStartegy {

	@Override
	public List<Result> doSearch(String input) {
		System.out.println("Searching by classname");
		return null;
	}

}
