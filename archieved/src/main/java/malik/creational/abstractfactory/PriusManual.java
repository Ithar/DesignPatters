package malik.creational.abstractfactory;

public class PriusManual implements ManualSections
{
	public PriusManual()
	{
		
	}
	
	@Override
	public void front()
	{
		System.out.println("Printing 'Prius' front part");
	}

	@Override
	public void body()
	{
		System.out.println("Printing 'Prius' body part");
	}
	
	@Override
	public void back()
	{
		System.out.println("Printing 'Prius' back part");
	}
	
}
