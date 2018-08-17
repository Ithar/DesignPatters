package creational.abstractfactory.car;

public class PriusFactory extends AbstractCar
{	
	@Override
	public Body createBody()
	{
		return new BodyPrius();
	}
	
	@Override
	public Engine createEngine()
	{
		return new EnginePrius();
	}
	
	@Override
	public Interior createInterior()
	{
		return  new InteriorPrius(); 
	}
	
}
