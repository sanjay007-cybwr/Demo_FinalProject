package dependentsPageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DependentsPageObjects {
	public WebDriver driver;
	private By username=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
	private By password=By.name("password");
	private By loginButton=By.xpath("//button[@type='submit']");
	
	private By MyInfoButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]");
	private By DependentsButton=By.xpath("//a[normalize-space()='Dependents']"); 
	private By AttachmentsButton=By.xpath(" /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/button[1]");
    private By BrowserButton=By.xpath("//div[@class='oxd-file-button']");
	private By UplodeButton=By.xpath("(//div[@class='oxd-file-button'])[1]");
	private By Comment=By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]");
	private By SaveButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/form[1]/div[3]/button[2]");
	private By CheckBoxButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");

		public DependentsPageObjects(WebDriver driver2) 
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
		
		public WebElement clickLogin()
		{
			return driver.findElement(loginButton);
		}
		
		public WebElement clickMyInfo()
		{
			return driver.findElement(MyInfoButton);
		}
		
		public WebElement clickDependents()
		{
			return driver.findElement(DependentsButton);
		}

		public WebElement Attachments()
		{
			return driver.findElement(AttachmentsButton);
		}
		
		public WebElement Browser()
		{  // driver.findElement(BrowserButton).sendKeys("C:\\\\Users\\\\SANJAY\\\\Pictures\\\\1.jpg");
			return driver.findElement(BrowserButton);	
		}
	
		public WebElement Uplode() 
		{	
			return driver.findElement(UplodeButton);
		}
		
		public WebElement Commenttextfield()
		{
			return driver.findElement(Comment);
		}
		
		public WebElement Save()
		{
			return driver.findElement(SaveButton);
		}
		
		public WebElement CheckBox()
		{
			return driver.findElement(CheckBoxButton);
		}
		
		
	}
