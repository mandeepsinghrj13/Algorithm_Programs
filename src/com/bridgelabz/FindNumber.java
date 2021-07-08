package com.bridgelabz;
import java.util.Scanner;
public class FindNumber 
{
	public static void main(String[] args) 
	{
        System.out.println("Think of a number");
        Scanner scan = new Scanner(System.in);
        String x = null;
        String y = null;
        String i = null;
        //Get the input from the player
        System.out.println("Please your maximum value");

        if (scan.hasNext()) 
        {
            x = scan.next();
        }

        System.out.println("Please input your min value");
        if (scan.hasNext()) 
        {
            y = scan.next();
        }

        
        int max = Integer.parseInt(x);
        int min = Integer.parseInt(y);

        boolean numberguessed = true; 
        int numberofRounds = 0;

        while(numberguessed) 
        {
            int midpoint = (max+min)/2;

            numberofRounds++;

            System.out.println("Is your number " + midpoint + " please say too low or too high or correct");
             if (scan.hasNext()) 
             {
                 i = scan.next();
             }
             if (i.equalsIgnoreCase("too high")) 
             {
                 min = midpoint;
             }
             if (i.equalsIgnoreCase("too low")) 
             {
                 max = midpoint;
                 min = 0;
             }
             if (i.equalsIgnoreCase("correct")) 
             {
                 System.out.println("the number of rounds in this game is" + numberofRounds);
                 break;
             }

        }

    }
}