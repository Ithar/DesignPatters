package creational.abstractfactory.car;

public class AvensisFactory extends AbstractCar
{	
	@Override
	public Body createBody()
	{
		return new BodyAvensis();
	}
	
	@Override
	public Engine createEngine()
	{
		return new EngineAvensis();
	}
	
	@Override
	public Interior createInterior()
	{
		return  new InteriorAvensis(); 
	}
	
}
