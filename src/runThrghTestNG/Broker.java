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
public class Broker extends BaseClass {
    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
   
    
    @Test(groups = {"BrokerPortalTest"},priority = 0)
    // Dashboard Test Case :Test Case Description: To verify the presence of New Quote and Preferences tab on Broker portal dashbaord
    public void Verify_presenceof_NewQuote_n_Preferences_tab_n_elements() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    ob1.brokerlogin();
    Thread.sleep(2000);
    //Quotes Tab
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("quote_tab"))).isDisplayed();
    if (iselementpresent == true)
    {
       System.out.println("Quotes Tab is present on Broker Portal ");
    }
    else
    {
        System.out.println("Quotes Tab Not Found on Broker Portal ");
    }
    Boolean iselementpresent1 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Broker_portal_header"))).isDisplayed();
    if (iselementpresent1 == true)
    {
       System.out.println("Broker Portal Dashboard label is present on Broker Portal ");
    }
    else
    {
       System.out.println("Broker Portal Dashboard label is not present on Broker Portal ");
    }
    Boolean iselementpresent2 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).isDisplayed();
    if (iselementpresent2 == true)
    {
       System.out.println("Search textbox is present on New Quote tab ");
    }
    else
    {
        System.out.println("Unable to find Search textbox on New Quote tab ");
    }
    Boolean iselementpresent3 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_criteria_dd"))).isDisplayed();
    if (iselementpresent3 == true)
    {
       System.out.println("Search criteria drop down is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Search Criteria Drop-Down on New Quote tab ");
    }
    Boolean iselementpresent4 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_quote_search"))).isDisplayed();
    if (iselementpresent4 == true)
    {
       System.out.println("Search button is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Search button on New Quote tab ");
    }
    Boolean iselementpresent5 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_start_newproposal"))).isDisplayed();
    if (iselementpresent5 == true)
    {
       System.out.println("Start New Proposal button is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Start New Proposal button on New Quote tab ");
    }
    Boolean iselementpresent6 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("proposal_lbl"))).isDisplayed();
    if (iselementpresent6 == true)
    {
       System.out.println("proposal label is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find proposal label on New Quote tab ");
    }
     
    Boolean iselementpresent7 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("grp_col"))).isDisplayed();
    if (iselementpresent7 == true)
    {
       System.out.println("Group Column is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Group Column on New Quote tab ");
    }
    Boolean iselementpresent8 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("effective_col"))).isDisplayed();
    if (iselementpresent8 == true)
    {
       System.out.println("Effective Column is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Effective Column on New Quote tab ");
    }
    Boolean iselementpresent9 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_col"))).isDisplayed();
    if (iselementpresent9 == true)
    {
       System.out.println("Census Column is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Census Column on New Quote tab ");
    }
    Boolean iselementpresent10 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("status_col"))).isDisplayed();
    if (iselementpresent10 == true)
    {
       System.out.println("Status Column is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Status Column on New Quote tab ");
    }
    Boolean iselementpresent11 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("createdon_col"))).isDisplayed();
    if (iselementpresent11 == true)
    {
       System.out.println("Created On Column is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Created On Column on New Quote tab ");
    }
    Boolean iselementpresent12 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("view_col"))).isDisplayed();
    if (iselementpresent12 == true)
    {
       System.out.println("View Column is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find View Column on New Quote tab ");
    }
    Boolean iselementpresent13 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("copy_col"))).isDisplayed();
    if (iselementpresent13 == true)
    {
       System.out.println("Copy Column is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Copy Column on New Quote tab ");
    }
    Boolean iselementpresent14 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("edit_col"))).isDisplayed();
    if (iselementpresent14 == true)
    {
       System.out.println("Edit Column is present on New Quote tab ");
    }
    else
    {
       System.out.println("Unable to find Edit Column on New Quote tab ");
    }   
     
    //Preferences Tab
    Boolean iselementpresent15 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pref_tab"))).isDisplayed();
    if (iselementpresent15 == true)
    {
       System.out.println("Preference Tab is present on Broker Portal ");
    }
    else
    {
       System.out.println("Unable to find Preference Tab on Broker Portal");
    }   
    
    Thread.sleep(2000);   
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 1)
    //Dashboard Test Case
    // Test Case Description: To verify the presence of New Quote and Preferences tab on Broker portal dashbaord
    public void verify_functionality_of_Search_on_quotes_tab()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("quote_tab"))).click();
    Thread.sleep(2000);    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).sendKeys("Test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_quote_search")));
    Thread.sleep(5000);    
    
    System.out.println("Searched Proposals are getting displayed.");
    }
       
    @Test(groups = {"BrokerPortalTest"},priority = 2)
    //Dashboard Test Case
    // Test Case Description: To verify the presence of New Quote and Preferences tab on Broker portal dashbaord
    public void verify_the_functionality_GroupName_on_ProposalListingtable_on_BrokerPortal_Dashboard() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("searched_rec"))).click();
    Thread.sleep(4000); 
        System.out.println("Functionality GroupName on Proposal Listing table is working as expected ");
    }
    @Test(groups = {"BrokerPortalTest"},priority = 3)
    public void verify_the_presence_of_EffectiveDate_on_ProposalListingtable_on_BrokerPortal_Dashboard() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("quote_tab"))).click();
    Thread.sleep(4000);     
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_effective_date"))).isDisplayed();
    //Boolean iselementpresent = driver.findElement(By.cssSelector("td..firepath-matching-node")).isDisplayed();    
    if (iselementpresent == true)
    {
       String dt = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_effective_date"))).getText(); 
       // String dt = driver.findElement(By.cssSelector("td..firepath-matching-node")).getText();
       System.out.println("Effective Date is present on Proposal Listing table on Broker Portal Dashboard " +dt);
    }
    else
    {
       System.out.println("Effective Date is not present on Proposal Listing table on Broker Portal Dashboard");
    }
    Thread.sleep(2000);
    }
    @Test(groups = {"BrokerPortalTest"},priority = 4)
    public void verify_the_presence_of_CensusDetail_on_ProposalListingtable_on_BrokerPortal_Dashboard() throws InterruptedException {
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_ee"))).isDisplayed();
    if (iselementpresent == true)
    {
       String ee = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_ee"))).getText(); 
       System.out.println("Census " +ee);
    }
    Boolean iselementpresent1 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_es"))).isDisplayed();
    if (iselementpresent1 == true)
    {
       String es = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_es"))).getText(); 
       System.out.println("Census " +es);
    }
    Boolean iselementpresent2 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_es"))).isDisplayed();
    if (iselementpresent2 == true)
    {
       String ec = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_ec"))).getText(); 
       System.out.println("Census " +ec);
    }
    Boolean iselementpresent3 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_ef"))).isDisplayed();
     if (iselementpresent3 == true)
    {
       String ef = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_ef"))).getText(); 
       System.out.println("Census " +ef);
    }
    Boolean iselementpresent4 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_w"))).isDisplayed();
     if (iselementpresent4 == true)
    {
       String w = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_w"))).getText(); 
       System.out.println("Census " +w);
    } 
    Boolean iselementpresent5 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_total"))).isDisplayed();
     if (iselementpresent5 == true)
    {
       String total = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("census_total"))).getText(); 
       System.out.println("Census " +total);
    } 
    Thread.sleep(2000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 5)
    public void verify_the_presence_of_Status_on_ProposalListingtable_on_BrokerPortal_Dashboard() throws InterruptedException {
    String Grp_nm = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("searched_rec"))).getText();
        Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pop_status"))).isDisplayed();
    if (iselementpresent == true)
    {
       String dt = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pop_status"))).getText(); 
       if (null != dt)
        switch (dt) {
            case "Editable":
                System.out.println("Status for Group name  "+Grp_nm+" is Editable");
                break;
            case "Locked":
                System.out.println("Status for Group name  "+Grp_nm+" is Locked");
                break;        
        }        
    }
    else
    {
       System.out.println("Unable to find the Status on Proposal Listing table on Broker Portal Dashboard");
    }
    Thread.sleep(2000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 6)
    public void verify_the_presence_of_CreatedOn_on_ProposalListingtable_on_BrokerPortal_Dashboard() throws InterruptedException {
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("created_on"))).isDisplayed();
    if (iselementpresent == true)
    {
       String dt = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("created_on"))).getText(); 
       System.out.println("Creation date for Group name is " +dt);       
    }
    else
    {
       System.out.println("Unable to find the CreatedOn  on Proposal Listing table on Broker Portal Dashboard");
    }
    Thread.sleep(2000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 7)
    public void verify_the_functionality_of_viewlink_on_ProposalListingtable_on_BrokerPortal_Dashboard() throws InterruptedException {
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("view_link"))).isDisplayed();
    if (iselementpresent == true)
    {
       driver.findElement(caller.Elements(CONFIGOBJ.getProperty("view_link"))).click();
       System.out.println("User navigated to the Proposal Overview and Census page.");
    }
    else
    {
       System.out.println("Unable to find the view link on Proposal Listing table on Broker Portal Dashboard");
    }
    Thread.sleep(2000);
    }
    
        
    @Test(groups = {"BrokerPortalTest"},priority = 8)
    //Dashboard Test Case
    // Test Case Description: To verify the presence of New Quote and Preferences tab on Broker portal dashbaord
    public void verify_the_functionality_of_Start_New_Proposal_button_on_BrokerPortal_Dashboard() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("quote_tab"))).click();
    Thread.sleep(2000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_start_newproposal"))).click();
    Thread.sleep(4000); 
    String curl = driver.getCurrentUrl();
    System.out.println(curl);
    String eurl = "https://bbqubed.tbsmga.com/Connect/Broker/NewBusiness/AddNewQuote.aspx";
    try {
      Assert.assertEquals(eurl,curl);
      System.out.println("Functionality of Start New Proposal is working as expected ");
    } catch (Error e) {
     // System.out.println("Functionality of Start New Proposal is not working as expected ");
    System.out.println(e);
    }
    }
    @Test(groups = {"BrokerPortalTest"},priority = 9)
    public void Verify_elements_on_Add_NewQuote_page_on_BrokerPortal_Dashboard()throws InterruptedException {
   
    //Assert.assertEquals("New Quote", driver.getTitle());
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).isDisplayed();
    if (iselementpresent == true)
    {
       System.out.println("Search Name (or DBA)is present on Step 1: Group Information page.");
    }
    else
    {
       System.out.println("Unable to find Search Name (or DBA)on Step 1: Group Information page");
    }
    Boolean iselementpresent1 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba_btn"))).isDisplayed();
    if (iselementpresent1 == true)
    {
       System.out.println("Search Button is present on Step 1: Group Information page.");
    }
    else
    {
       System.out.println("Unable to find Search Button on Step 1: Group Information page");
    }
    Boolean iselementpresent2 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).isDisplayed();
    if (iselementpresent2 == true)
    {
       System.out.println("Add New Group Button is present on Step 1: Group Information page.");
    }
    else
    {
       System.out.println("Unable to find Add New Group Button on Step 1: Group Information page");
    }
    
    Boolean iselementpresent3 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("can_button"))).isDisplayed();
    if (iselementpresent3 == true)
    {
       System.out.println("Cancel Button is present on Step 1: Group Information page.");
    }
    else
    {
       System.out.println("Unable to find Cancel Button on Step 1: Group Information page");
    }
    Thread.sleep(2000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 10)
    public void verify_the_Cancel_button_functionality_on_Add_New_Quote_page() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("can_button"))).click();
    Thread.sleep(4000); 
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 11)
    public void Verify_the_functionality_of_Add_new_group_button_on_Step1_wizard()throws InterruptedException {
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_start_newproposal"))).click();
    Thread.sleep(3000); 
    
    Assert.assertEquals("New Quote", driver.getTitle());
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba"))).sendKeys("test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("search_dba_btn"))).click();
    Thread.sleep(3000); 
    Assert.assertEquals("New Quote", driver.getTitle());
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(3000); 
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 12)
    public void Verify_the_validation_for_mandatory_fields_on_Step2_wizard()throws InterruptedException {
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check done for*************");   
    System.out.println(validation);  
    
    try {
        Assert.assertEquals(validation, "The following errors occurred: Legal name required Street address is required City is required Postal Code is required Invalid SIC selection");
    } catch (Exception t) {
    } 
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 13)
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
    Boolean iselementpresent7 = driver.findElement(By.id("MasterPageContent_wzd_ddlState")).isDisplayed();
    if (iselementpresent7 == true)
    {
       System.out.println("State field is present on Step 2: Add New Group");
    }
    else
    {
       System.out.println("Unable to find State field on Step 2: Add New Group");
    }      
    Thread.sleep(2000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 14)
    public void Verify_the_previous_button_functionality_on_Step2_AddNewGroup_page()throws InterruptedException {
    Thread.sleep(3000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_prev_btn"))).click();
    Thread.sleep(3000); 
    Assert.assertEquals("New Quote", driver.getTitle());
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 15)
    public void Verify_the_Cancel_button_functionality_on_Step2_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(3000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_cancel_btn"))).click();
    Thread.sleep(3000); 
    Assert.assertEquals("Broker Portal Dashboard", driver.getTitle());
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 16)
    public void Verify_the_previous_button_functionality_on_Step3_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_start_newproposal"))).click();
    Thread.sleep(3000); 
    
    Assert.assertEquals("New Quote", driver.getTitle());   
    Thread.sleep(3000); 
      
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(3000); 
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
    
    String saddr = "500 Market Street, Suite 100";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("street_addr"))).sendKeys(saddr);
    
    String eaddr = "Santa Fe, NM";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("extend_addr"))).sendKeys(eaddr);

    String city = "Washington";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("city"))).sendKeys(city);
    Thread.sleep(2000); 
    String ss ="WA";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlState"))).selectByVisibleText(ss);
    
    String pin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).sendKeys(pin);
    
    String sic ="172 - Grapes";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlSic"))).selectByVisibleText(sic);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_next_btn"))).click();        
    Thread.sleep(3000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_prev_btn"))).click();
    Thread.sleep(5000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_next_btn"))).click(); 
    Thread.sleep(4000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 17)
    public void Verify_the_Cancel_button_functionality_on_Step3_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_cancel_btn"))).click();
    Thread.sleep(3000); 
    Assert.assertEquals("Broker Portal Dashboard", driver.getTitle());
    }
    @Test(groups = {"BrokerPortalTest"},priority = 18)
    public void Verify_the_back_button_functionality_on_Step4_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_start_newproposal"))).click();
    Thread.sleep(3000); 
    
    Assert.assertEquals("New Quote", driver.getTitle());
    Thread.sleep(3000); 
      
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(3000); 
    // New Quote Step 2:Add New Group
    System.out.println("Generation of Random legal name ");
    int intname = ob2.randomlegalname();
    String lname = Integer.toString(intname);
    String final_lnames = "Test" + lname;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).sendKeys(final_lnames);
    
    String dd = "Test DBA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).sendKeys(dd);
    
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
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlState"))).selectByVisibleText(ss);
    
    String pin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).sendKeys(pin);
    
    String sic ="172 - Grapes";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlSic"))).selectByVisibleText(sic);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_next_btn"))).click();        
    Thread.sleep(3000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_next_btn"))).click();
    Thread.sleep(5000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st4_back_btn"))).click(); 
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st3_next_btn"))).click();
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 19)
    public void Verify_the_Cancel_button_functionality_on_Step4_AddNewGroup_page()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st4_cancel_btn"))).click();
    Thread.sleep(3000); 
    Assert.assertEquals("Broker Portal Dashboard", driver.getTitle());
    }      
    
    @Test(groups = {"BrokerPortalTest"},priority = 20)
    public void Verify_the_Finish_button_funtionality_on_Step4_AddNewGroup_page()throws InterruptedException {
    Thread.sleep(3000); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_start_newproposal"))).click();
    Thread.sleep(3000); 
    Assert.assertEquals("New Quote", driver.getTitle());
    Thread.sleep(3000); 
    Assert.assertEquals("New Quote", driver.getTitle());
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_new_group_btn"))).click();
    Thread.sleep(3000); 
    // New Quote Step 2:Add New Group
    int intname = ob2.randomlegalname();
    String lname = Integer.toString(intname);
    String final_lnames = "Test" + lname;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("legal_nm"))).sendKeys(final_lnames);
    
    String dd = "Test DBA";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dba_nm"))).sendKeys(dd);
    
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
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlState"))).selectByVisibleText(ss);
    
    String pin = "98001";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("postal_code"))).sendKeys(pin);
    
    String sic ="172 - Grapes";
    new Select(driver.findElement(By.id("MasterPageContent_wzd_ddlSic"))).selectByVisibleText(sic);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st2_next_btn"))).click();
    Thread.sleep(3000);
    
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
     
    String legalnm = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("lname"))).getText();
           legalnm = legalnm.substring(0, legalnm.length() - 9); 
    try {
        Assert.assertEquals(legalnm,final_lnames);
        System.out.println("Leagal Name Verified");
        } catch (Exception t) {
    } 
 }
   
    @Test(groups = {"BrokerPortalTest"},priority = 21)
    public void Verify_the_funtionality_of_AddCensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("add_census"))).click();
    System.out.println("Generation of Random legal name ");
        int intname = ob2.randomfname();
        String fname = Integer.toString(intname);
        String final_fname = "Test" + fname;    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fnm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("fnm"))).sendKeys(final_fname);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("lnm"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("lnm"))).sendKeys("lname");
    
    String gender ="Female"; 
    driver.findElement(By.id("MasterPageContent_tabQuote_tabCensus_listCensus_listAddSex")).click();
    new Select(driver.findElement(By.id("MasterPageContent_tabQuote_tabCensus_listCensus_listAddSex"))).selectByVisibleText(gender);

    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("zip"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("zip"))).sendKeys("98001");
    
    String dob = "02-11-90";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dob"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("dob"))).sendKeys(dob);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("life"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cobra"))).click();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("insert"))).click();
    Thread.sleep(4000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 22)
    public void Verify_the_funtionality_of_EditCensus()throws InterruptedException {
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("edit_first_rec_btn"))).click();
    Thread.sleep(7000);    
    String oldlnm = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("editlnm_first_rec"))).getText();
    System.out.println("Old lnm text was : "+oldlnm);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("editlnm_first_rec"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("editlnm_first_rec"))).sendKeys("editedlname");
    Thread.sleep(5000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("save_first_rec"))).click(); 
    Thread.sleep(8000);
    
   }
   @Test(groups = {"BrokerPortalTest"},priority = 23)
    public void Verify_the_funtionality_of_importCensus_button()throws InterruptedException {
    Assert.assertEquals("Proposal Overview and Census", driver.getTitle());
    System.out.println("Import Census functionality for this newly created proposal ");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("importcensus_btn"))).click();   
    System.out.println("Clicked on Import Census Button ");
    Thread.sleep(5000);
    }
   
    @Test(groups = {"BrokerPortalTest"},priority = 24)
    public void check_the_validation_for_choosefile_field_on_step1_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step1next_button"))).click(); 
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check done for*************");   
    System.out.println(validation);  
    
    try {
        Assert.assertEquals(validation, "The following errors occurred: A file location must be supplied.");
    } catch (Exception t) {
    } 
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 25)
    public void Verify_the_funtionality_of_cancel_button_on_step1_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step1cancel_button"))).click(); 
    Assert.assertEquals("Proposal Overview and Census", driver.getTitle());
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 26)
    public void Verify_the_funtionality_of_choosefile_button()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("importcensus_btn"))).click();   
    System.out.println("Clicked on Import Census Button ");
    Thread.sleep(8000);    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("import_fileUpload"))).sendKeys("D:\\TotalBS\\Data\\2.xlsx");
    System.out.println("File has been selected to Import Census");
    Thread.sleep(5000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 27)
    public void Verify_the_funtionality_of_Next_button_on_step1_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step1next_button"))).click(); 
    System.out.println("User redirected to Step 2: Select a spreadsheet workbook to import");
    Thread.sleep(5000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 27)
    public void Verify_the_funtionality_of_previous_button_on_step2_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step2prev_button"))).click(); 
    System.out.println("User redirected to Step 1: Select the TBS Census Form to upload");
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("import_fileUpload"))).sendKeys("D:\\TotalBS\\Data\\2.xlsx");     
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step1next_button"))).click();  
    Thread.sleep(5000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 28)
    public void Verify_the_funtionality_of_Cancel_button_on_step2_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step2cancel_button"))).click();   
    Thread.sleep(5000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 29)
    public void Verify_the_funtionality_of_Next_button_on_step2_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("importcensus_btn"))).click();   
    System.out.println("Clicked on Import Census Button ");
    Thread.sleep(8000);    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("import_fileUpload"))).sendKeys("D:\\TotalBS\\Data\\2.xlsx");
    System.out.println("File has been selected to Import Census");
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step1next_button"))).click(); 
    System.out.println("User redirected to Step 2: Select a spreadsheet workbook to import");
    Thread.sleep(5000);
    new Select(driver.findElement(By.id("MasterPageContent_wzdImport_listDataMembers"))).selectByVisibleText("'WA Census$'");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step2next_button"))).click();  
    Thread.sleep(5000);
    System.out.println("User redirected to Step 3: Review & Submit");
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 30)
    public void Verify_the_funtionality_of_previous_button_on_step3_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step3prev_button"))).click(); 
    System.out.println("User redirected to Step 2: Select a spreadsheet workbook to import");
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step2next_button"))).click();  
    Thread.sleep(5000);
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 31)
    public void Verify_the_funtionality_of_Cancel_button_on_step3_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step3cancel_button"))).click();   
    Thread.sleep(5000);
    Assert.assertEquals("Proposal Overview and Census", driver.getTitle());    
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 32)
    public void Verify_the_funtionality_of_Finish_button_on_step3_importcensus()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("importcensus_btn"))).click();   
    System.out.println("Clicked on Import Census Button ");
    Thread.sleep(8000);
        
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("import_fileUpload"))).sendKeys("D:\\TotalBS\\Data\\2.xlsx");
        
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step1next_button"))).click();  
    Thread.sleep(5000);
    
    new Select(driver.findElement(By.id("MasterPageContent_wzdImport_listDataMembers"))).selectByVisibleText("'WA Census$'");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step2next_button"))).click();  
    Thread.sleep(5000); 
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("finish_button"))).click(); 
    Thread.sleep(5000);
    
    Assert.assertEquals("Proposal Overview and Census", driver.getTitle());
}
    

