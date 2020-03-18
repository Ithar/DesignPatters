package malik.creational.abstractfactory;

public class ToyotaInterior implements Interior
{
	public ToyotaInterior()
	{
		buildSeats();
		buildDashboard();
	}
	
	@Override
	public void buildSeats()
	{
		System.out.println("Build Toyota seats");
	}
	
	@Override
	public void buildDashboard()
	{
		System.out.println("Build Toyota Dashbord");
	}
	
}
