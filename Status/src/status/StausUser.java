/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * june 26th
 * @author srinivsi
 * @modifier Jagdeep Singh
 */
public class StausUser 
     
{
           //created a ENUM
    
   public void statusDetail(String code)
{           // Changing string code to enum
    
switch(code.toUpperCase())
        {
        case "ZERO": 
           
        System.out.println("REJECTED");
        break;
        case "ONE": 
            System.out.println("PENDING");
        break;
        case "TWO":
            System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
            System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
