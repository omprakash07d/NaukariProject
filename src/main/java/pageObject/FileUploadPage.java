//package pageObject;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class FileUploadPage {
//
//    WebDriver driver;
//
//    // Locators for the elements
//    @FindBy(xpath = "//input[@id='fileInput']")
//    private WebElement uploadInput;
//
//    @FindBy(xpath = "//button[@id='fileSubmit']")
//    private WebElement uploadButton;
//
//    @FindBy(xpath = "//div[@id='uploaded-files']")
//    private WebElement uploadSuccessMessage;
//
//    // Constructor
//    public FileUploadPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    // Method to upload a file
//    public void uploadFile(String filePath) {
//        uploadInput.sendKeys(filePath); // Send file path to the upload input
//        uploadButton.click(); // Click the upload button
//    }
//
//    // Method to verify upload success message
//    public boolean isUploadSuccessful() {
//        return uploadSuccessMessage.isDisplayed();
//    }
//
//    // Getter for success message text
//    public String getSuccessMessage() {
//        return uploadSuccessMessage.getText();
//    }
//}
