/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runThrghTestNG;

import Actions.ElementLocator;
import Actions.LoginLogoutHelper;
import Actions.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import static runThrghTestNG.BaseClass.driver;

/**
 *
 * @author reena.sharma
 */
public class Admin_UserMgmt extends BaseClass {
    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
    
    @Test(groups = {"Tasking Template Test"},priority = 0)
    public void Navigation_of_UserMgmt_page() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    System.out.println("TestCase Description : To verify the redirection of Task Template Listing link on Setting from Setting page"); 
    driver.get("https://bbqubed.tbsmga.com/Connect/Default.aspx");
    Assert.assertEquals("Login", driver.getTitle());
    driver.findElement(By.id("MasterPageContent_txtUsername")).clear();
    driver.findElement(By.id("MasterPageContent_txtUsername")).sendKeys("Gaurav.kashyap@intelegencia.com");
    driver.findElement(By.id("MasterPageContent_LoginButton")).click();
    Assert.assertEquals("Dashboard", driver.getTitle());
    driver.findElement(By.linkText("Administration")).click();
    Assert.assertEquals("Administration", driver.getTitle());
    driver.findElement(By.linkText("User Management")).click();
    Assert.assertEquals("User Management", driver.getTitle());
    driver.findElement(By.id("MasterPageContent_linkInternal")).click();
    Assert.assertEquals("User Management", driver.getTitle());
    driver.findElement(By.id("MasterPageContent_btnNewUser")).click();
    Assert.assertEquals("Add New User", driver.getTitle());
    driver.findElement(By.id("MasterPageContent_detailsUser_Name")).clear();
    driver.findElement(By.id("MasterPageContent_detailsUser_Name")).sendKeys("Reena Sharma");
    driver.findElement(By.id("MasterPageContent_detailsUser_Username")).clear();
    driver.findElement(By.id("MasterPageContent_detailsUser_Username")).sendKeys("reena.sharma@intelegencia.com");
    driver.findElement(By.id("MasterPageContent_detailsUser_Password")).clear();
    driver.findElement(By.id("MasterPageContent_detailsUser_Password")).sendKeys("QubeT999");
    new Select(driver.findElement(By.id("MasterPageContent_detailsUser_IsActive"))).selectByVisibleText("Active");
    new Select(driver.findElement(By.id("MasterPageContent_detailsUser_ddlOrganization"))).selectByVisibleText("Intelegencia");
    driver.findElement(By.id("MasterPageContent_detailsUser_btnInsert")).click();
    Assert.assertEquals("User Management", driver.getTitle());
    driver.findElement(By.linkText("Reena Sharma")).click();
    Assert.assertEquals("User Management", driver.getTitle());
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    new Select(driver.findElement(By.id("MasterPageContent_grdPermissions_ddlPermissions"))).selectByVisibleText("P_INT_EVENTS");
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    new Select(driver.findElement(By.id("MasterPageContent_grdPermissions_ddlPermissions"))).selectByVisibleText("P_INT_QCOM");
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    new Select(driver.findElement(By.id("MasterPageContent_grdPermissions_ddlPermissions"))).selectByVisibleText("P_INT_QENT");
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    new Select(driver.findElement(By.id("MasterPageContent_grdPermissions_ddlPermissions"))).selectByVisibleText("P_INT_QGEN");
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    new Select(driver.findElement(By.id("MasterPageContent_grdPermissions_ddlPermissions"))).selectByVisibleText("P_INT_QPRV");
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    new Select(driver.findElement(By.id("MasterPageContent_grdPermissions_ddlPermissions"))).selectByVisibleText("P_INT_QRAF");
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    new Select(driver.findElement(By.id("MasterPageContent_grdPermissions_ddlPermissions"))).selectByVisibleText("P_INT_ST");
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnLinkInsert")).click();
    new Select(driver.findElement(By.id("MasterPageContent_grdPermissions_ddlPermissions"))).selectByVisibleText("P_INT_SC");
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnInsert")).click();
    Assert.assertEquals("Application Exception", driver.getTitle());
    Assert.assertEquals("User Management", driver.getTitle());
    driver.findElement(By.id("MasterPageContent_grdPermissions_btnDelete_12")).click();
    //Assert.assertTrue(closeAlertAndGetItsText().matches("^Are you sure you would like to delete this item[\\s\\S]$"));
    driver.findElement(By.linkText("Logout")).click();
    Assert.assertEquals("Login", driver.getTitle());
    driver.findElement(By.id("MasterPageContent_txtUsername")).clear();
    driver.findElement(By.id("MasterPageContent_txtUsername")).sendKeys("reena.sharma@intelegencia.com");
    driver.findElement(By.id("MasterPageContent_LoginButton")).click();
    Assert.assertEquals("Dashboard", driver.getTitle());
    driver.findElement(By.linkText("Logout")).click();
    Assert.assertEquals("Login", driver.getTitle());
    
    }
}
