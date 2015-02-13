/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runThrghTestNG.BaseClass;

/**
 *
 * @author ashish.shukla
 */
public class HTTP_CODE_VERIFY extends BaseClass {
    
public boolean HTTP_CODES(String code)
             
//this function asserts that http code is not displayed...
    {
                    
    List<WebElement> Elements = driver.findElements(By.xpath("//*[contains(text()," + "'" + code + "'" + ")]"));
        
        int elementNo = Elements.size();
        boolean act = (elementNo ==0);
        return(act);
    }
    
    
    
}
