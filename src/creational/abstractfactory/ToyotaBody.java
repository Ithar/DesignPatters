package creational.abstractfactory;

public class ToyotaBody implements Body
{
	public ToyotaBody()
	{
		buildDoors();
		buildWindows();
		buildBonnet();
		buildBoot();
	}
	
	public void buildDoors()
	{
		System.out.println("Build Toyota doors");
	}
	
	public void buildWindows()
	{
		System.out.println("Build Toyota windows");
	}
	
	public void buildBonnet()
	{
		System.out.println("Build Toyota bonnet");
	}
	
	public void buildBoot()
	{
		System.out.println("Build Toyota boot");
	}
	
}
