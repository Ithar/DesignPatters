package com.ithar.malik.creational.abstractfactory.DBconnection;

public class LocalMode implements Local
{
	public void loadDB()
	{
		System.out.println("Making a local DB connection");
	}
}
