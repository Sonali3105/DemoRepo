package com.qa.test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MavenTest
{
	/*
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("https://www.google.com/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Google")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium udemy\\chromedriver.exe");//invoke .exe file first before create object
		 driver = new ChromeDriver();
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
	*/
	
	
	
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
	
	@Test
	public  void mul()
	{
		System.out.println("Multiply:");
		int a=40,b=20;
		Assert.assertEquals(800, a*b);
	}
}
