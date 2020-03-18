package malik.structural.adapter.pattern;

/*********************************************************
 * <b>Description:</b> This class ...
 * SVN: $Id: SimpleBookAdapter.java 332 2013-08-05 11:19:00Z ithar $
 * @author Ithar Malik
 * @version 5 Aug 2013
 **********************************************************/
public class SimpleBookAdapter implements ComplexBook  {

	private SimpleBook simpleBook;
	
	public SimpleBookAdapter(SimpleBook simpleBook) {
		this.simpleBook = simpleBook;
	}
	
  public String getTitleAndAuthor() {  
  	String message = simpleBook.getTitle()+" by:"+simpleBook.getAuthor();
	  return message;
  }

}
