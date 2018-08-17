package creational.abstractfactory;

public class CarFactory
{
	//private AbstractCar;
	
	public CarFactory(ToyotaModel model)
	{
		switch (model) 
		{
			case AVENSIS:
				
				break;
				
			case PRIUS:
			
				break;
				
			default:
				System.out.println("Could not find class for model"+model);
				break;
		} 
	}
	
	
	
	
}
