package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoationPractice {
	@Test
	public void m1()
	{
		System.out.println("I am a method m1......");
	}
	@Test
	public void z1()
	{
		System.out.println("I am a method z1......");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This code will execute before each and every @Test annoted method......");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This code will execute after execution of each and every @Test annoted method......");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This code will execute before any annoted method......");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("This code will execute after any annoted method......");
	}

}
