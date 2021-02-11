/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Kwizera Claude
Kamikazi Abijuru Marry Cyntia
Isingizwe Clarisse
*/
package java_lab2.USEDCLASSES;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kwizera
 */
public class MasterClass {
   public boolean checkEmail(String email)
   {
       boolean check=false;
      String[] Emails={"@gmail.com", "@yahoo.com","@hotmail.com"};
      email=email.toLowerCase();
      String[] num={"0","1","2","3","4","5","6","7","8","9"};  
      if(email.endsWith(Emails[0])||email.endsWith(Emails[1])||email.endsWith(Emails[2]))
      check=true;
      for(String n:num)
          {
             if(email.startsWith(n))
             {
                 check=false;
             }
          }
      
    
      
return check;
   }
  public int getStringLength(String txt)
   {
   return txt.length();
   }
  public String changeToUpper(String txt)
  {
      return txt.toUpperCase();
  }
    
}
