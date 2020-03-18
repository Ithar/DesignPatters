package malik.creational.abstractfactory.car;

public class InteriorAvensis implements Interior
{
	@Override
	public void buildSeats()
	{
		System.out.println("building 'Avensis' seats");
	}
	
	@Override
	public void buildDashboard()
	{
		System.out.println("building 'Avensis' Dashboard");
	}
	
}
