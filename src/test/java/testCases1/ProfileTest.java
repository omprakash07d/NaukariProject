package testCases1;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import extendlisteners.Listeners1;



public class ProfileTest extends Listeners1 {
	
	WebDriverWait wait;
	
	@Test(priority = 3)
	public void search()
	{
		pb.clickOnViewProfile();
	}
	
	@Test (priority = 4)
	public void resumeHeadline()
	{
	  pb.scroll();
	  
	  pb.clickOnResume ();
	}
	
	@Test (priority = 5)
	public void createNewHeadline()
	{
	  pb.newheadline();
	}
	
	@Test (priority = 6)
	public void clickOnSaveHeadline()
	{
	  pb.saveHeadline ();
	}
	
   @ Test (priority = 7)
   public void ClickOnUploadResume () throws InterruptedException
   {
	   
	
	   
	// Set an implicit wait
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    // Provide the full file path for the resume
	 // String filePath = System.getProperty("user.dir") + "\\Resume\\Omprakash_Diwathe_Automation_Tester.pdf";
	  //  String filePath = "D:\\Omprakash_Diwathe_Automation_Tester.pdf";
	     
	    // pb.resumeUpload("Omprakash_Diwathe_Automation_Tester.pdf");
	    
	    pb.resumeUpload("resume.doc");
	   

	    // Add a short pause for the upload process to complete (if necessary)
	    // Adjust this value as per requirement
	   
	    
	    }   

	   
	   
	   
   }
	
	
