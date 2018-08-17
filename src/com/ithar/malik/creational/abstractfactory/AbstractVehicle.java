package com.ithar.malik.creational.abstractfactory;

public abstract class AbstractVehicle
{
	// Note that 'Engine', 'Body' and 'Interior' are all interfaces
	// implemented by concert classes for each of the families of cars. 
	public abstract Engine createEngine();
	public abstract Body createBody();
	public abstract Interior createInterior();
	
}
