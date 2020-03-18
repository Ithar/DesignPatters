package malik.behavioral.strategy.pattern;

import java.util.List;

/*********************************************************
 * SVN: $Id: SearchById.java 309 2013-06-20 08:54:36Z ithar $
 * @author Ithar Malik
 * @version 20 Jun 2013
 **********************************************************/
public class SearchById implements SearchStartegy {

	@Override
	public List<Result> doSearch(String input) {
		System.out.println("Searching by ID");
		return null;
	}

}
