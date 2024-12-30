package pageObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.BaseClass1;

public class ProfilePage extends BaseClass1 {
	WebDriver driver;
	JavascriptExecutor js;

	WebDriverWait wait;

	// @FindBy(xpath = "//a[normalize-space()='View profile']")


	@FindBy(xpath = "//a[normalize-space()='View profile']")

	//@FindBy(xpath = "//a[normalize-space()='Complete profile']")
	WebElement viewProfile;

	@FindBy(xpath = "//*[@id='lazyResumeHead']/div/div/div[1]/span[2]")
	private WebElement clickOnResumeHeadline;

	@FindBy(xpath = "//*[@id='resumeHeadlineTxt']")
	private WebElement headline21;

	@FindBy(xpath = "/html/body/div[6]/div[8]/div[2]/form/div[3]/div/button")
	private WebElement saveHeadline21;

	@FindBy (xpath ="//input[@value='Update resume']")

	//@FindBy(xpath = "//span[@class='dummyUploadNewCTA']")
	private WebElement upload;

	public ProfilePage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnViewProfile() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		viewProfile.click();

	}

	public void scroll() {
		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0, 500);"); // Scroll vertically to 500 pixels
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void clickOnResume() {

		clickOnResumeHeadline.click();

	}

	public void newheadline() {
		headline21.clear();
		headline21.sendKeys(prop.getProperty("headline"));
	}

	public void saveHeadline() {
		saveHeadline21.click();
	}

	public void resumeUpload(String fileName) {
		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,-500);"); // Scroll vertically to 500 pixels

		// Use Paths.get() to get the absolute path from the project structure
		String filePath = Paths.get(System.getProperty("user.dir"), "Resume", fileName).toString();

		// Print the file path for debugging purposes
		System.out.println("File path: " + filePath);

		// Upload the file using the 'sendKeys' method
		
		upload.sendKeys(filePath);

	}

}