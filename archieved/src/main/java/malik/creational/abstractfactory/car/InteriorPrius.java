package malik.creational.abstractfactory.car;

public class InteriorPrius implements Interior
{
	@Override
	public void buildSeats()
	{
		System.out.println("building 'Prius' seats");
	}
	
	@Override
	public void buildDashboard()
	{
		System.out.println("building 'Prius' Dashboard");
	}
	
}
