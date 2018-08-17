package com.ithar.malik.structural.adapter.pattern;

/*********************************************************
 * <b>Description:</b> This class ...
 * SVN: $Id: SimpleBookImp.java 332 2013-08-05 11:19:00Z ithar $
 * @author Ithar Malik
 * @version 5 Aug 2013
 **********************************************************/
public class SimpleBookImp implements SimpleBook {

	private String title;
	private String author;
		
	public SimpleBookImp(String title, String author) {
		this.title = title ;
		this.author = author;
	}

	public String getTitle() {
	  return title;
  }

	public String getAuthor() {
	  return author;
  }
	
}
