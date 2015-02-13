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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static runThrghTestNG.BaseClass.CONFIGOBJ;
import static runThrghTestNG.BaseClass.driver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import static runThrghTestNG.BaseClass.driver;

/**
 *
 * @author reena.sharma
 */
public class PublishUnpublish extends BaseClass {
    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
   
    @Test(groups = {"RFQ"},priority = 0)
    public void Verify_the_funtionality_of_NewRFQ()throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    ob1.bbcubelogin();
    Thread.sleep(4000);
    
    driver.findElement(By.linkText("Brokerages")).click();
    Assert.assertEquals("Brokerages", driver.getTitle());
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_textbox"))).sendKeys("Reena1");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_button"))).click();            
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Searched_text_row"))).click();             
 
    Assert.assertEquals("Brokerage Profile", driver.getTitle());
    driver.findElement(By.linkText("reena1test producer \"test nick nm\"")).click();
    Assert.assertEquals("Producer Profile", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rfq_btn"))).click();
    
    Thread.sleep(4000);
    Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).sendKeys("test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba_btn"))).click();
    Thread.sleep(3000); 
    
    Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
   }
    
    @Test(groups = {"RFQ"},priority = 1)
    public void Verify_the_functionality_of_Cancel_btn_on_Step1_wizard()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("can_button"))).click();
    Thread.sleep(3000); 
    Assert.assertEquals("Producer Profile", driver.getTitle());
    }
    
    @Test(groups = {"RFQ"},priority = 2)
    public void Verify_the_functionality_of_Add_new_group_button_on_Step1_wizard()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rfq_btn"))).click();
    
    Thread.sleep(4000);
    Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).sendKeys("test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba_btn"))).click();
    Thread.sleep(3000); 
   //Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    System.out.println("*********** Add new button clicked*************"); 
    Thread.sleep(3000);   
    }
    
    @Test(groups = {"RFQ"},priority = 3)
    public void Verify_the_validation_for_mandatory_fields_on_Step2_wizard()throws InterruptedException {
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check done for*************");   
    System.out.println(validation);  
   
    try {
        Assert.assertEquals(validation, "The following errors occurred: Legal name required Street address is required City is required Postal Code is required Renewal month is required. Invalid SIC selection");
    } catch (Exception t) {
    } 
    }
    
    @Test(groups = {"RFQ"},priority = 4)
    public void Verify_elements_on_Step2_AddNewGroup_page_on_BrokerPortal_Dashboard()throws InterruptedException {
   
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).isDisplayed();
    if (iselementpresent == true)
    {
       System.out.println("Leagal Name field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Leagal Name field on Step 2: Add New Group");
    }
    
    Boolean iselementpresent1 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).isDisplayed();
    if (iselementpresent1 == true)
    {
       System.out.println("DBA Name field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find DBA Name field on Step 2: Add New Group");
    }
    
    Boolean iselementpresentalt = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("alt_spelling"))).isDisplayed();
    if (iselementpresentalt == true)
    {
       System.out.println("Alternate Spellings field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Alternate Spellings field on Step 2: Add New Group");
    }
    
    Boolean iselementpresent2 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).isDisplayed();
    if (iselementpresent2 == true)
    {
       System.out.println("street address field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find street address field on Step 2: Add New Group");
    }
    
    Boolean iselementpresent3 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).isDisplayed();
    if (iselementpresent3 == true)
    {
       System.out.println("extend address field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find extend address field on Step 2: Add New Group");
    }
    
    Boolean iselementpresent4 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).isDisplayed();
    if (iselementpresent4 == true)
    {
       System.out.println("City field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find City field on Step 2: Add New Group");
    }
    Thread.sleep(2000);
    
    Boolean iselementpresent5 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).isDisplayed();
    if (iselementpresent5 == true)
    {
       System.out.println("Postal Code field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Postal Code field on Step 2: Add New Group");
    }
    
    Boolean iselementpresent6 = driver.findElement(By.id("MasterPageContent_wzd_ddlSic")).isDisplayed();
    if (iselementpresent6 == true)
    {
       System.out.println("SIC field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find SIC field on Step 2: Add New Group");
    }   
    
    Boolean iselementpresent7 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rfq_state"))).isDisplayed();
    if (iselementpresent7 == true)
    {
       System.out.println("State field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find State field on Step 2: Add New Group");
    }
    Boolean iselementpresent8 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_street_addr"))).isDisplayed();
    if (iselementpresent8 == true)
    {
       System.out.println("Mailinig Street Address field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Mailinig Street Address field on Step 2: Add New Group");
    }
    Boolean iselementpresent9 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_city"))).isDisplayed();
    if (iselementpresent9 == true)
    {
       System.out.println("Mailinig City field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Mailinig City field on Step 2: Add New Group");
    }
     Boolean iselementpresent10 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_state"))).isDisplayed();
    if (iselementpresent10 == true)
    {
       System.out.println("Mailinig State field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Mailinig State field on Step 2: Add New Group");
    }
    Boolean iselementpresent11 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_postal_code"))).isDisplayed();
    if (iselementpresent11 == true)
    {
       System.out.println("Mailinig Postal Code field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Mailinig Postal Code field on Step 2: Add New Group");
    }
    Boolean iselementpresent12 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_country_dd"))).isDisplayed();
    if (iselementpresent12 == true)
    {
       System.out.println("Mailinig Country field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Mailinig Country field on Step 2: Add New Group");
    }
    
    Boolean iselementpresent13 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("website_url"))).isDisplayed();
    if (iselementpresent13 == true)
    {
       System.out.println("Website URL field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Website URL field on Step 2: Add New Group");
    }
    Boolean iselementpresent14 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("renewal_mnth"))).isDisplayed();
    if (iselementpresent14 == true)
    {
       System.out.println("Renewal Month field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Renewal Month field on Step 2: Add New Group");
    }
    Boolean iselementpresent15 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("date_estb"))).isDisplayed();
    if (iselementpresent15 == true)
    {
       System.out.println("Date Business Established field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find Date Business Established field on Step 2: Add New Group");
    }
    Thread.sleep(3000);
    }
    
    @Test(groups = {"RFQ"},priority = 5)
    public void Verify_the_previous_button_functionality_on_Step2_AddNewGroup_page()throws InterruptedException {
    Thread.sleep(4000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_prev_btn"))).click();
    Thread.sleep(4000); 
    Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
    }
    
    @Test(groups = {"RFQ"},priority = 6)
    public void Verify_the_Cancel_button_functionality_on_Step2_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(4000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_cancel_btn"))).click();
    Thread.sleep(4000); 
    Assert.assertEquals("Producer Profile", driver.getTitle());
    }
    
    @Test(groups = {"RFQ"},priority = 7)
    public void Verify_the_previous_button_functionality_on_Step3_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rfq_btn"))).click();
    Thread.sleep(4000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).sendKeys("test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba_btn"))).click();
    Thread.sleep(4000); 
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(4000);   
     
    // New Quote Step 2:Add New Group
    System.out.println("Generation of Random leagal name ");
    int intname = ob2.randomlegalname();
    String lname = Integer.toString(intname);
    String final_lnames = "Test" + lname;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).sendKeys(final_lnames);
    
    String dd = "Test DBA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).sendKeys(dd);
    
    String alt_spell = "Test Alt Spellings";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("alt_spelling"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("alt_spelling"))).sendKeys(alt_spell);
    
    String saddr = "500 Market Street, Suite 100";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).sendKeys(saddr);
    
    String eaddr = "Santa Fe, NM";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).sendKeys(eaddr);

    String city = "Washigton";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).sendKeys(city);
    Thread.sleep(2000); 
    
    String ss ="WA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rfq_state"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rfq_state"))).sendKeys(ss);
    
    String pin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).sendKeys(pin);
    
    String msaddr = "500 Market Street, Suite 100";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_street_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_street_addr"))).sendKeys(msaddr);
    
    String mcity = "Washigton";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_city"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_city"))).sendKeys(mcity);
    Thread.sleep(2000); 
    
    String mss ="WA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_state"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_state"))).sendKeys(mss);
    
    String mpin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_postal_code"))).sendKeys(mpin);
    
    String mst = "UNITED STATES";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_listMailingCountry"))).selectByVisibleText(mst);
    
    String url = "http://google.com";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("website_url"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("website_url"))).sendKeys(url);
    
   String RM = "5 - May";
   // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("renewal_mnth"))).clear();
   // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("renewal_mnth"))).sendKeys(RM);
    new Select(driver.findElement(By.id("MasterPageContent_wzd_listRenewalMonth"))).selectByVisibleText(RM);
    
    String DBE = "1/2/2015";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("date_estb"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("date_estb"))).sendKeys(DBE);
    
    String sic ="172 - Grapes";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlSic"))).selectByVisibleText(sic);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_next_btn"))).click();        
    Thread.sleep(4000); 
  
    String RD = "1/24/2015";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("recv_date"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("recv_date"))).sendKeys(RD);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_prev_btn"))).click();
    Thread.sleep(5000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_next_btn"))).click(); 
    Thread.sleep(4000);
    }
    
    @Test(groups = {"RFQ"},priority = 8)
    public void Verify_the_Cancel_button_functionality_on_Step3_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_cancel_btn"))).click();
    Thread.sleep(5000); 
    Assert.assertEquals("Producer Profile", driver.getTitle());
    }
    
    @Test(groups = {"RFQ"},priority = 9)
    public void Verify_the_back_button_functionality_on_Step4_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rfq_btn"))).click();
    Thread.sleep(5000); 
    Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).sendKeys("test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba_btn"))).click();
    Thread.sleep(4000); 
    Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(4000);   
     
    // New Quote Step 2:Add New Group
    System.out.println("Generation of Random leagal name ");
    int intname = ob2.randomlegalname();
    String lname = Integer.toString(intname);
    String final_lnames = "Test" + lname;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).sendKeys(final_lnames);
    
    String dd = "Test DBA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).sendKeys(dd);
    
    String alt_spell = "Test Alt Spellings";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("alt_spelling"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("alt_spelling"))).sendKeys(alt_spell);
    
    String saddr = "500 Market Street, Suite 100";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).sendKeys(saddr);
    
    String eaddr = "Santa Fe, NM";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).sendKeys(eaddr);

    String city = "Washigton";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).sendKeys(city);
    Thread.sleep(3000); 
    
    String ss ="WA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rfq_state"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rfq_state"))).sendKeys(ss);
    
    String pin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).sendKeys(pin);
    
    String msaddr = "500 Market Street, Suite 100";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_street_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_street_addr"))).sendKeys(msaddr);
    
    String mcity = "Washigton";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_city"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_city"))).sendKeys(mcity);
    Thread.sleep(3000); 
    
    String mss ="WA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_state"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_state"))).sendKeys(mss);
    
    String mpin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_postal_code"))).sendKeys(mpin);
    
    String mst = "UNITED STATES";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_listMailingCountry"))).selectByVisibleText(mst);
    
    String url = "http://google.com";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("website_url"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("website_url"))).sendKeys(url);
    
    String RM = "5 - May";
   // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("renewal_mnth"))).clear();
   // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("renewal_mnth"))).sendKeys(RM);
    new Select(driver.findElement(By.id("MasterPageContent_wzd_listRenewalMonth"))).selectByVisibleText(RM);
    
    String DBE = "1/2/2015";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("date_estb"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("date_estb"))).sendKeys(DBE);
    
    String sic ="172 - Grapes";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlSic"))).selectByVisibleText(sic);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_next_btn"))).click();        
    Thread.sleep(5000); 
    
    String RD = "1/1/2015";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("recv_date"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("recv_date"))).sendKeys(RD);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_next_btn"))).click();
    Thread.sleep(5000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st4_back_btn"))).click(); 
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_next_btn"))).click();
    }
    
    @Test(groups = {"RFQ"},priority = 10)
    public void Verify_the_Cancel_button_functionality_on_Step4_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st4_cancel_btn"))).click();
    Thread.sleep(4000); 
    Assert.assertEquals("Producer Profile", driver.getTitle());
    }      
    
    @Test(groups = {"RFQ"},priority = 11)
    public void Verify_the_Finish_button_funtionality_on_Step4_AddNewGroup_page()throws InterruptedException {
    Thread.sleep(6000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rfq_btn"))).click();
    
    Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).sendKeys("test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba_btn"))).click();
    Thread.sleep(4000); 
    Assert.assertEquals("Add Quote Request Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(5000);   
     
    // New Quote Step 2:Add New Group
    System.out.println("Generation of Random leagal name ");
    int intname = ob2.randomlegalname();
    String lname = Integer.toString(intname);
    String final_lnames = "Test" + lname;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).sendKeys(final_lnames);
    
    String dd = "Test DBA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).sendKeys(dd);
    
    String alt_spell = "Test Alt Spellings";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("alt_spelling"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("alt_spelling"))).sendKeys(alt_spell);
    
    String saddr = "500 Market Street, Suite 100";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).sendKeys(saddr);
    
    String eaddr = "Santa Fe, NM";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).sendKeys(eaddr);

    String city = "Washigton";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).sendKeys(city);
    Thread.sleep(2000); 
    
    String ss ="WA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rfq_state"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("rfq_state"))).sendKeys(ss);
    
    String pin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).sendKeys(pin);
    
    String msaddr = "500 Market Street, Suite 100";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_street_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_street_addr"))).sendKeys(msaddr);
    
    String mcity = "Washigton";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_city"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_city"))).sendKeys(mcity);
    Thread.sleep(2000); 
    
    String mss ="WA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_state"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("mail_state"))).sendKeys(mss);
    
    String mpin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).sendKeys(mpin);
    
    String mst = "UNITED STATES";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_listMailingCountry"))).selectByVisibleText(mst);
    
    String url = "http://google.com";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("website_url"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("website_url"))).sendKeys(url);
    
    String RM = "5 - May";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_listRenewalMonth"))).selectByVisibleText(RM);
    
    String DBE = "1/24/2015";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("date_estb"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("date_estb"))).sendKeys(DBE);
    
    String sic ="172 - Grapes";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlSic"))).selectByVisibleText(sic);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_next_btn"))).click(); 
    Thread.sleep(4000);
    
    //New Quote Step 3: Quote Request
    String grp_nm = final_lnames+"\n"+saddr+"\n"+eaddr+"\n"+city+" "+ss+" "+pin ;
    String cgrp = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("group_field"))).getText();
    System.out.println(cgrp);
    try {
        Assert.assertEquals(grp_nm,cgrp);
        System.out.println("Address Verified");
        } catch (Exception t) {
        }
    String csic = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sic_field"))).getText();
    System.out.println(csic);
    try {
        Assert.assertEquals(sic,csic);
        System.out.println("SIC code Verified");
        } catch (Exception t) {
        }
    String RD = "1/1/2015";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("recv_date"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("recv_date"))).sendKeys(RD);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_next_btn"))).click();
    Thread.sleep(5000);
    
    //New Quote Step 4: Review and Finish
    String fgrp_nm = final_lnames+"\n"+saddr+"\n"+eaddr+" "+city+" "+ss+" "+pin ;  
     try {
        Assert.assertEquals(fgrp_nm,driver.findElement(caller.Elements(CONFIGOBJ.getProperty("gp_field"))).getText() );
        System.out.println("Address Verified");
        } catch (Exception t) {
        }
     try {
        Assert.assertEquals(sic,driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fsic_field"))).getText() );
        System.out.println("Address Verified");
        } catch (Exception t) {
        }
     
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st4_finish_btn"))).click();
    Thread.sleep(5000);
    try {
        Assert.assertEquals("Proposal Overview and Census", driver.getTitle());
        System.out.println("Title Verified");
        } catch (Exception t) {
    }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////    
   /* String legalnm = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("lname"))).getText();
           legalnm = legalnm.substring(0, legalnm.length() - 9); 
    try {
        Assert.assertEquals(legalnm,final_lnames);
        System.out.println("Leagal Name Verified");
        } catch (Exception t) {
    }*/ 
 }
    
}   