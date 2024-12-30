package testCases1;

import org.testng.Assert;
import org.testng.annotations.Test;

import extendlisteners.Listeners1;





public class LoginTest1 extends Listeners1 {
	
	
	
	
	@Test(priority = 1)
	public void HomepageLoging() throws InterruptedException
	{			
		lp.homelogin();
			
	}
	 
	
	@Test (priority = 2)
	public void initialLoging ()
	{		

	lp.intialLogin();
	}
	

	
	
	@Test(enabled = false)
	public void verifyUrl()
	{
		Boolean valuereturned = lp.getUrl();
		
		// Assert.assertTrue(valuereturned, "Test case failed");
	}

}

