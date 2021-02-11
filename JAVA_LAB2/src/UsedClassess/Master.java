/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsedClassess;

import java.awt.TextField;

/**
 *
 * @author Kwizera
 */
public class Master {
    public boolean CheckEmail(String email)
    {
        email=email.toLowerCase();
        boolean check=false;
        String[] domainnames={"@gmail.com","@yahoo.com","@hotmail.com"};
        if(email.endsWith(domainnames[0]) ||email.endsWith(domainnames[1])|| email.endsWith(domainnames[2]) )
        {
            check=true;
        }
        String[] numbers={"0","1","2","3","4","5","6","7","8","9"};
        for(String number:numbers)
        {
            if(email.startsWith(number))
                check=false;
        }
        return check;
    }
    public int GetStringLength(String txt)
    {
        int StringLength;
        StringLength=txt.length();
        return StringLength;
    }
    public String ChangeToUpper(String txt)
    {
       return txt.toUpperCase();
    }
       public boolean IsTextfieldEmpty(String Txt)
    {
       return(!Txt.isEmpty());
    }
    
}
