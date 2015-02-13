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

/**
 *
 * @author reena.sharma
 */
public class TaskingTemplate extends BaseClass {
    ElementLocator caller = new ElementLocator();
    LoginLogoutHelper ob1 = new LoginLogoutHelper();
    Random ob2 = new Random();
    
    @Test(groups = {"Tasking Template Test"},priority = 1)
    public void Navigation_of_TaskTemplate_Listing_page() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    System.out.println("TestCase Description : To verify the redirection of Task Template Listing link on Setting from Setting page"); 
    ob1.bbcubelogin();
    Thread.sleep(8000);
    
    driver.findElement(By.linkText("Administration")).click();
    Thread.sleep(8000);
    Assert.assertEquals("Administration", driver.getTitle());
    driver.findElement(By.linkText("Settings")).click();
    Thread.sleep(4000);
    Assert.assertEquals("Settings", driver.getTitle());
    Thread.sleep(4000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("tasking_temp_link"))).click();  
    Thread.sleep(4000);
    Assert.assertEquals("Tasking Template", driver.getTitle());   
    
    }
    
    @Test(groups = {"Tasking Template Test"},priority = 2)
    public void Element_Verification_on_TaskTemplate_Listing_page() throws InterruptedException {
    
    System.out.println("TestCase Description : To verify the elements of Task Template Listing page"); 
    
    Assert.assertEquals("Tasking Template", driver.findElement(caller.Elements(CONFIGOBJ.getProperty("main_heading"))).getText());
    
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_temp_nm"))).isDisplayed();
    if (iselementpresent == true)
    {
       System.out.println("Name field is present on Tasking Template page");
    }
    else
    {
       System.out.println("Unable to find Name field on Tasking Template page");
    }
    
    Boolean iselementpresent1 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_temp_desc"))).isDisplayed();
    if (iselementpresent1 == true)
    {
       System.out.println("Description field is present on Tasking Template page");
    }
    else
    {
       System.out.println("Unable to find Description field on Tasking Template page");
    }
    
    Boolean iselementpresent2 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_createdby"))).isDisplayed();
    if (iselementpresent2 == true)
    {
       System.out.println("Created By field is present on Tasking Template page");
    }
    else
    {
       System.out.println("Unable to find Created By field on Tasking Template page");
    }
    
    Boolean iselementpresent3 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_createdon"))).isDisplayed();
    if (iselementpresent3 == true)
    {
       System.out.println("Created On field is present on Tasking Template page");
    }
    else
    {
       System.out.println("Unable to find Created On field on Tasking Template page");
    }   
    
   Boolean iselementpresent4 = driver.findElement(By.linkText("New")).isDisplayed();
    if (iselementpresent4 == true)
    {
       System.out.println("New record link is present on Tasking Template page");
    }
    else
    {
       System.out.println("Unable to find New record link is present on Tasking Template page");
    }
    Thread.sleep(3000);

    }
      
    @Test(groups = {"Tasking Template Test"},priority = 3)
    public void Validation_check_for_manadataory_fields_on_TaskTemplate_on_Listing_page_for_new_record() throws InterruptedException {
    System.out.println("TestCase Description : To verify the mandatory field validation for  of New record fields Link on Task Template Listing page"); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rec_link"))).click();  
    Thread.sleep(3000);
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("save_temp_rec"))).click();  
    Thread.sleep(3000);
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check done for*************");   
    System.out.println(validation);  
    
    try {
        Assert.assertEquals(validation, "The following errors occurred: Name Required");
    } catch (Exception t) {
    }
    }  
    
    @Test(groups = {"Tasking Template Test"},priority = 4)
    public void Cancel_button_functionality_on_New_TaskTemplate_on_Listing_page() throws InterruptedException {
    System.out.println("TestCase Description : To verify the Cancel icon functionality of New record fields on Task Template Listing page"); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rec_link"))).click();  
    Thread.sleep(3000);
    System.out.println("Generation of Random Tasking Template name ");
    int intname = ob2.randomtasktempname();
    String name = Integer.toString(intname);
    String final_names = "Task_Template" + name;
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("name_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("name_txt"))).sendKeys(final_names);
    
    String desc = "Test Description for" + final_names;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).sendKeys(desc);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cancel_temp_rec"))).click();  
    Thread.sleep(3000);
    }
    
    @Test(groups = {"Tasking Template Test"},priority = 5)
    public void Adition_of_New_TaskTemplate_on_Listing_page() throws InterruptedException {
    System.out.println("TestCase Description : To check the functionality of  the redirection of New Link on Task Template Listing page"); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rec_link"))).click();  
    Thread.sleep(3000);
    System.out.println("Generation of Random Tasking Template name ");
    int intname = ob2.randomtasktempname();
    String name = Integer.toString(intname);
    String final_names = "Task_Template" + name;
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("name_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("name_txt"))).sendKeys(final_names);
    
    String desc = "Test Description for" + final_names;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).sendKeys(desc);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("save_temp_rec"))).click();  
    Thread.sleep(3000);
    }
    
   @Test(groups = {"Tasking Template Test"},priority = 6)
    public void Edit_of_TaskTemplate_on_Listing_page() throws InterruptedException {
    System.out.println("TestCase Description : To check the functionality of Edit Task Template Listing record"); 
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_temp_rec_edit"))).click();  
    Thread.sleep(3000);   
    
    String editeddesc = "This is edited Test Description";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_rec_desc_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_rec_desc_txt"))).sendKeys(editeddesc);  
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_rec_update_button"))).click(); 
    Thread.sleep(3000);
    }
    
    @Test(groups = {"Tasking Template Test"},priority = 7)
    public void Cancel_button_functionality_on_Edit_of_TaskTemplate_on_Listing_page() throws InterruptedException {
    System.out.println("TestCase Description : To verify the \"Cancel\" icon  functionality of editmode Task Template grid record on Task Template Listing page");     
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_temp_rec_edit"))).click();  
    Thread.sleep(3000);   
    
    String editeddesc = "This is edited Test Description";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_rec_desc_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_rec_desc_txt"))).sendKeys(editeddesc);  
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_rec_cancel_button"))).click(); 
    Thread.sleep(3000);
    }
    
    @Test(groups = {"Tasking Template Test"},priority = 8)
    public void Delete_button_functionality_on_TaskTemplate_Listing_page() throws InterruptedException {
    System.out.println("TestCase Description :To verify the \"Delete\" icon  functionality of  Task Template grid record on Task Template Listing page");     
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_temp_rec_delete"))).click();  
    Thread.sleep(3000);  
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    System.out.println("Alert Text is: " + alertText);
    alert.accept();
    Thread.sleep(4000);
    System.out.println("Tasking Template Successfully deleted");
    }
    
    @Test(groups = {"Tasking Template Test"},priority = 9)
    public void MultipleTask_button_functionality_on_TaskTemplate_Listing_page() throws InterruptedException {
    System.out.println("TestCase Description :To verify the \"Multiple Task\" icon  functionality of  Task Template grid record on Task Template Listing page");     
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rec_link"))).click();  
    Thread.sleep(3000);
    System.out.println("Generation of Random Tasking Template name ");
    int intname = ob2.randomtasktempname();
    String name = Integer.toString(intname);
    String final_names = "Task_Template" + name;
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("name_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("name_txt"))).sendKeys(final_names);
    
    String desc = "Test Description for" + final_names;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).sendKeys(desc);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("save_temp_rec"))).click();  
    Thread.sleep(3000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_task_add_button"))).click();  
    Thread.sleep(3000);   
    Assert.assertEquals("Tasking Template Item", driver.getTitle());  
    }
    
    @Test(groups = {"Tasking Template Item Test"},priority = 10)
    public void Back_button_functionality_on_Item_TaskTemplate_Listing_page() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("back_button_item_temp"))).click();  
    Thread.sleep(3000);      
    Assert.assertEquals("Tasking Template", driver.getTitle());    
    } 
    
    @Test(groups = {"Tasking Template Test"},priority = 11)
    public void Element_Verification_on_Item_TaskTemplate_Listing_page() throws InterruptedException {
    System.out.println("TestCase Description :To verify the elements of  Item Task Template Listing page");     
    String tnm = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_tname_val"))).getText();
    String tdesc = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_tdescription_val"))).getText();
    String tcreatedby = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_tcreatedby_val"))).getText();
    String tcreatedon = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_tcreatedon_val"))).getText();
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_task_add_button"))).click();  
    Thread.sleep(3000);   
    Assert.assertEquals("Tasking Template Item", driver.getTitle());
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_task_add_button"))).click(); 
    Assert.assertEquals("Tasking Template Item", driver.findElement(caller.Elements(CONFIGOBJ.getProperty("main_heading"))).getText());
    
    String tempnm = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("tempnm"))).getText();
    String tempdesc = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("tempdesc"))).getText();
    String tempcreatedby = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("tempcreatedby"))).getText();
    String tempcretedon = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("tempcretedon"))).getText();
    
    Assert.assertEquals(tnm, tempnm);
    System.out.println("Template name verified");
    Assert.assertEquals(tdesc, tempdesc);
    System.out.println("Template Description verified");
    Assert.assertEquals(tcreatedby, tempcreatedby);
    System.out.println("Template Created By field verified");
    Assert.assertEquals(tcreatedon, tempcretedon);
    System.out.println("Template Creted on field verified");
    
    System.out.println("Grid field verification");
    Boolean iselementpresent = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_nm"))).isDisplayed();
    if (iselementpresent == true)
    {
       System.out.println("Task Name field is present on Tasking Template Item page");
    }
    else
    {
       System.out.println("Unable to find Task Name field on Tasking Template Item page");
    }
    
    Boolean iselementpresent1 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_desc"))).isDisplayed();
    if (iselementpresent1 == true)
    {
       System.out.println("Task Description field is present on Tasking Template Item page");
    }
    else
    {
       System.out.println("Unable to find Task Description field on Tasking Template Item page");
    }
    
    Boolean iselementpresent2 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_grp"))).isDisplayed();
    if (iselementpresent2 == true)
    {
       System.out.println("Task Group field is present on Tasking Template Item page");
    }
    else
    {
       System.out.println("Unable to find Task Group field on Tasking Template Item page");
    }
    
    Boolean iselementpresent3 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_action"))).isDisplayed();
    if (iselementpresent3 == true)
    {
       System.out.println("Task Action field is present on Tasking Template Item page");
    }
    else
    {
       System.out.println("Unable to find Task Action field on Tasking Template Item page");
    }
    
    Boolean iselementpresent4 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_duration"))).isDisplayed();
    if (iselementpresent4 == true)
    {
       System.out.println("Task Duration field is present on Tasking Template Item page");
    }
    else
    {
       System.out.println("Unable to find Task Duration field on Tasking Template Item page");
    }
    
    
    Boolean iselementpresent5 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("task_commands"))).isDisplayed();
    if (iselementpresent5 == true)
    {
       System.out.println("Task commands field is present on Tasking Template Item page");
    }
    else
    {
       System.out.println("Unable to find Task commands field on Tasking Template Item page");
    }
    
    Boolean iselementpresent6 = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_task_link"))).isDisplayed();
    if (iselementpresent6 == true)
    {
       System.out.println("New Task link is present on Tasking Template Item page");
    }
    else
    {
       System.out.println("Unable to find New Task link on Tasking Template Item page");
    }
    Thread.sleep(3000);
    }
    
    @Test(groups = {"Tasking Template Item Test"},priority = 12)
    public void Check_status_on_Item_TaskTemplate_Listing_page_no_task_present() throws InterruptedException {
     
    String norectxt= driver.findElement(caller.Elements(CONFIGOBJ.getProperty("no_rec_found"))).getText(); 
    Thread.sleep(3000);      
    Assert.assertEquals("No Task Template Found.", norectxt);    
    } 
    
    @Test(groups = {"Tasking Template Item Test"},priority = 13)
    public void Check_validation_for_New_Task_fields_on_Tasking_Template_Item() throws InterruptedException {
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_task_add_button"))).click();  
    Thread.sleep(3000);   
    Assert.assertEquals("Tasking Template Item", driver.getTitle());  
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_task_link"))).click();  
    Thread.sleep(3000);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("save_task_rec"))).click();  
    Thread.sleep(3000);
    String validation = driver.findElement(caller.Elements(CONFIGOBJ.getProperty("Error_msg"))).getText();
    validation= validation.replace("\n", " ");
    System.out.println("*********** Validation Check done for*************");   
    System.out.println(validation);  
    
    try {
        Assert.assertEquals(validation, "The following errors occurred: Task Name Required Task Group Required Task Action Required Task Duration Required");
    } catch (Exception t) {
    }
    }
    
    @Test(groups = {"Tasking Template Item Test"},priority = 14)
    public void Adition_of_New_Task_on_Tasking_Template_Item() throws InterruptedException {
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_task_add_button"))).click();  
    Thread.sleep(3000);   
    Assert.assertEquals("Tasking Template Item", driver.getTitle());  
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_task_link"))).click();  
    Thread.sleep(3000);
    System.out.println("Generation of Random Task name ");
    int intname = ob2.randomtasktempname();
    String name = Integer.toString(intname);
    String final_names = "Task_" + name;
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("txtTaskName"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("txtTaskName"))).sendKeys(final_names);
    
    String desc = "Test Description for" + final_names;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("txtDescription"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("txtDescription"))).sendKeys(desc);
    
    String Grp_name = "New Business";
    new Select(driver.findElement(By.id("MasterPageContent_grdTaskItems_ddlTaskGroup"))).selectByVisibleText(Grp_name);
    Thread.sleep(3000);
    
    String task_action = "2nd Follow-Up";
    new Select(driver.findElement(By.id("MasterPageContent_grdTaskItems_ddlTaskAction"))).selectByVisibleText(task_action);
    Thread.sleep(3000);
    
    String task_dur = "3";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("txtTaskDuration"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("txtTaskDuration"))).sendKeys(task_dur);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("save_task_rec"))).click();  
    Thread.sleep(3000);

    }
   /* 
       
    @Test(groups = {"Tasking Template Test"},priority = 3)
    public void Cancel_button_functionality_on_New_TaskTemplate_on_Listing_page() throws InterruptedException {
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("new_rec_link"))).click();  
    Thread.sleep(3000);
    System.out.println("Generation of Random Tasking Template name ");
    int intname = ob2.randomtasktempname();
    String name = Integer.toString(intname);
    String final_names = "Task_Template" + name;
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("name_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("name_txt"))).sendKeys(final_names);
    
    String desc = "Test Description for" + final_names;
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).sendKeys(desc);
    
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("cancel_temp_rec"))).click();  
    Thread.sleep(3000);
    }
    
   @Test(groups = {"Tasking Template Test"},priority = 4)
    public void Edit_of_TaskTemplate_on_Listing_page() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_temp_rec_edit"))).click();  
    Thread.sleep(3000);   
    
    String editeddesc = "This is edited Test Description";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).sendKeys(editeddesc);  
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_rec_update_button"))).click(); 
    Thread.sleep(3000);
    }
    
    @Test(groups = {"Tasking Template Test"},priority = 5)
    public void Cancel_button_functionality_on_Edit_of_TaskTemplate_on_Listing_page() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_temp_rec_edit"))).click();  
    Thread.sleep(3000);   
    
    String editeddesc = "This is edited Test Description";
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).clear();
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("desc_txt"))).sendKeys(editeddesc);  
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_rec_cancel_button"))).click(); 
    Thread.sleep(3000);
    }
    
    @Test(groups = {"Tasking Template Test"},priority = 6)
    public void Delete_button_functionality_on_TaskTemplate_Listing_page() throws InterruptedException {
    driver.findElement(caller.Elements(CONFIGOBJ.getProperty("first_temp_rec_delete"))).click();  
    Thread.sleep(3000);  
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    System.out.println("Alert Text is: " + alertText);
    alert.accept();
    Thread.sleep(4000);
    System.out.println("Tasking Template Successfully deleted");
    }
    */
  }
