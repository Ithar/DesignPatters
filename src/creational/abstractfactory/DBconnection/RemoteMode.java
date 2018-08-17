package creational.abstractfactory.DBconnection;

public class RemoteMode implements Remote
{
	public void connectDB(String url)
	{
		System.out.println("Connecting remotely via url:"+url);
	}
}
