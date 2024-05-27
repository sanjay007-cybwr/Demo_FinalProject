package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjectModel.loginPageObjects;
import resources.BaseClass;

public class VerifyingLogin extends BaseClass 
{
	@Test
	public void verifingLoginButton() throws InterruptedException, IOException
	{
        driverInitialize();
		
		Thread.sleep(2000);
		
		loginPageObjects lpo=new loginPageObjects(driver);
		
		lpo.enterUsername().sendKeys("Admin");
		
	    Thread.sleep(2000);
	    
	    lpo.enterPassword().sendKeys("admin123");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    Thread.sleep(2000);
	}
}






//		driverInitialize();
//		Thread.sleep(3000);
//		loginPageObjects ipo=new loginPageObjects(driver);
//		ipo.enterUsername().sendKeys("Admin");
//		Thread.sleep(3000);
//		
//		loginPageObjects gtx=new loginPageObjects(driver);
//		gtx.enterPassword().sendKeys("admin123");
//		Thread.sleep(3000);
//		
//		loginPageObjects ggt=new loginPageObjects(driver);
//		ggt.enterLogin.click();
//		Thread.sleep(3000);

