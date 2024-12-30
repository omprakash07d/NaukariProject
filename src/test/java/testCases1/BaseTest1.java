package testCases1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;
import pageObject.ProfilePage;
import pageObject.logOutPage1;

public class BaseTest1 {
	public static WebDriver driver;
	public LoginPage lp;
	public ProfilePage pb;
	public logOutPage1 lo;
	
	@BeforeSuite
	public void initBrowser() {
		
	//	System.setProperty("webdriver.chrome.driver","D:\\Om_Drive\\Learning Folder\\Eclips\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		// Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();

//        // Add the 'start-maximized' argument to ChromeOptions
//        options.addArguments("--start-maximized");
//        
//        // Add arguments for Incognito and Headless modes
//        options.addArguments("--incognito");
//        
//        options.addArguments("--headless");
        

        // Initialize WebDriver with ChromeOptions
        driver = new ChromeDriver(options);
		
		driver.get("https://www.naukri.com/");

	}
	
	@BeforeClass
	public void createObject() throws IOException
	{
		 lp = new LoginPage(driver);
		 pb = new ProfilePage(driver);
		 lo = new logOutPage1 (driver);
	}
	
	
	
	@AfterSuite
    public void tearDown() throws InterruptedException {
		Thread.sleep (500000000);
	
            driver.quit(); // This closes the browser and ends the WebDriver session
        }
	

}