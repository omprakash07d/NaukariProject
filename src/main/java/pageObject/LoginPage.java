package pageObject;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.BaseClass1;


public class LoginPage extends BaseClass1 {

	
	 	
	WebDriver driver;
	WebDriverWait wait;
	
	
	@FindBy(xpath = "//*[@id='login_Layer']")
	private WebElement homepagelogin;
	
	    
	@FindBy(xpath = "//*[@id='root']/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")
	private WebElement username;

	@FindBy(xpath = "//*[@id='root']/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")
	private WebElement password;

	@FindBy(xpath = "//*[@id='root']/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")
	private WebElement loginbutton;

	
	public LoginPage(WebDriver driver) throws IOException
	{
		this.driver = driver;
		// wait = new WebDriverWait(driver, 60);
		PageFactory.initElements(driver, this);
	}

	
	public void homelogin()
	
	{		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		homepagelogin.click();
	}
	
	
	public void intialLogin()
	{ 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		username.sendKeys(prop.getProperty("username"));

		password.sendKeys(prop.getProperty("password"));

		loginbutton.click();
	}

	
	
	public boolean getUrl()
	{

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String url = driver.getCurrentUrl();

		System.out.println(url);

		if (url.contains("Nokari")) 
		{
			return false;
		} 
		else 
		{
			return true;
		}
	}

}

