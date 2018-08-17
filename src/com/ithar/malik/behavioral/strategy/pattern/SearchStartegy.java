package com.ithar.malik.behavioral.strategy.pattern;

import java.util.List;

/*********************************************************
 * SVN: $Id: SearchStartegy.java 309 2013-06-20 08:54:36Z ithar $
 * @author Ithar Malik
 * @version 20 Jun 2013
 **********************************************************/
public interface SearchStartegy {

	public List<Result> doSearch(String input);
	
}
