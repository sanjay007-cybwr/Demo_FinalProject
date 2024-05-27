package testCases;

import org.testng.annotations.Test;

public class SettingPriorities {
	@Test(enabled = true)
	//(priority = 1)
	public void driverinitialize() {
		System.out.println("code to initialize driver/browser");
	}
	@Test(dependsOnMethods = "driverinitialize")
	public void enterURL() {
		System.out.println("code to enter/launch the URL");
	}
	@Test(priority = 3)
	public void enterCredentials() {
		System.out.println("code to enter UN and PWD");
	}
	@Test(priority = 4)
	public void driverClosing() {
		System.out.println("code to close the browser");
	}


}
