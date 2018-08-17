package creational.abstractfactory.car;

// This is a concert class which we do NOT want to expose
public class BodyAvensis implements Body
{
	@Override
	public void buildDoors()
	{
		System.out.println("building 'Avensis' doors");
	}
	
	@Override
	public void buildWindows()
	{
		System.out.println("building 'Avensis' window");
	}
	
	@Override
	public void buildBonnet()
	{
		System.out.println("building 'Avensis' bonnet");
	}
	
	@Override
	public void buildBoot()
	{
		System.out.println("building 'Avensis' boot");
	}
	
}
