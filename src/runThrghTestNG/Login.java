/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runThrghTestNG;
import Actions.ElementLocator;
import Actions.LoginLogoutHelper;
import Actions.Random;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static runThrghTestNG.BaseClass.CONFIGOBJ;
import static runThrghTestNG.BaseClass.driver;
import org.openqa.selenium.ie.InternetExplorerDriver;


/**
 *
 * @author reena.sharma
 */
public class Login extends BaseClass {

    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
    Signup ob3 = new Signup();
    
    @Test(groups = {"LoginTest"},priority = 0)
    // Test Case Description: To Check the Login functionality for qube user credential
   
    public void Check_the_Login_functionality_with_qube_user_credential() throws InterruptedException {
    System.out.println("TestCase Description: To Check the Login functionality for qube user credential");    
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("reena.sharma@intelegencia.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("QubeT999");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    Thread.sleep(3000);
    ob1.logout();    
    }
   
    @Test(groups = {"LoginTest"},priority = 1)
    // Test Case Description: To Check the Login functionality for Broker Portal user credential 
    //public void Log_02() throws InterruptedException {
    public void Check_the_Login_functionality_with_Broker_Portal_user_credential() throws InterruptedException {         
    System.out.println("TestCase Description: To Check the Login functionality for Broker Portal user credential");        
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("testree6@mailinator.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("Intel@01");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    Thread.sleep(3000);
    ob1.logout();    
    }
    
    @Test(groups = {"LoginTest"},priority = 2)
    //Incorrect Username and incorrect Password Validation
    public void Validation_Check_for_Incorrect_Username_n_incorrect_Password()throws InterruptedException { 
    System.out.println("TestCase Description: Validation Check with Incorrect Username and Incorrect Password ");        
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("test");

    Thread.sleep(3000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
       
       //System.out.println(validation);
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: Invalid e-mail address form");
           System.out.println("*********** Validation Check done *************"); 
        } catch (Exception t) {

        }
    
    }
    
    
   @Test(groups = {"LoginTest"},priority = 3)
   //Incorrect Password
  //  public void log_04()throws InterruptedException { 
    public void Validation_Check_for_correct_Username_n_incorrect_Password()throws InterruptedException { 
    System.out.println("TestCase Description: Validation Check with Correct Username and Incorrect Password ");        
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("testree1@mailinator.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("@01");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
      
    //System.out.println(validation);
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: Invalid username and/or password");
           System.out.println("*********** Validation Check done*************"); 
        } catch (Exception t) {

        }

    }
    
    @Test(groups = {"LoginTest"},priority = 4)
   //Secial Character testing
    public void Validation_Check_for_specialcharacters_on_Username_n_Password()throws InterruptedException { 
    System.out.println("TestCase Description: Validation Check with Secial Character "); 
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("@#%$%^");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("@$%%G");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
       
    //System.out.println(validation);
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: Invalid e-mail address form");
           System.out.println("*********** Validation Check done *************");
        } catch (Exception t) {

        }
    }
    
    @Test(groups = {"LoginTest"},priority = 5)
   //Blank Username and password 
    public void Validation_Check_for_blank_Username_n_Password()throws InterruptedException {
    System.out.println("TestCase Description: Validation Check with Blank User name and Password"); 
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    
    //System.out.println(validation);
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: Username cannot be blank Password cannot be blank");
           System.out.println("*********** Validation Check done for*************");   
        } catch (Exception t) {

        }
    }
    
    @Test(groups = {"LoginTest"},priority = 6)
   // Remember My Username  functionality	
    public void Check_for_remember_my_Username_functionality()throws InterruptedException {
    System.out.println("TestCase Description: To Check the Remember My Username functionality"); 
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("reena.sharma@intelegencia.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("QubeT999");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("keepme_signedin"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    Thread.sleep(2000);
    ob1.logout();
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).click();
    String lastsignieduser = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).getAttribute("value");
        
    try {
           Assert.assertEquals(lastsignieduser, "reena.sharma@intelegencia.com");
           System.out.println("*********** Remember My Username functionality is working *************");
        } catch (Exception t) {

        }
          
    }      

 }


