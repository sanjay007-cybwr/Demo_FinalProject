package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects 
{	
    public WebDriver driver;
	
	private By username=By.xpath("//input[@name='username']");
	
	private By password=By.xpath("//input[@name='password']");

	public loginPageObjects(WebDriver driver2) 
	{
		this.driver=driver2;
	}
	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
}


















//	public WebDriver driver;
//	private By username=By.name("username");
//	private By password=By.name("password");
//	private By login=
//	
//	public loginPageObjects(WebDriver driver2) {
//		this.driver=driver2;
//	}
//
//	public WebElement enterUsername()
//	{
//		return driver.findElement(username);
//	}
//
//	public WebElement enterPassword()
//	{
//		return driver.findElement(password);
//	}

