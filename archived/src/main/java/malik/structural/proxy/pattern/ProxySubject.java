package malik.structural.proxy.pattern;

public class ProxySubject  implements StocketInterface {
	
	RealSubject subject = new RealSubject();
	
	@Override
  public String readLine() {
	  return subject.readLine()+" > via proxy";
  }

	@Override
  public void writeLine(String s) {
		subject.writeLine("Proxy writing > "+s);
  }

}
