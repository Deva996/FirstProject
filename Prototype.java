package com.demo;

public class Prototype {

	public static void main(String[] args)
	{
		ShapeCache.loadcache();
		
		Shape clonedshape1 = ShapeCache.getshape("1");
		System.out.println("Shape type : " +clonedshape1.getType());
		Shape clonedshape2 = ShapeCache.getshape("2");
		System.out.println("Shape type : " +clonedshape2.getType());
		Shape clonedshape3 = ShapeCache.getshape("3");
		System.out.println("Shape type : " +clonedshape3.getType());
	}

}
