package creational.abstractfactory;

public class ApplicationRun
{
	private static AbstractVehicle factory = null;
	
	public static void main(String[] args)
  {
		buildCar(ToyotaModel.AVENSIS);
		
		factory.createBody();
		factory.createEngine();
		factory.createInterior();
  }
	
	private static void buildCar(ToyotaModel key)
	{
	
		switch (key)
	  {
	    case AVENSIS:
	    	factory = new ToyotaFactory();	
	    	
	    break;
	
	    default:
	    	System.out.println("Unknow car model");
		  break;
	  }
		 
	}
	
}
