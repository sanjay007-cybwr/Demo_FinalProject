package testCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import dependentsPageObjects.DependentsPageObjects;
import pageObjectModel.loginPageObjects;
import resources.Base2Class;

@Test
public class Dependents_Page extends Base2Class
{
	public void Dependents_Page() throws InterruptedException, IOException
	{
		driverInitialize2();
		Thread.sleep(2000);
			
		DependentsPageObjects dpo=new DependentsPageObjects(driver);
        dpo.enterUsername().sendKeys("Admin");
	    Thread.sleep(1000);
	    
	    dpo.enterPassword().sendKeys("admin123");
	    Thread.sleep(1000);
	   
        dpo.clickLogin().click();
		Thread.sleep(1000);
	
		dpo.clickMyInfo().click();
		Thread.sleep(1000);	
		
		dpo.clickDependents().click();
		Thread.sleep(1000);
	
		dpo.Attachments().click();
		Thread.sleep(1000);
		
		dpo.Browser().click();
		Thread.sleep(1000);
		
		dpo.Commenttextfield().sendKeys("File uplode successfully");
		Thread.sleep(1000);
		
		dpo.Save().click();
		Thread.sleep(2000);
		
		dpo.CheckBox().click();
			
	//	Assert.assertNotNull(dpo.Save().isEnabled());
	//	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
	}
}
