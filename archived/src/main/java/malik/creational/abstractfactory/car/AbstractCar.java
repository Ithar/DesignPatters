package malik.creational.abstractfactory.car;

public abstract class AbstractCar
{
	// Note that 'Engine', 'Body' and 'Interior' are all interfaces
	// implemented by concert classes for each of the families of cars.
	// Also note; all cars we make must have a body, engine and interior
	public abstract Body createBody();
	public abstract Engine createEngine();	
	public abstract Interior createInterior();
	
}
