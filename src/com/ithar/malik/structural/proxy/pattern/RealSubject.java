package com.ithar.malik.structural.proxy.pattern;

public class RealSubject implements StocketInterface {

	private String line = "Line coming from real subject";
	
	@Override
  public String readLine() {
	  return line;
  }

	@Override
  public void writeLine(String s) {
	  line = s;
  }

}
