/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Actions;

import runThrghTestNG.BaseClass;

/**

 * @author reena.sharma
 */
public class LoginLogoutHelper extends BaseClass{
    
   // Cube login should redirect user to BBcube portal 
    public void bbcubelogin() throws InterruptedException
    {
    ElementLocator caller = new ElementLocator();
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("reena.sharma@intelegencia.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("QubeT999");
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("keepme_signedin"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    }
       
        
    public void brokerlogin() throws InterruptedException
    {
    ElementLocator caller = new ElementLocator();
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("username_field"))).sendKeys("testree6@mailinator.com");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("password_field"))).sendKeys("Intel@01");
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("keepme_signedin"))).click();
   
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sign_incube"))).click();
    }
    
    public void logout()
    {
        ElementLocator caller = new ElementLocator();
        driver.findElement(caller.Elements(CONFIGOBJ.getProperty("a_logout"))).click();
    }
}