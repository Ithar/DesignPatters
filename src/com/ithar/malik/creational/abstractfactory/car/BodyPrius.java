package com.ithar.malik.creational.abstractfactory.car;

public class BodyPrius implements Body
{
	@Override
	public void buildDoors()
	{
		System.out.println("building 'Prius' doors");
	}
	
	@Override
	public void buildWindows()
	{
		System.out.println("building 'Prius' window");
	}
	
	@Override
	public void buildBonnet()
	{
		System.out.println("building 'Prius' bonnet");
	}
	
	@Override
	public void buildBoot()
	{
		System.out.println("building 'Prius' boot");
	}
	
}
