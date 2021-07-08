package com.bridgelabz;
public class BubbleString 
{
	public static void main(String args[])
	{
		int i,j,n;
		String str[]= {"B","A","E","F","C"};
		String temp;
		n=str.length;
		System.out.println("String before sorted :");
		for(i=0;i<n;i++)
		{
		System.out.println(str[i]);
		}
		
		System.out.println("Sorted  String Elements :");
		
        for(i=0;i<n;i++)
        {
        	for(j=i+1;j<n;j++)
        	{
        		if(str[i].compareTo(str[j])>0)
        		{
        			temp = str[i];
        			str[i]= str[j];
        			str[j]=temp;
        		}
        	}        	
        	System.out.println(str[i]);
        }                
	}
}