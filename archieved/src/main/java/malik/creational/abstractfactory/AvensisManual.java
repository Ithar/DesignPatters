package malik.creational.abstractfactory;

public class AvensisManual implements ManualSections
{
	public AvensisManual()
	{
		
	}
	
	@Override
	public void front()
	{
		System.out.println("Printing 'Avensis' front part");
	}

	@Override
	public void body()
	{
		System.out.println("Printing 'Avensis' body part");
	}
	
	@Override
	public void back()
	{
		System.out.println("Printing 'Avensis' back part");
	}
	
}
