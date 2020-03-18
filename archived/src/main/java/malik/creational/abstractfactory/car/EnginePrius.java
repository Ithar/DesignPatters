package malik.creational.abstractfactory.car;

public class EnginePrius implements Engine
{
	@Override
	public void createSparkPlug()
	{
		System.out.println("building 'Prius' spark-plugs");
	}
	
	@Override
	public void createValves()
	{
		System.out.println("building 'Prius' valves");
	}
	
	@Override
	public void createPiston()
	{
		System.out.println("building 'Prius' Piston");
	}
	
	@Override
	public void createCrankshaft()
	{
		System.out.println("building 'Prius' Crankshaft");
	}
	
}
