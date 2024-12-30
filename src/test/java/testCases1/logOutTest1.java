package testCases1;

import org.testng.annotations.Test;

import extendlisteners.Listeners1;

public class logOutTest1 extends Listeners1 {

	
	

	@Test(priority=8 , dependsOnMethods = "ClickOnUploadResume")
	public void clickOnProfileIcon() throws InterruptedException
	
	{
		lo.clickOnProfileIcon();
	}
	
	@Test(priority =9 , dependsOnMethods = "clickOnProfileIcon")
	public void clickonLogoutButton()
	{
	lo.ClickOnLogOutButton();
	
	}
}
