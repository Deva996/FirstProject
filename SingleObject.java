package com.demo;

public class SingleObject
{

	private static SingleObject instance = new SingleObject();
	
	private SingleObject() 
	{
		
	}
	public static SingleObject getInstance()
	{
		return instance;
	}
	public void showmessage()
	{
		System.out.println("Hello World");
	}
	
}