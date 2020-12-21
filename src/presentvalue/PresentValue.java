
package presentvalue;

import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 4
 * Date:  10/16/2020
 * Description: Create a program that calculates the future value of an account based upon interest growth on present value. 
 * Purpose: Practice using methods & passing data.
 */
public class PresentValue {
    
    public static double presentValue(double futureValue, double annualInterestRate, double numberOfYears)
    {
       annualInterestRate = annualInterestRate / 100;
       double presentValue;
       presentValue = futureValue / Math.pow((1 + annualInterestRate), numberOfYears);
       return presentValue;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double userFutureValue;
        double userInterestRate;
        double userNumYears;
        
        System.out.println("How much money do you want to save?");
        userFutureValue = keyboard.nextDouble(); 
        
        System.out.println("What is the bank's interest rate percentage? (no decimals)");
        userInterestRate = keyboard.nextDouble();
        
        System.out.println("How many years do you plan to accumulate savings?");
        userNumYears = keyboard.nextDouble();    
        
        System.out.printf("You need to deposit $%,.2f today to achieve your goal.\n", presentValue(userFutureValue, userInterestRate, userNumYears));
    }
    
}
