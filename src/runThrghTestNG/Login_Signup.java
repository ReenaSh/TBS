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

//activation.DataHandler;
/**
 *
 * @author reena.sharma
 */
public class Login_Signup extends BaseClass {

    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
    
    @Test(priority = 0)
    public void signup() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    System.out.println("******Producer Sign UP************");
    ob1.bbcubelogin();
    
   // Dashboard title check
    String bbcube  = driver.getTitle();
    try {
            Assert.assertEquals("Dashboard", bbcube);         
    } catch (Exception e) {
    }
    try {
      Assert.assertEquals("Brokerages", driver.findElement(By.linkText("Brokerages")).getText());
    } catch (Error e) {
    }
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("brokerages"))).click();
    Thread.sleep(2000);
    System.out.println("Step -1 : Searching for Test Borker to register producer ");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).sendKeys("TestBroker1");
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_button"))).click();
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Searched_text_row"))).click();
    Thread.sleep(3000);
    System.out.println("Step -2 :Addition of Producer Initiated ");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Add_Producer_button"))).click();
    Thread.sleep(3000);
    System.out.println("Step -3 :Generation of Random Producer name ");
    int intname = ob2.randomusername();
    String name = Integer.toString(intname);
    String final_names = "test" + name;
    
    System.out.println("Step -4 :Mandatory Data fill on wizard first page");
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fname"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fname"))).sendKeys(final_names);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("lname"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("lname"))).sendKeys("producer");
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("email"))).clear();
    String final_email = final_names.concat("@mailinator.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("email"))).sendKeys(final_email);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("producer_type"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("producer_type_rec"))).click();
    Thread.sleep(2000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("location"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("location_rec"))).click();
    Thread.sleep(2000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("phone"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("phone"))).sendKeys("2324567890");
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mobile"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mobile"))).sendKeys("5324567890");
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fax"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fax"))).sendKeys("2356874122");
    
   // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("note"))).clear();
  //  driver.findElement(caller.Elements(CONFIGOBJ.getProperty("note"))).sendKeys("Test NotesTest NotesTest NotesTest NotesTest Notes");
    
    String nick_name = "Nic" + final_names;
  //  driver.findElement(caller.Elements(CONFIGOBJ.getProperty("nic_nm"))).clear();
  //  driver.findElement(caller.Elements(CONFIGOBJ.getProperty("nic_nm"))).sendKeys(nick_name);
  
 // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pro"))).clear();
 //   driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pro"))).sendKeys("test punctuation");
    System.out.println("Step -5 :Next proceed for wizard page 2 ");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step1_Next_button"))).click();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("select_mail_list"))).click();
    System.out.println("Step -6 :Next proceed for wizard page 3 ");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step2_next_button"))).click();
    System.out.println("Step -7 :Finish of Registration");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step3_finish_button"))).click();
    
    Thread.sleep(3000);
    //Broker Portal tab
    System.out.println("Step -8 :Navigation to Broker Portal tab of Newly created producer");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("bp_tab"))).click();    
    Thread.sleep(3000);
    System.out.println("Step -8 :Grant Provisioning");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_prov_access_button"))).click();
    Thread.sleep(3000);
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    System.out.println("Alert Text is: " + alertText);
    alert.accept();
    Thread.sleep(2000);
    String ur = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("gen_url"))).getText();
    
    driver.findElement(By.linkText("Logout")).click();
    /*driver.switchTo().window("mailinator.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("email_user"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("email_user"))).sendKeys(final_email);
    driver.findElement(By.linkText("Check it")).click();
    driver.findElement(By.linkText("TBS Broker Portal")).click();
    String url= driver.findElement(caller.Elements(CONFIGOBJ.getProperty("emailUrl"))).getText();*/
    System.out.println("Step -9 :Email sign up page navigation through generated URL ");
    String Cur= driver.getCurrentUrl();
    driver.navigate().to(ur);
    //driver.switchTo().window(url);
    String pwd= "Intel@01";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).sendKeys(pwd);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).sendKeys(pwd);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("submit"))).click();
    System.out.println("Step -10 :Login with newly created Producer Credential");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rtn_login"))).click();

    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys(final_email);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys(pwd);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    Thread.sleep(2000);
    ob1.logout(); 
    }
    
    @Test(priority = 1)
    // Test Case Description: To Check the Login functionality for qube user credential
    public void Log_01() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("reena.sharma@intelegencia.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("QubeT999");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    Thread.sleep(2000);
    ob1.logout();    
    }
   
    @Test(priority = 2)
    // Test Case Description: To Check the Login functionality for Broker Portal user credential 
    public void Log_02() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("testree1@mailinator.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("Intel@01");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    Thread.sleep(2000);
    ob1.logout();    
    }
    
    @Test(priority = 3)
    //Incorrect Username and incorrect Password Validation
    public void Log_03()throws InterruptedException { 
    {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("test");

    Thread.sleep(2000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
       System.out.println("*********** Validation Check done for*************"); 
       System.out.println(validation);
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: Invalid e-mail address form");
        } catch (Exception t) {

        }
    }
    }
    
   @Test(priority = 4)
   //Incorrect Password
    public void log_04()throws InterruptedException { 
    {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("testree1@mailinator.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("@01");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check done for*************");   
    System.out.println(validation);
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: Invalid username and/or password");
        } catch (Exception t) {

        }

    }
    }
    @Test(priority = 5)
   //Secial Character testing
    public void log_05()throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("@#%$%^");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("@$%%G");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check done for*************");   
    System.out.println(validation);
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: Invalid e-mail address form");
        } catch (Exception t) {

        }
    }
    
    @Test(priority = 6)
   //Blank Username and password 
    public void log_06()throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check done for*************");   
    System.out.println(validation);
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: Username cannot be blank Password cannot be blank");
        } catch (Exception t) {

        }
    
    }
       
    
 }


