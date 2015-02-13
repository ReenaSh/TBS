/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runThrghTestNG;

import Actions.ElementLocator;
import Actions.LoginLogoutHelper;
import Actions.Random;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import static runThrghTestNG.BaseClass.CONFIGOBJ;
import static runThrghTestNG.BaseClass.driver;
import java.io.IOException;
/**
 *
 * @author reena.sharma
 */
public class FileUpload extends BaseClass {
    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
 
    @Test(priority = 0)
    public void FileUpload_functionality_of_Existing_Brokerage() throws InterruptedException, AWTException, IOException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(5000);
    System.out.println("FileUpload functionality of Existing Brokerage");        
    ob1.bbcubelogin();
    Thread.sleep(5000);

    driver.findElement(By.linkText("Brokerages")).click();
    Thread.sleep(2000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).sendKeys("TestBroker1");
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_button"))).click();
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Searched_text_row"))).click();
    Thread.sleep(3000);

     driver.findElement(caller.Elements(CONFIGOBJ.getProperty("attachment_btn"))).click();
    Thread.sleep(8000);
   // Assert.assertEquals("File Attachments", driver.getTitle());
    driver.findElement(By.id("MasterPageContent_txtDescription")).clear();
    driver.findElement(By.id("MasterPageContent_txtDescription")).sendKeys("test description");
    Thread.sleep(3000);
    
    String ss ="Intelligence";
    new Select(driver.findElement(By.id("MasterPageContent_ddlType"))).selectByVisibleText(ss);
    Thread.sleep(3000);
       
    driver.findElement(By.id("MasterPageContent_ASPxUploadControl1_Browse0")).click();
   
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("browse_btn"))).click();
    //driver.findElement(By.id("fbInspectButton")).click();
    //Runtime.getRuntime().exec("D:/TotalBS/AutoIT/test.exe");
    //selenium.type("locator", "D:\\TotalBS\\data\\test.jpg");
   

    Thread.sleep(25000); // wait for page load

    //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "D:\\TotalBS\\AutoIT\\test4.exe");
   // Runtime.getRuntime().exec("D:/TotalBS/AutoIT/file3.exe");
    
     
    Process proc1 = Runtime.getRuntime().exec("D:\\TotalBS\\AutoIT\\file3.exe");

    
    Thread.sleep(15000);    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("upload_btn"))).click();
    Thread.sleep(10000);
   
    Assert.assertEquals("File Attachments", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("uploaded_file"))).click();
         
    ob1.logout(); 
    }
    
}

 /* Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    System.out.println("Alert Text is: " + alertText);
    //alert.accept();
    alert.dismiss();
    Thread.sleep(2000);
    System.out.println("User SuccessFully Uploaded file.");
    Thread.sleep(2000);  */

//driver.findElement(By.id("MasterPageContent_ASPxUploadControl1_TextBox0_FakeInput")).sendKeys(imageurl);
   /* 
    new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.id("MasterPageContent_ASPxUploadControl1_TextBox0")));
    //driver.findElement(By.id("MasterPageContent_ASPxUploadControl1_TextBox0")).sendKeys(imageurl);
    driver.findElement(By.id("MasterPageContent_ASPxUploadControl1_Browse0")).click();
    driver.findElement(By.id("MasterPageContent_ASPxUploadControl1_Browse0")).sendKeys(imageurl);
    ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility = 'visible'; arguments[0].style.height = '1px'; arguments[0].style.width = '1px'; arguments[0].style.opacity = 1", imageurl);
    
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys(imageurl);
  //  WebElement elm = driver.findElement(By.id("MasterPageContent_ASPxUploadControl1_Browse0"));
    //        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility = 'visible'; arguments[0].style.height = '1px'; arguments[0].style.width = '1px'; arguments[0].style.opacity = 1", elm);
   //         elm.sendKeys(imageurl);
  
    
 File file = null;

    try {
        file = new File(FileUpload.class.getClassLoader().getResource("test.jpg").toURI());
        } catch (URISyntaxException e) {
        }

    Assert.assertTrue(file.exists()); 

    WebElement browseButton = driver.findElement(By.id("MasterPageContent_ASPxUploadControl1_Browse0"));
    browseButton.sendKeys(file.getAbsolutePath());


  /*driver.switchTo().activeElement();
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_D);        // D
    r.keyRelease(KeyEvent.VK_D);
    r.keyPress(KeyEvent.VK_COLON);    // : (colon)
    r.keyRelease(KeyEvent.VK_COLON);
    r.keyPress(KeyEvent.VK_SLASH);    // / (slash)
    r.keyRelease(KeyEvent.VK_SLASH);
    r.keyPress(KeyEvent.VK_T);        // Users
    r.keyRelease(KeyEvent.VK_T);
    r.keyPress(KeyEvent.VK_ALT); 
    r.keyPress(KeyEvent.VK_O);
    r.keyRelease(KeyEvent.VK_O);
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_L);
    r.keyRelease(KeyEvent.VK_L);    
    r.keyRelease(KeyEvent.VK_ALT);  
    r.keyPress(KeyEvent.VK_B);
    r.keyRelease(KeyEvent.VK_B);
    r.keyPress(KeyEvent.VK_S);
    r.keyRelease(KeyEvent.VK_S);
    r.keyPress(KeyEvent.VK_SLASH);    // / (slash)
    r.keyRelease(KeyEvent.VK_SLASH);
    r.keyPress(KeyEvent.VK_ALT); 
    r.keyPress(KeyEvent.VK_D);
    r.keyRelease(KeyEvent.VK_D);
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_A);    
    r.keyRelease(KeyEvent.VK_ALT); 
    r.keyPress(KeyEvent.VK_SLASH);    // / (slash)
    r.keyRelease(KeyEvent.VK_SLASH);
    r.keyPress(KeyEvent.VK_2);
    r.keyRelease(KeyEvent.VK_2);
    r.keyPress(KeyEvent.VK_DECIMAL);
    r.keyRelease(KeyEvent.VK_DECIMAL);
    r.keyPress(KeyEvent.VK_ALT); 
    r.keyPress(KeyEvent.VK_X);
    r.keyRelease(KeyEvent.VK_X);
    r.keyPress(KeyEvent.VK_L);
    r.keyRelease(KeyEvent.VK_L);
    r.keyPress(KeyEvent.VK_S);
    r.keyRelease(KeyEvent.VK_S);
    r.keyPress(KeyEvent.VK_X);
    r.keyRelease(KeyEvent.VK_X);    
    r.keyRelease(KeyEvent.VK_ALT); 
// etc. for the whole file path
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    r.keyPress(KeyEvent.VK_ENTER);    // confirm by pressing Enter in the end
    r.keyRelease(KeyEvent.VK_ENTER);
    */