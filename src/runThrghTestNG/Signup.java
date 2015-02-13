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
import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;
import org.openqa.selenium.support.ui.Select;

//activation.DataHandler;
/**
 *
 * @author reena.sharma
 */
public class Signup extends BaseClass {

    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
    String pwd= "Intel@01";
    
        
    @Test(groups = {"SignUpTest"},priority = 0)
    public void SignUp_functionality_for_Brokerportal_user() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    System.out.println("TestCase Description : To verify the functionality of Sign Up for Producer or Broker portal user"); 
    ob1.bbcubelogin();
    Thread.sleep(8000);
    
    driver.findElement(By.linkText("Brokerages")).click();
   // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("brokerages"))).click();
    Thread.sleep(4000);
    System.out.println("Step -1 : Searching for Test Borker to register producer ");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).sendKeys("TestBroker2");
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_button"))).click();
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Searched_text_row"))).click();
    Thread.sleep(3000);
    System.out.println("Step -2 :Addition of Producer Initiated ");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Add_Producer_button"))).click();
    Thread.sleep(9000);
    System.out.println("Step -3 :Generation of Random Producer name ");
    int intname = ob2.randomusername();
    String name = Integer.toString(intname);
    String final_names = "Test" + name;
    
    System.out.println("Step -4 :Mandatory Data fill on wizard first page");
   
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fname"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fname"))).sendKeys(final_names);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("lastname"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("lastname"))).sendKeys("producer");
    
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
    
   driver.findElement(caller.Elements(CONFIGOBJ.getProperty("ntes"))).clear();
   driver.findElement(caller.Elements(CONFIGOBJ.getProperty("ntes"))).sendKeys("Test NotesTest NotesTest NotesTest NotesTest Notes");
    
   String nick_name = "Nic".concat(final_names); //+ final_names;
   driver.findElement(caller.Elements(CONFIGOBJ.getProperty("nic_nm"))).clear();
   driver.findElement(caller.Elements(CONFIGOBJ.getProperty("nic_nm"))).sendKeys(nick_name);
  
   driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pro"))).clear();
   driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pro"))).sendKeys("test punctuation");
  
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
      
    System.out.println("Step -9 :Email sign up page navigation through generated URL ");
    String Cur= driver.getCurrentUrl();
    driver.navigate().to(ur);
    Thread.sleep(2000);
    }
    @Test(groups = {"SignUpTest"},priority = 1)
    public void Grantprovisioning_Step1_functionality_for_Brokerportal_user() throws InterruptedException {
    Assert.assertEquals("Producer Registration", driver.getTitle());
   
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).sendKeys(pwd);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).sendKeys(pwd);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_next_button"))).click();
    Thread.sleep(6000);
    }
    
    @Test(groups = {"SignUpTest"},priority = 2)
    public void Grantprovisioning_Step2_prevbutton_functionality_for_Brokerportal_user() throws InterruptedException {
    Thread.sleep(4000);
    Assert.assertEquals("Producer Registration", driver.getTitle());
    
    String a1= "ABC Car";
    String a2= "1945";
    String a3= "ABC Place";
    
    Thread.sleep(4000);
    new Select(driver.findElement(By.id("MasterPageContent_wzdProdSignUp_ddlQuestion1"))).selectByVisibleText("What was the make and model of your first car ?");
    driver.findElement(By.cssSelector("option[value=\"4\"]")).click();
    Thread.sleep(6000);
    
    new Select(driver.findElement(By.id("MasterPageContent_wzdProdSignUp_ddlQuestion2"))).selectByVisibleText("In what year was your father born ?");
    driver.findElement(By.cssSelector("#MasterPageContent_wzdProdSignUp_ddlQuestion2 > option[value=\"7\"]")).click();
    Thread.sleep(6000);
    
    new Select(driver.findElement(By.id("MasterPageContent_wzdProdSignUp_ddlQuestion3"))).selectByVisibleText("What was your favorite place to visit as a child ?");
    driver.findElement(By.cssSelector("#MasterPageContent_wzdProdSignUp_ddlQuestion3 > option[value=\"6\"]")).click();
    Thread.sleep(6000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("answer1"))).sendKeys(a1);
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("answer2"))).sendKeys(a2);
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("answer3"))).sendKeys(a3);
    Thread.sleep(4000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_prev_button"))).click();
    Thread.sleep(5000);
    
    Assert.assertEquals("Producer Registration", driver.getTitle());
    }
    @Test(groups = {"SignUpTest"},priority = 3)
    public void Grantprovisioning_Step2_finishbutton_functionality_for_Brokerportal_user() throws InterruptedException {
    
    String email = driver.findElement(By.id("MasterPageContent_wzdProdSignUp_txtEmail")).getAttribute("value");
    
    Thread.sleep(4000);
    System.out.println("Email Address: " +email); 
    Thread.sleep(4000);
    System.out.println("\n"); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).sendKeys(pwd);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).sendKeys(pwd);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_next_button"))).click();
     Thread.sleep(4000);
    
    Assert.assertEquals("Producer Registration", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_finish_button"))).click();
     Thread.sleep(4000);
    
    Assert.assertEquals("Producer Sign up Is Complete!", driver.getTitle());
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rtn_login"))).click();
     Thread.sleep(4000);
    
  //  Assert.assertEquals("Dashboard", driver.getTitle());
    
   System.out.println("Step -10 :Login with newly created Producer Credential");
   // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rtn_login"))).click();

    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys(email);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys(pwd);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    Thread.sleep(4000);
    ob1.logout(); 
    }
        
    @Test(groups = {"SignUpTest"},priority = 4)
    public void Deprovisioning_and_reprovisioning_functionality_of_Existing_Brokerportal_user() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    Thread.sleep(6000);
    System.out.println("To verify the Deprovisioning  and re-provisioning  functionality of Existing Broker portal user");        
    ob1.bbcubelogin();
    Thread.sleep(6000);

    driver.findElement(By.linkText("Producers")).click();
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).sendKeys("testree6");
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("producersearch_btn"))).click();
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("searched_producer"))).click();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("bp_tab"))).click();    
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("de_prov"))).click();
    Thread.sleep(4000);
    Thread.sleep(4000);
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    System.out.println("Alert Text is: " + alertText);
    alert.accept();
    Thread.sleep(3000);
    System.out.println("User SuccessFully Get De-provisioned");
    Thread.sleep(3000);    
    System.out.println("Re-Provisioning of De-provisioned user ");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_prov_access_button"))).click();
    Thread.sleep(4000);
    Alert alert1 = driver.switchTo().alert();
    String alertText1 = alert1.getText();
    System.out.println("Alert Text is: " + alertText1);
    alert1.accept();
    Thread.sleep(5000);
    String ur = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("gen_url"))).getText();
    
    driver.findElement(By.linkText("Logout")).click();
    
    System.out.println("Email sign up page navigation through generated URL ");
    
    //String Cur= driver.getCurrentUrl();
    driver.navigate().to(ur);
    Thread.sleep(5000);
   
    String email = driver.findElement(By.id("MasterPageContent_wzdProdSignUp_txtEmail")).getAttribute("value");
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).sendKeys(pwd);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).sendKeys(pwd);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_next_button"))).click();
    
    Assert.assertEquals("Producer Registration", driver.getTitle());
    Thread.sleep(8000);
       
    String a1= "ABC Car";
    String a2= "1945";
    String a3= "ABC Place";
    
    Thread.sleep(4000);
    new Select(driver.findElement(By.id("MasterPageContent_wzdProdSignUp_ddlQuestion1"))).selectByVisibleText("What was the make and model of your first car ?");
    driver.findElement(By.cssSelector("option[value=\"4\"]")).click();
    Thread.sleep(6000);
    
    new Select(driver.findElement(By.id("MasterPageContent_wzdProdSignUp_ddlQuestion2"))).selectByVisibleText("In what year was your father born ?");
    driver.findElement(By.cssSelector("#MasterPageContent_wzdProdSignUp_ddlQuestion2 > option[value=\"7\"]")).click();
    Thread.sleep(6000);
    
    new Select(driver.findElement(By.id("MasterPageContent_wzdProdSignUp_ddlQuestion3"))).selectByVisibleText("What was your favorite place to visit as a child ?");
    driver.findElement(By.cssSelector("#MasterPageContent_wzdProdSignUp_ddlQuestion3 > option[value=\"6\"]")).click();
    Thread.sleep(6000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("answer1"))).sendKeys(a1);
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("answer2"))).sendKeys(a2);
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("answer3"))).sendKeys(a3);
    Thread.sleep(5000);
        
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_finish_button"))).click();
    Thread.sleep(4000);
    
    Assert.assertEquals("Producer Sign up Is Complete!", driver.getTitle());   
    System.out.println(" Login with Re-provisioned Producer Credential");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rtn_login"))).click();
    Thread.sleep(6000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys(email);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys(pwd);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    Thread.sleep(4000);
    ob1.logout(); 
    }
       
    @Test(groups = {"SignUpTest"},priority = 5)
    public void Element_verification_on_Brokerportal_signup_page() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    System.out.println("TestCase Description : To verify that are present on the Sign Up page.\n" + "1) First Name\n" + "2) Last Name\n" + "3) Email Address\n" + "4) Password\n" + "5) Confirm Password\n" + "6) Submit button"); 
    ob1.bbcubelogin();
    Thread.sleep(7000);
    driver.findElement(By.linkText("Producers")).click();
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).sendKeys("test9987673");
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("producersearch_btn"))).click();
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("searched_producer"))).click();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("bp_tab"))).click();    
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("resend_prov"))).click();
    Thread.sleep(5000);
    
    String ur = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("gen_url"))).getText();
    
    driver.findElement(By.linkText("Logout")).click();
   
    System.out.println("Email sign up page navigation through generated URL ");
    
    String Cur= driver.getCurrentUrl();
    driver.navigate().to(ur);
            
    caller.Elements(CONFIGOBJ.getProperty("fnm_txt")).findElement(driver);
    caller.Elements(CONFIGOBJ.getProperty("lnm_txt")).findElement(driver);
    caller.Elements(CONFIGOBJ.getProperty("pass")).findElement(driver);
    caller.Elements(CONFIGOBJ.getProperty("cpass")).findElement(driver);
    caller.Elements(CONFIGOBJ.getProperty("grant_next_button")).findElement(driver);
    
    System.out.println("All Elements are present on Producer sign up page"); 
         
    Thread.sleep(4000);
    }
    
    @Test(groups = {"SignUpTest"},priority = 6)
    public void validation_check_for_blank_Password_Fields() throws InterruptedException {
    
    System.out.println("TestCase Description :To check the validation for Password Fields"); 
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_next_button"))).click();
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
        
        try {
           Assert.assertEquals(validation, "The following errors occurred: You must enter in a password You must enter in a confirm password");
           System.out.println("*********** Validation Check done for*************");   
        } catch (Exception t) {

        }   
    Thread.sleep(4000);
    }
    
    @Test(groups = {"SignUpTest"},priority = 7)
    public void validation_check_for_Password_Fields_having_less_than_8charcter() throws InterruptedException {
    
    System.out.println("TestCase Description :To check the validation for Password Fields for less than 8 chacters");        
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).sendKeys("12345");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).sendKeys("12345");
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_next_button"))).click();
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
        try {
           Assert.assertEquals(validation, "The following errors occurred: The length of the password should be alphanumeric with at least 8 characters and one capital letter");
           System.out.println("*********** Validation Check done *************");   
        } catch (Exception t) {

        }   
    }
    
    @Test(groups = {"SignUpTest"},priority = 8)
    public void validation_check_for_Password_Fields_having_password_mismatch() throws InterruptedException {
    
    System.out.println("TestCase Description :To check the validation for Password Fields for mismatch");        
   
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pass"))).sendKeys("Intel@01");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cpass"))).sendKeys("12345678");
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grant_next_button"))).click();
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
        try {
           Assert.assertEquals(validation, "The following errors occurred: Password must match.");
           System.out.println("*********** Validation Check done *************");   
        } catch (Exception t) {

        } 
        Thread.sleep(5000);
    driver.navigate().to("https://bbqubed.tbsmga.com/Connect/Default.aspx");   
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    }   
   
}

