package creational.abstractfactory;

public class ToyotaFactory extends AbstractVehicle
{
	@Override
	public Engine createEngine()
	{
		return new ToyotaEngine();
	}
	
	@Override 
	public Body createBody()
	{
		return new ToyotaBody();
	}
	
	@Override
	public Interior createInterior()
	{
		return new ToyotaInterior();
	}
}
