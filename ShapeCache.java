package com.demo;

import java.util.Hashtable;

public class ShapeCache 
{
 
	
	private static Hashtable<String, Shape> sharemap = new Hashtable<String, Shape>();
	
	public static Shape getshape(String shapeid)
	{
	   Shape shapecache = sharemap.get(shapeid);	
	   return (Shape)shapecache.clone();
	}
	
	
	public static void loadcache()
	{
		Circle c1 = new Circle();
		c1.setId("1");
		sharemap.put(c1.getId(), c1);
		
		Square s1 = new Square();
		s1.setId("2");
		sharemap.put(s1.getId(), s1);
		
		Rectangle r1 = new Rectangle();
		r1.setId("3");
		sharemap.put(r1.getId(), r1);
		
		
	}
	
}