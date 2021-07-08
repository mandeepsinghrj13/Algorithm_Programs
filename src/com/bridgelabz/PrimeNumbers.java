package com.bridgelabz;
import java.util.Scanner;
public class PrimeNumbers 
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     //  variables
     int a, b, i, j, flag;

     System.out.printf("Enter lower bound of the interval: ");
     a = sc.nextInt(); 

     System.out.printf("\nEnter upper bound of the interval: ");
     b = sc.nextInt();

     System.out.printf("\nPrime numbers between %d and %d are: \n", a, b);

     for (i = a; i <= b; i++)
     {
         // Skip 0 and 1         
         if (i == 1 || i == 0)
             continue;

         // flag = 1 means i is prime
         flag = 1;

         for (j = 2; j <= i / 2; ++j) 
         {
             if (i % j == 0) 
             {           	 
                 flag = 0; // flag = 0 means i is not prime
                 break;
             }
         }        
         if (flag == 1)// flag = 1 means i is prime
             System.out.println(i);
     }
 }
 
}