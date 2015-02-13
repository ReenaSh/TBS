/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Actions;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import runThrghTestNG.BaseClass;

/**

 * @author reena.sharma
 */
public class Fileuploader extends BaseClass{
    
   // Cube login should redirect user to BBcube portal 
    public static void setClipboardData(String string) {
   StringSelection stringSelection = new StringSelection(string);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
}
}