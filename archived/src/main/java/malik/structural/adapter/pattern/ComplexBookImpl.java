package malik.structural.adapter.pattern;

/*********************************************************
 * <b>Description:</b> This class ...
 * SVN: $Id: ComplexBookImpl.java 332 2013-08-05 11:19:00Z ithar $
 * @author Ithar Malik
 * @version 5 Aug 2013
 **********************************************************/
public class ComplexBookImpl implements ComplexBook {

	private String title;
	private String author;
	
	public ComplexBookImpl(String title, String author) {
	  this.title = title;
	  this.author = author;
  }
		
	public String getTitleAndAuthor() {
		
		String message = title+" by: "+author;
		return message;
	}
	
	
}
