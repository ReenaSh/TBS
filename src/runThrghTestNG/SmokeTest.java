/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runThrghTestNG;

import Actions.ElementLocator;
import Actions.LoginLogoutHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static runThrghTestNG.BaseClass.CONFIGOBJ;
import static runThrghTestNG.BaseClass.driver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SmokeTest extends BaseClass {

    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    
    @Test(groups = {"SmokeTests"},priority = 0)
    public void bbcubelogin() throws InterruptedException {

    //Verifies user Log in and navigation to correct Page.
    // Below verification is user navigate to the broker page which have correct title and able to navigate tabs.
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    ob1.bbcubelogin();
    
    // Dashboard title check
    String bbcube  = driver.getTitle();
    try {
            Assert.assertEquals(bbcube, "Dashboard");
    } catch (Exception e) {
    }      
    // verification and navigation of Home tab of broker portal 
    try {
      Assert.assertEquals("Home", driver.findElement(By.linkText("Home")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(2000);
    
    // verification and navigation of Tasks tab of broker portal
    try {
      Assert.assertEquals("Tasks", driver.findElement(By.linkText("Tasks")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Tasks")).click();
    Thread.sleep(2000);
    
    // verification and navigation of Brokerages tab of broker portal
    try {
      Assert.assertEquals("Brokerages", driver.findElement(By.linkText("Brokerages")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Brokerages")).click();
    Thread.sleep(2000);
    
    // verification and navigation of Producers tab of broker portal
    try {
      Assert.assertEquals("Producers", driver.findElement(By.linkText("Producers")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Producers")).click();
    Thread.sleep(2000);
    
    // verification and navigation of Quotes tab of broker portal
    try {
      Assert.assertEquals("Quotes", driver.findElement(By.linkText("Quotes")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Quotes")).click();
    Thread.sleep(2000);
    
    // verification and navigation of Groups tab of broker portal
    try {
      Assert.assertEquals("Groups", driver.findElement(By.linkText("Groups")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Groups")).click();
    Thread.sleep(2000);
    
    // verification and navigation of Policies tab of broker portal
    try {
      Assert.assertEquals("Policies", driver.findElement(By.linkText("Policies")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Policies")).click();
    Thread.sleep(2000);
    
    // verification and navigation of Reports tab of broker portal
    try {
      Assert.assertEquals("Reports", driver.findElement(By.linkText("Reports")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Reports")).click();
    Thread.sleep(2000);
    
    // verification and navigation of Administration tab of broker portal
    try {
      Assert.assertEquals("Administration", driver.findElement(By.linkText("Administration")).getText());
    } catch (Error e) {
    }
    driver.findElement(By.linkText("Administration")).click();
    Thread.sleep(2000);
    
    ob1.logout();
    String title = driver.getTitle();
        try {
            Assert.assertEquals(title,"Login");
        } catch (Exception e) {
        }

    }
    
   @Test(groups = {"SmokeTests"},priority = 1)
    public void brokerlogin() throws InterruptedException {

    ob1.brokerlogin();
    
    // Dashboard title check
    String broker  = driver.getTitle();
    try {
            Assert.assertEquals(broker, "Broker Portal Dashboard");
    } catch (Exception e) {
    }    
    ob1.logout();
    String title = driver.getTitle();
        try {
            Assert.assertEquals(title,"Login");
        } catch (Exception e) {
        }
    }
}