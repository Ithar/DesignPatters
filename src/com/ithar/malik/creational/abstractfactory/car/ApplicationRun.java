package com.ithar.malik.creational.abstractfactory.car;

public class ApplicationRun
{
	//private static final ToyotaModels type = ToyotaModels.AVENSIS;
	private static final ToyotaModels type = ToyotaModels.PRIUS; 
	
	private static AbstractCar carFactory; 
	private static Body body;
	private static Engine engine; 
	private static Interior interior;
	
	public static void main(String[] args)
  {		
		switch (type) 
		{
			case AVENSIS:
				carFactory = new AvensisFactory();
			break;

			case PRIUS:
				carFactory = new PriusFactory();
			break;	
			
			default:
				System.out.println("Model not found:"+type);
		}
		
		body = carFactory.createBody();
		engine = carFactory.createEngine();
		interior = carFactory.createInterior();

		body.buildBonnet();
		engine.createCrankshaft();
		interior.buildDashboard();
		
  }
	
}
