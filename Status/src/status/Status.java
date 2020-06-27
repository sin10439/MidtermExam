/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * Use enumerators to avoid input errors
 * and print the status details. 
 * @author srinivsi date:June 26th
 * @modifier  Jagdeep Singh
 */
public class Status {
public enum stat{Rejected ,Pending ,Processing ,Approved}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        stat zero = stat.Rejected;
        stat one = stat.Pending;
        stat two = stat.Processing;
        stat three = stat.Approved;
        
  
    System.out.println("For zero :" + zero);
    System.out.println("For one :" + one);
    System.out.println("For two :" + two);
    System.out.println("For three :" + three);
    
    
  }
}