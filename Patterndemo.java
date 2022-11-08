package com.demo;

public class Patterndemo 
{
public static void main(String []args)
{
	SingleObject s = SingleObject.getInstance();
	 s.showmessage();  
	SingleObject s1 = SingleObject.getInstance();
    s1.showmessage();  
}
}

