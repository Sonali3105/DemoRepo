package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest2 {

	@Test
	public  void sum()
	{
		System.out.println("Addition:");
		int a=10,b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public  void sub()
	{
		System.out.println("Subtraction:");
		int a=30,b=20;
		Assert.assertEquals(10, a-b);
	}
	@Test
	public  void div()
	{
		System.out.println("Division:");
		int a=40,b=20;
		Assert.assertEquals(2, a/b);
	}
	
	
}
