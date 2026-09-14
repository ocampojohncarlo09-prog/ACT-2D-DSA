/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.MsConnectAccess;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class calcu {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Obusan, Jimwell: ");
        System.out.println("Enter a number: ");
        int y = input.nextInt();
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        
        int sum, diff, prod, quot;
        
        sum = x + y;
        diff = x - y;
        prod = x * y;
        quot = x / y;
        
        System.out.println("Sum is: " + sum);
        System.out.println("Diff is: " + diff);
        System.out.println("Prod is: " + prod);
        System.out.println("Quot is: " + quot);
        
    }
}
