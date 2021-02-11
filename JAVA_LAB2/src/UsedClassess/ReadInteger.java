/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsedClassess;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kwizera
 */
public class ReadInteger {
    public static void main(String[] args)
    {
        System.out.println("Enter the numbers and stop by typing stop");
        Scanner input=new Scanner(System.in);
        int sum=0;
        
        ArrayList<Integer> All_numbers=new ArrayList<Integer>();
        while(true)
        {
         String number=input.nextLine();
         if(!number.equals("stop"))
         {
          All_numbers.add(Integer.parseInt(number));
         }
         else
         {
             for(int numbers:All_numbers)
             {
               sum+=numbers;  

             }
         System.out.println("The number entered are: ");
         for(int numbers:All_numbers)
             {
             
             System.out.println(numbers);
             
             }
         
            System.out.println("The sum of the Entered numbers is "+sum);
            System.out.println("The average of the Entered numbers is :"+sum/All_numbers.size());
               
            break;
        }
        }
        
        
        
     
    }
}
