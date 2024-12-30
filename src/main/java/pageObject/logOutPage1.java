package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOutPage1 {
	
WebDriver driver;
		
	@FindBy(xpath = "//*[@id='ni-gnb-header-section']/div[3]/div[2]/div[4]/div/div[2]/img") 
	private WebElement profileIcon;
	
	@FindBy(xpath ="//*[@id='ni-gnb-header-section']/div[3]/div[2]/div[4]/div[2]/div[2]/div/div[3]/div/div[1]/div[4]/a")
	private WebElement logOutButton;
	
	public logOutPage1(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnProfileIcon()
	{		
		profileIcon.click();	
	}
	
	public void ClickOnLogOutButton()
	{		      
		logOutButton.click();
	}
	
	
	

}