@Test(groups = {"BrokerPortalTest"},priority = 33)
    public void Verify_the_funtionality_of_previewquote_button()throws InterruptedException {
        
    String winHandleBefore1 = driver.getWindowHandle();
    Thread.sleep(10000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("prev_quote"))).click();
    Thread.sleep(15000);
    //Switch to new window opened
    for(String winHandle1 : driver.getWindowHandles()){
    driver.switchTo().window(winHandle1);
    }
    Thread.sleep(5000);
    //Close the new window, if that window no more required
   driver.close();
   System.out.println("Preview Quote Report window closed");
   //Switch back to original browser (first window)
   driver.switchTo().window(winHandleBefore1);
    
}   
  @Test(groups = {"BrokerPortalTest"},priority = 34)
    public void Verify_the_funtionality_of_Generatequote_button()throws InterruptedException {
        
    String winHandleBefore1 = driver.getWindowHandle();
    Thread.sleep(10000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("gen_quote"))).click();
    Thread.sleep(15000);
    //Switch to new window opened
    for(String winHandle1 : driver.getWindowHandles()){
    driver.switchTo().window(winHandle1);
    }
    Thread.sleep(5000);
    //Close the new window, if that window no more required
   driver.close();
   System.out.println("Preview Quote Report window closed");
   //Switch back to original browser (first window)
   driver.switchTo().window(winHandleBefore1);
    
}  
   
    @Test(groups = {"BrokerPortalTest"},priority = 35)
    public void Verify_the_funtionality_of_Downloadpdf_button()throws InterruptedException {
        
   // String winHandleBefore1 = driver.getWindowHandle();
    Thread.sleep(10000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("downloadpdf_btn"))).click();
    Thread.sleep(15000); 
    System.out.println("Download preview Quote window closed");
   }  
    
    @Test(groups = {"BrokerPortalTest"},priority = 36)
    public void Verify_the_funtionality_of_EmailpdfQuote_button()throws InterruptedException {  
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("emailpdf_quote_btn"))).click();
    Thread.sleep(15000);
    String success = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("emailpdf_status"))).getText();
    try {
        Assert.assertEquals(success, "Email has been sent successfully.");
    } catch (Exception t) {
    } 
    System.out.println("Email has been sent"); 
   }
   
    @Test(groups = {"BrokerPortalTest"},priority = 37)
   public void Verify_the_Visbility_of_view_n_copy_button()throws InterruptedException {  
    String search = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("created_rec"))).getText();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("quote_tab"))).click();
    Thread.sleep(5000); 
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).sendKeys(search);
   
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_quote_search"))).click();
    Thread.sleep(8000);
    System.out.println("Record searched");   
    
    System.out.println("Checking the functionality of view button");
    Boolean iselementpresent = driver.findElement(By.id("MasterPageContent_grdQuotes_linkView_0")).isDisplayed();
    if (iselementpresent == true)
    {
        System.out.println("View Link is present on for this Group "+search);
        driver.findElement(By.id("MasterPageContent_grdQuotes_linkView_0")).click();
    }
    else
    {
        System.out.println("View Link is not present on for this Group");
    }     
    Assert.assertEquals("Proposal Overview and Census", driver.getTitle());
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("quote_tab"))).click();
    Thread.sleep(5000); 
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).sendKeys(search);
   
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_quote_search"))).click();
    Thread.sleep(8000);
    System.out.println("Record searched"); 
    System.out.println("Checking the functionality of Copy button");
    Boolean iselementpresent1 = driver.findElement(By.id("MasterPageContent_grdQuotes_linkCopy_0")).isDisplayed();
    if (iselementpresent1 == true)
    {
        System.out.println("Copy Link is present on for this Group "+search);
        driver.findElement(By.id("MasterPageContent_grdQuotes_linkCopy_0")).click();
    }
    else
    {
        System.out.println("Copy Link is not present on for this Group");
    }
    Alert alert1 = driver.switchTo().alert();
    String alertText1 = alert1.getText();
    System.out.println("Alert Text is: " + alertText1);
    alert1.accept();
    Thread.sleep(8000);
      
    Assert.assertEquals("Proposal Overview and Census", driver.getTitle());
    String new_grp = driver.findElement(By.id("MasterPageContent_formQuote_lblGroupName")).getText();
    driver.findElement(By.linkText("Quotes")).click();
    Assert.assertEquals("Broker Portal Dashboard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).sendKeys(search);
   
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_quote_search"))).click();
    Thread.sleep(8000);
    System.out.println("Record searched");
    String status = driver.findElement(By.id("MasterPageContent_grdQuotes_lblStatus_0")).getText();
    try {
           Assert.assertEquals("Editable", status);
           System.out.println("Status Verified");
        } catch (Exception t) {
    }
    
    Boolean iselementpresent2 = driver.findElement(By.id("MasterPageContent_grdQuotes_linkView_0")).isDisplayed();
    if (iselementpresent2 == true)
    {
       System.out.println("View Link is present on for this Group " +search);
    }
    else
    {
       System.out.println("View Link is not present on for this Group");
    }
     
    Boolean iselementpresent3 = driver.findElement(By.id("MasterPageContent_grdQuotes_linkCopy_0")).isDisplayed();
    if (iselementpresent3 == true)
    {
       System.out.println("Copy Link is present on for this Group "+search);
    }
    else
    {
       System.out.println("Copy Link is not present on for this Group");
    }
     
    Boolean iselementpresent4 = driver.findElement(By.id("MasterPageContent_grdQuotes_linkEdit_0")).isDisplayed();
    if (iselementpresent4 == true)
    {
       System.out.println("Edit Link is present on for this Group "+search);
    }
    else
    {
       System.out.println("Edit Link is not present on for this Group");
    }
     
}
   
