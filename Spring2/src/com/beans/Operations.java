package com.beans;
import java.io.Serializable;
import java.util.Scanner;

public class Operations implements Serializable
{
	
	private int first;
	private int last;
	
	
	public int getFirst() 
	{
		return first;
	}
	
	public void setFirst(int first)
	{
		this.first = first;
	}
	
	public int getLast() 
	{
		return last;
	}
	
	public void setLast(int last)
	{
		this.last = last;
	}
	public int getEvenSum()
	{
		int esum=0;
		System.out.println("The even number from the limit is:");
        if(first%2!=0)
        {
       	 
       	 first++;
       	  
        }
        for(int i = first; i <=last; i+=2)
        {
    
       	 System.out.println(i);    
       	 
       	 esum+=i;
        }
    
		return esum;
		
		
		
	}
	public int getOddSum()
	{
		 System.out.println("the odd number is:");
         int osum=0;
         if(first%2==0)
         {
        	 
        	 first++;
        	  
         }
         for(int i = first; i <= last; i+=2)
         {
     
        	 System.out.println(i);    
        	 osum+=i;
         }
         
         return osum;
	}
	public int getPrimeSum()
	{
		int flag=0,count=0;
		 System.out.println ("The prime numbers in between the entered limits are :");
         for(int i = first; i <= last; i++)
         {
             for( int j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     
                     break;
                 }
                 else
                 {
                	 
                     flag = 1;
                   
                 }
             }
             if(flag == 1)
             {
                 
            	 
                 System.out.println(i);
                 count++;
             }
            
         }
         return count;

}
}
