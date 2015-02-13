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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import static runThrghTestNG.BaseClass.CONFIGOBJ;
import static runThrghTestNG.BaseClass.driver;
/**
 *
 * @author reena.sharma
 */
public class Statement_process extends BaseClass {
    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
 
    @Test(groups = {"StatementTest"},priority = 0)
    public void Statement_processing_functionality_with_Import_New_Carrier_Statement_New_button()throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    System.out.println("Statement_processing functionality with internal user");        
    ob1.bbcubelogin();
    Thread.sleep(5000);

    driver.findElement(By.linkText("Statements")).click();
    Thread.sleep(4000);
   // Assert.assertEquals("Statements", driver.getTitle());
    
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("imp_new_carrier_st_new"))).isDisplayed();
     if (iselementpresent == true)
     {
        System.out.println("Import New Carrier Statement New button is present on Statements page");
     }
     else
     {
        System.out.println("Import New Carrier Statement New button is missing on Statements page");
     }
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("imp_new_carrier_st_new"))).click();
    Thread.sleep(2000);
    //Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    System.out.println("Step 1: Enter summary statement data\n");
   // Assert.assertEquals("Step 1: Enter summary statement data", driver.findElement(caller.Elements(CONFIGOBJ.getProperty("imp_new_carrier_st_new"))).getText());
    Thread.sleep(10000);
    }
    @Test(groups = {"StatementTest"},priority = 1)
    public void Statement_processing_step1_cancel_button_functionality()throws InterruptedException {
    
     Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step1_cancel"))).isDisplayed();
     if (iselementpresent == true)
     {
        System.out.println("Import New Carrier Statement New button is present on Statements page");
     }
     else
     {
        System.out.println("Import New Carrier Statement New button is missing on Statements page");
     }
    Thread.sleep(2000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step1_cancel"))).click();
    Thread.sleep(2000);   
    Assert.assertEquals("Statements", driver.getTitle());
    }
    
    @Test(groups = {"StatementTest"},priority = 2)
    public void Statement_processing_step1_fields_Validation_against_next_button_and_its_functionality()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("imp_new_carrier_st_new"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step1_next"))).click();
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check for mandatory fields Step1 of statement processing*************");   
    System.out.println(validation);  
    
        try {
           Assert.assertEquals(validation, "The following errors occurred: A carrier selection is required A statement date is required Notes field is required.");
        } catch (Exception t) {

        }
    System.out.println("*********** Step1 Next button functionality*************");   
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Import_listCarrier"))).click();
    driver.findElement(By.cssSelector("option[value=\"1\"]")).click();
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Import_listCarrier_rec"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_date"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_date"))).sendKeys("11/18/2014");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_notes"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_notes"))).sendKeys("Test Notes, Test Notes");
    Thread.sleep(4000);
    Boolean iselementpresent = driver.findElement(By.id("MasterPageContent_wzdImport_StartNavigationTemplateContainerID_StartNextButton")).isDisplayed();
     if (iselementpresent == true)
     {
        System.out.println("Next button is present on Step1 page");
     }
     else
     {
        System.out.println("Next button is not present on Step1 page");
     }
    driver.findElement(By.name("ctl00$MasterPageContent$wzdImport$StartNavigationTemplateContainerID$StartNextButton")).click();
  //  driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step1_next"))).click();
    Thread.sleep(8000);
    }   
    
    @Test(groups = {"StatementTest"},priority = 3)
    public void Statement_processing_step2_fields_prev_button_functionality()throws InterruptedException {
    new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.id("MasterPageContent_wzdImport_StepNavigationTemplateContainerID_StepPreviousButton")));
    driver.findElement(By.id("MasterPageContent_wzdImport_StepNavigationTemplateContainerID_StepPreviousButton")).click();
        //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_prev"))).click();
    Thread.sleep(4000);
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step1_next"))).click();
    Thread.sleep(5000);
    }
    
    @Test(groups = {"StatementTest"},priority = 4)
    public void Statement_processing_step2_fields_Validation_against_next_button()throws InterruptedException {
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_next"))).click();
    
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check for mandatory fields Step1 of statement processing*************");   
    System.out.println(validation);  
    
        try {
           Assert.assertEquals(validation, "The following errors occurred: A file location must be supplied.");
        } catch (Exception t) {

        }
    }
    
    @Test(groups = {"StatementTest"},priority = 5)
    public void Statement_processing_step2_fields_cancel_button_functionality()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_Cancel"))).click();
    Thread.sleep(5000);
    }  
 
    @Test(groups = {"StatementTest"},priority = 6)
    public void Statement_processing_step2_fields_Next_button_functionality()throws InterruptedException { 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("imp_new_carrier_st_new"))).click();
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Import_listCarrier"))).click();
    driver.findElement(By.cssSelector("option[value=\"1\"]")).click();
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Import_listCarrier_rec"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_date"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_date"))).sendKeys("11/18/2014");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_notes"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_notes"))).sendKeys("Test Notes, Test Notes");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step1_next"))).click();
    Thread.sleep(3000);
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).clear();
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys("C:\\Users\\reena.sharma\\Desktop\\Aetna_00002533274790397355.xls");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys("D:\\TotalBS\\data\\Aetna_1.xls");
    
    Thread.sleep(5000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_next"))).click();
    Thread.sleep(5000);
//    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sheet_option"))).click();       
    }
    @Test(groups = {"StatementTest"},priority = 7)
    public void Statement_processing_step3_fields_prev_button_functionality()throws InterruptedException { 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_prev"))).click();
    Thread.sleep(4000);
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    Thread.sleep(2000);
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys("C:\\Users\\reena.sharma\\Desktop\\Aetna_00002533274790397355.xls");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys("D:\\TotalBS\\data\\Aetna_1.xls");
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_next"))).click();
    Thread.sleep(5000);    
    }
    @Test(groups = {"StatementTest"},priority = 8)
    public void Statement_processing_step3_fields_cancel_button_functionality()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_Cancel"))).click();
    Thread.sleep(5000);
    }  
    @Test(groups = {"StatementTest"},priority = 9)
    public void Statement_processing_step3_fields_Next_button_functionality()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("imp_new_carrier_st_new"))).click();
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Import_listCarrier"))).click();
    driver.findElement(By.cssSelector("option[value=\"1\"]")).click();
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Import_listCarrier_rec"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_date"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_date"))).sendKeys("11/18/2014");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_notes"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_notes"))).sendKeys("Test Notes, Test Notes");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step1_next"))).click();
    Thread.sleep(3000);
   // driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).clear();
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys("C:\\Users\\reena.sharma\\Desktop\\Aetna_00002533274790397355.xls");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys("D:\\TotalBS\\data\\Aetna_1.xls");
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_next"))).click();
    Thread.sleep(5000);
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sheet_option"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_next"))).click();
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    } 
    @Test(groups = {"StatementTest"},priority = 10)
    public void Statement_processing_step4_fields_prev_button_functionality()throws InterruptedException { 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step4_prev"))).click();
    Thread.sleep(4000);
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_next"))).click();
    Thread.sleep(5000);    
    }
    @Test(groups = {"StatementTest"},priority = 11)
    public void Statement_processing_step4_fields_cancel_button_functionality()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step4_Cancel"))).click();
    Thread.sleep(5000);
    }  
    @Test(groups = {"StatementTest"},priority = 12)
    public void Statement_processing_step4_fields_finish_button_functionality()throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("imp_new_carrier_st_new"))).click();
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Import_listCarrier"))).click();
    driver.findElement(By.cssSelector("option[value=\"1\"]")).click();    
//driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Import_listCarrier_rec"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_date"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_date"))).sendKeys("11/18/2014");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_notes"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_notes"))).sendKeys("Test Notes, Test Notes");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step1_next"))).click();
    Thread.sleep(3000);
  //  driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).clear();
    //driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys("C:\\Users\\reena.sharma\\Desktop\\Aetna_00002533274790397355.xls");
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("file_upload"))).sendKeys("D:\\TotalBS\\data\\Aetna_1.xls");
    Thread.sleep(5000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_next"))).click();
    Thread.sleep(5000);
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("sheet_option"))).click();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step_next"))).click();
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("st_step4_finish"))).click();
    Assert.assertEquals("Statement Import Wizard", driver.getTitle());
    String st_text = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("status_text"))).getText();
    Assert.assertEquals("We will send the Acknowledgement on register email Id.",st_text);
    
    ob1.logout();             
    }
      
}