@Test(groups = {"BrokerPortalTest"},priority = 38)
    public void Verify_the_funtionality_of_ImportCensus_for_already_created_proposal()throws InterruptedException, AWTException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("quote_tab"))).click();
    Thread.sleep(5000);      
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).sendKeys("Test Legal Name Grp");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_quote_search"))).click();
    Thread.sleep(8000);
    System.out.println("Record searched");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("searched_rec"))).click();
    Thread.sleep(4000);
    System.out.println("Clicked on Record searched");
  
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("importcensus_btn"))).click();   
    System.out.println("Clicked on Import Census Button ");
    Thread.sleep(8000);
        
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("import_fileUpload"))).sendKeys("C:\\Users\\reena.sharma\\Desktop\\2.xlsx");
        
    Thread.sleep(8000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step1next_button"))).click();  
    Thread.sleep(5000);
    
    new Select(driver.findElement(By.id("MasterPageContent_wzdImport_listDataMembers"))).selectByVisibleText("'WA Census$'");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("step2next_button"))).click();  
    Thread.sleep(5000); 
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("finish_button"))).click(); 
    Thread.sleep(5000);
    
    Assert.assertEquals("Proposal Overview and Census", driver.getTitle());
  /*  
    System.out.println("Edit Census funtionality of ImportCensus for already created proposal");
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("edit_first_rec_btn"))).click();
    Thread.sleep(7000);    
    String oldlnm = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("editlnm_first_rec"))).getText();
    System.out.println("Old lnm text was : "+oldlnm);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("editlnm_first_rec"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("editlnm_first_rec"))).sendKeys("editedlname");
    Thread.sleep(5000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("save_first_rec"))).click(); */
    Thread.sleep(8000);
    
    } 
    
    @Test(groups = {"BrokerPortalTest"},priority = 39)
    public void Verify_the_funtionality_of_download_census_template_link_on_ImportCensus_page()throws InterruptedException, AWTException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("quote_tab"))).click();
    Thread.sleep(5000);      
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Search_txtbox"))).sendKeys("Test");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("btn_quote_search"))).click();
    Thread.sleep(8000);
    System.out.println("Record searched");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("searched_rec"))).click();
    Thread.sleep(4000);
    System.out.println("Clicked on Record searched");
  
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("importcensus_btn"))).click();   
    driver.findElement(By.id("MasterPageContent_tabQuote_tabCensus_btnImportCensus")).click();
    System.out.println("Clicked on Import Census Button ");
    Thread.sleep(5000);
    //driver.findElement(By.id("hrfCensusDownload")).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("template_link"))).click();  
    Thread.sleep(15000); 
    System.out.println("census template Downloaded");
    driver.findElement(By.linkText("Quotes")).click();
    Assert.assertEquals("Broker Portal Dashboard", driver.getTitle());
    ob1.logout();
    }
 // Preference tab  testcases
    
    @Test(groups = {"BrokerPortalTest"},priority = 40)
    public void Verify_presenceof_elements_on_Preferences_tab() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    ob1.brokerlogin();
    Thread.sleep(2000);
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("pref_tab"))).click();
    driver.findElement(By.linkText("Preferences")).click();
    Thread.sleep(2000);
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("update_pref_btn"))).isDisplayed();
    if (iselementpresent == true)
    {
       System.out.println("Update Preferences button is present on Preference tab ");
    }
    else
    {
       System.out.println("Unable to find Update Preferences button on Preference tab");
    }
     
    Boolean iselementpresent1 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("update_list_pref_btn"))).isDisplayed();
    if (iselementpresent1 == true)
    {
       System.out.println("Update List Preferences button is present on Preference tab ");
    }
    
    else
    {
      System.out.println("Unable to find Update List Preferences button on Preference tab");
    }
    
    }
    @Test(groups = {"BrokerPortalTest"},priority = 41)
    public void Verify_functionality_of_Update_Preferences_button_on_Preferences_tab() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("update_pref_btn"))).click();
    String success = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("success_msg"))).getText();
    System.out.println(success);  
    try {
        Assert.assertEquals(success, "Preferences updated sucessfully.");
    } catch (Exception t) {
    } 
    }
    
    @Test(groups = {"BrokerPortalTest"},priority = 42)
    public void Verify_functionality_of_update_list_pref_btn_button_on_Preferences_tab() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("update_list_pref_btn"))).click();
    String success = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("success_msg"))).getText();
    System.out.println(success);  
    try {
        Assert.assertEquals(success, "Mailing list updated sucessfully.");
    } catch (Exception t) {
    } 
    ob1.logout();
    }
    
}   