package malik.creational.abstractfactory;

public class ToyotaEngine implements Engine
{
	public ToyotaEngine()
	{
		createSparkPlug();
		createValves();
		createPiston();
		createCrankshaft();
	}
	
	@Override
	public void createSparkPlug()
	{
		System.out.println("Creating spark plugs for Toyota"); 
	}
	
	@Override
	public void createValves()
	{
		System.out.println("Creating values for Toyota");
	}
	
	@Override
	public void createPiston()
	{
		System.out.println("Creating values for Toyota");
	}
	
	@Override
	public void createCrankshaft()
	{
		
	}
	
	
	
}
