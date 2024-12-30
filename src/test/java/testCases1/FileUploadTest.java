//package testCases1;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pageObject.FileUploadPage;
//
//
//import java.io.File;
//
//public class FileUploadTest extends BaseTest1 {
//
//    @Test
//    public void testFileUpload() {
//        // Navigate to the website
//        driver.get("https://practice.expandtesting.com/upload");
//
//        // Initialize the Page Object
//        FileUploadPage fileUploadPage = new FileUploadPage(driver);
//
//        // File to be uploaded
//        String filePath = System.getProperty("user.dir") + "\\Resume\\Omprakash_Diwathe_Automation_Tester.pdf"; // Replace with your file
//
//        // Ensure the file exists
//        File file = new File(filePath);
//        Assert.assertTrue(file.exists(), "File does not exist at path: " + filePath);
//
//        // Perform the file upload
//        fileUploadPage.uploadFile(filePath);
//
//        // Verify upload success
//        Assert.assertTrue(fileUploadPage.isUploadSuccessful(), "File upload failed.");
//        Assert.assertEquals(fileUploadPage.getSuccessMessage(), "File uploaded successfully.", "Success message does not match.");
//    }
//}
