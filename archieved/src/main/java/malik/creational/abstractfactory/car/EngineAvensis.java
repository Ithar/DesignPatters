package malik.creational.abstractfactory.car;

public class EngineAvensis implements Engine
{
	@Override
	public void createSparkPlug()
	{
		System.out.println("building 'Avensis' spark-plugs");
	}
	
	@Override
	public void createValves()
	{
		System.out.println("building 'Avensis' valves");
	}
	
	@Override
	public void createPiston()
	{
		System.out.println("building 'Avensis' Piston");
	}
	
	@Override
	public void createCrankshaft()
	{
		System.out.println("building 'Avensis' Crankshaft");
	}
	
}
